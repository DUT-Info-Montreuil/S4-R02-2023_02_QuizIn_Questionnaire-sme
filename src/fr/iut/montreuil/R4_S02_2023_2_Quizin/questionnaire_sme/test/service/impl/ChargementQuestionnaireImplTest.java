package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.impl;



import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierIncorrectExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierPasTrouveExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierVideExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ChargementQuestionnaireMockIncorrect;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ChargementQuestionnaireMockNonInvalide;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ChargementQuestionnaireMockOk;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ChargementQuestionnaireVide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ChargementQuestionnaireImplTest {
    private IServiceQuestion serviceQuestionnaireTest;
    @Test
    public void chargementQuestionnaireCorrect() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions {
        serviceQuestionnaireTest = new ChargementQuestionnaireMockOk();
        QuestionDTO questionCorrect = new QuestionDTO(1,1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"Le joueur devant taper sa balle sur le départ peut la poser sur une cheville de bois ou de plastique appelée tee, qui ne peut pas être utilisée en dehors des départs. L'utilité d'un tee est de surélever la balle pour faciliter l'utilisation de clubs de golf spéciaux","https://fr.wikipedia.org/wiki/Mat%C3%A9riel_de_golf"
        );
        List<QuestionDTO> listQuestionsCorrect = new ArrayList<QuestionDTO>();
        listQuestionsCorrect.add(questionCorrect);
        QuestionnaireDTO leQuestionnaireCorrect = new QuestionnaireDTO((ArrayList<QuestionDTO>) listQuestionsCorrect);
        List<QuestionnaireDTO> reponseCorrect = new ArrayList<QuestionnaireDTO>();
        reponseCorrect.add(leQuestionnaireCorrect);
        List<QuestionnaireDTO> bonnereponse = serviceQuestionnaireTest.chargerListeQuestion("chargementCorrect.csv");
        Assertions.assertEquals(leQuestionnaireCorrect.getQuestions().get(0).getReponse(),bonnereponse.get(0).getQuestions().get(0).getReponse());
        Assertions.assertEquals(leQuestionnaireCorrect.getQuestions().get(0).getLibelle(),bonnereponse.get(0).getQuestions().get(0).getLibelle());

    }

    @Test
    public void chargementQuestionnaireIncorrect() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ChargementQuestionnaireMockIncorrect();
        // QuestionDTO questionIncorrectAttendu = new QuestionDTO("De quel petit objet se munit le golfeur pour surelever sa balle avant de la frapper ",null);
        //serviceQuestionnaireTest.chargerListeQuestionnaire("chargementIncorrect.csv");
        Assertions.assertThrows(FichierIncorrectExceptions.class, ()->
                serviceQuestionnaireTest.chargerListeQuestion("chargementIncorrect.csv"),"Valeur incorrect ou manquante");

    }

    @Test
    public void chargementQuestionnaireVide() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ChargementQuestionnaireVide();
        Assertions.assertThrows(FichierVideExceptions.class, ()->
                serviceQuestionnaireTest.chargerListeQuestion("chargementVide.csv"),"Nom du fichier incorrect ou inexistant");
    }

    @Test
    public void chargementQuestionnaireNomInvalide() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ChargementQuestionnaireMockNonInvalide();
        Assertions.assertThrows(FichierPasTrouveExceptions.class, ()->
                serviceQuestionnaireTest.chargerListeQuestion("okok.csv"),"Nom du fichier incorrect ou inexistant");
    }
}


