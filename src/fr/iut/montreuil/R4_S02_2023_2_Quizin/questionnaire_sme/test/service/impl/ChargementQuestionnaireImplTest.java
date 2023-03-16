package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.impl;



import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ChargementQuestionnaireMockOk;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ChargementQuestionnaireImplTest {
    private IServiceQuestionnaire serviceQuestionnaireTest;
    @Test
    public void chargementQuestionnaireCorrect() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions {
        serviceQuestionnaireTest = new ServiceQuestionnaireMockCorrect();
        QuestionDTO questionCorrect = new QuestionDTO("De quel petit objet se munit le golfeur pour surelever sa balle avant de la frapper ","Tee");
        List<QuestionDTO> listQuestionsCorrect = new ArrayList<QuestionDTO>();
        listQuestionsCorrect.add(questionCorrect);
        QuestionnaireDTO leQuestionnaireCorrect = new QuestionnaireDTO(listQuestionsCorrect);
        List<QuestionnaireDTO> reponseCorrect = new ArrayList<QuestionnaireDTO>();
        reponseCorrect.add(leQuestionnaireCorrect);
        List<QuestionnaireDTO> bonnereponse = serviceQuestionnaireTest.chargerListeQuestionnaire("chargementCorrect.csv");
        Assertions.assertEquals(leQuestionnaireCorrect.getListeQuestions().get(0).getReponse(),bonnereponse.get(0).getListeQuestions().get(0).getReponse());
        Assertions.assertEquals(leQuestionnaireCorrect.getListeQuestions().get(0).getLibelle(),bonnereponse.get(0).getListeQuestions().get(0).getLibelle());

    }

    @Test
    public void chargementQuestionnaireIncorrect() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ServiceQuestionnaireMockIncorrect();
        // QuestionDTO questionIncorrectAttendu = new QuestionDTO("De quel petit objet se munit le golfeur pour surelever sa balle avant de la frapper ",null);
        //serviceQuestionnaireTest.chargerListeQuestionnaire("chargementIncorrect.csv");
        Assertions.assertThrows(FichierIncorrectExceptions.class, ()->
                serviceQuestionnaireTest.chargerListeQuestionnaire("chargementIncorrect.csv"),"Valeur incorrect ou manquante");

    }

    @Test
    public void chargementQuestionnaireVide() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ServiceQuestionnaireMockVide();
        Assertions.assertThrows(FichierVideExceptions.class, ()->
                serviceQuestionnaireTest.chargerListeQuestionnaire("chargementVide.csv"),"Nom du fichier incorrect ou inexistant");
    }

    @Test
    public void chargementQuestionnaireNomInvalide() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ServiceQuestionnaireMockNomInvalide();
        Assertions.assertThrows(FichierPasTrouveExceptions.class, ()->
                serviceQuestionnaireTest.chargerListeQuestionnaire("okok.csv"),"Nom du fichier incorrect ou inexistant");
    }
}


