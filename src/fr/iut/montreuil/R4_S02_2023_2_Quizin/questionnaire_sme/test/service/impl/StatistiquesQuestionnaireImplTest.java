package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.impl;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsQuestionDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StatistiquesQuestionnaireImplTest {

    public void statsQuestionnaireCorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {

        //creation d'un QuestionnaireDTO
        List<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"Le joueur devant taper sa balle sur le départ peut la poser sur une cheville de bois ou de plastique appelée tee, qui ne peut pas être utilisée en dehors des départs. L'utilité d'un tee est de surélever la balle pour faciliter l'utilisation de clubs de golf spéciaux","https://fr.wikipedia.org/wiki/Mat%C3%A9riel_de_golf"
        );
        questionDTO.getStatsQuestions().setNbDeReussiteQuestion(2);
        questionDTO.getStatsQuestions().setNbDeFoisJoueQuestion(5);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        listeQuestions.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions);
        questionnaireDTO.setNbDeFoisJoueQuestionnaire(5);

        //creation d'un BilanStatsDTO
        List<StatsQuestionDTO> statsQuestions = new ArrayList<>();
        StatsQuestionDTO statsQuestionsDTO = new StatsQuestionDTO(5,2);
//        statsQuestionsDTO.setNbDeReussiteQuestion(2);
//        statsQuestionsDTO.setNbDeFoisJoueQuestion(5);
        statsQuestions.add(statsQuestionsDTO);
        statsQuestions.add(new StatsQuestionDTO());
        StatsDTO bilanStatsDTO = new StatsDTO(statsQuestionsDTO,);




    }



    public void idQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
    }


    public void nbDeFoisJoueQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
    }




    public void statsQuestionsIncorrectIncorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
    }





    }