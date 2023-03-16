package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.impl;



import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ChargementQuestionnaireMockOk;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ChargementQuestionnaireImplTest {
    @Test
    public List<QuestionnaireDTO> chargementQuestionnaireTestOk(){
        IServiceQuestion serviceatester = new ChargementQuestionnaireMockOk();
        QuestionDTO objetattendue = new QuestionDTO(1, 1,"FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        ArrayList<QuestionDTO> question = new ArrayList<QuestionDTO>();
        question.add(objetattendue);
        QuestionnaireDTO QuestionnaireCorrect = new QuestionnaireDTO(question);
        List<QuestionnaireDTO> reponse = new ArrayList<QuestionnaireDTO>();
        reponse.add(QuestionnaireCorrect);
        return reponse;
    }
    public List<QuestionnaireDTO> chargementQuestionnaireTestVide(){
        IServiceQuestion serviceatester = new ChargementQuestionnaireMockOk();
        QuestionDTO objetattendue = new QuestionDTO(null);
        ArrayList<QuestionDTO> question = new ArrayList<QuestionDTO>();
        question.add(objetattendue);
        QuestionnaireDTO QuestionnaireIncorrect = new QuestionnaireDTO(question);
        List<QuestionnaireDTO> reponse = new ArrayList<QuestionnaireDTO>();
        reponse.add(QuestionnaireIncorrect);
        return reponse;
    }

    public List<QuestionnaireDTO> chargementQuestionnaireTestError(){
        IServiceQuestion serviceatester = new ChargementQuestionnaireMockOk();
        QuestionDTO objetattendue = new QuestionDTO(1,1,"fr","20","Tee",1,"Le joueur devant taper sa balle sur le départ peut la poser sur une cheville de bois ou de plastique appelée tee, qui ne peut pas être utilisée en dehors des départs. L'utilité d'un tee est de surélever la balle pour faciliter l'utilisation de clubs de golf spéciaux","https://fr.wikipedia.org/wiki/Mat%C3%A9riel_de_golf");
        ArrayList<QuestionDTO> question = new ArrayList<QuestionDTO>();
        question.add(objetattendue);
        QuestionnaireDTO QuestionnaireError = new QuestionnaireDTO(question);
        List<QuestionnaireDTO> reponse = new ArrayList<QuestionnaireDTO>();
        reponse.add(QuestionnaireError);
        return reponse;
    }
}


