package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.impl;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.NbDeFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ServiceStatsQuestionnaireMockCorrect;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ServiceStatsQuestionnaireMockIdQuestionnaireInccorect;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ServiceStatsQuestionnaireMockNbDeFoisJoueQuestionnaireIncorrect;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StatistiquesQuestionnaireImplTest {

    @Test
    public void statsQuestionnaireCorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {


        IServiceQuestion ISQ = new ServiceStatsQuestionnaireMockCorrect();

        //creation d'un QuestionnaireDTO
        ArrayList<QuestionDTO> listeQuestions = new ArrayList<QuestionDTO>();
        QuestionDTO questionDTO = new QuestionDTO(1,1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"Le joueur devant taper sa balle sur le départ peut la poser sur une cheville de bois ou de plastique appelée tee, qui ne peut pas être utilisée en dehors des départs. L'utilité d'un tee est de surélever la balle pour faciliter l'utilisation de clubs de golf spéciaux","https://fr.wikipedia.org/wiki/Mat%C3%A9riel_de_golf", new StatsQuestionDTO(0,0));
        questionDTO.getStatsQuestion().setNbOK(2);
        questionDTO.getStatsQuestion().setNbJouer(5);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        listeQuestions.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions);
        questionnaireDTO.setNbDeFoisJoueQuestionnaire(5);

        ISQ.fournirStatsQuestions()
        public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws IdQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {
            ArrayList<QuestionDTO> statsQuestions = new ArrayList<QuestionDTO>();
            StatsQuestionDTO statsQuestionsDTO = new StatsQuestionDTO(5,2);
//            statsQuestionsDTO.setNbDeReussiteQuestion(2);
//            statsQuestionsDTO.setNbDeFoisJoueQuestion(5);
            statsQuestions.add(statsQuestionsDTO);
            statsQuestions.add(new StatsQuestionDTO(5,2));
        }


        @Test
        public void idQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {

            IServiceQuestion ISQ2 = new ServiceStatsQuestionnaireMockIdQuestionnaireInccorect();

            //creation d'un QuestionnaireDTO
            ArrayList<QuestionDTO> listeQuestions2 = new ArrayList<QuestionDTO>();
            QuestionDTO questionDTOt2 = new QuestionDTO(1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1);
            questionDTO.getStatsQuestion().setNbOK(2);
            questionDTO.getStatsQuestion().setNbJouer(5);
            listeQuestions.add(questionDTO);
            listeQuestions.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
            listeQuestions.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
            QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(-1, listeQuestions);
            questionnaireDTO.setNbDeFoisJoueQuestionnaire(5);

            Assertions.assertThrows(IdQuestionnaireIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO));
        }


    }

    @Test
    public void nbDeFoisJoueQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {

        IServiceQuestion ISQ3 = new ServiceStatsQuestionnaireMockNbDeFoisJoueQuestionnaireIncorrect();

        //creation d'un QuestionnaireDTO
        ArrayList<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"Le joueur devant taper sa balle sur le départ peut la poser sur une cheville de bois ou de plastique appelée tee, qui ne peut pas être utilisée en dehors des départs. L'utilité d'un tee est de surélever la balle pour faciliter l'utilisation de clubs de golf spéciaux","https://fr.wikipedia.org/wiki/Mat%C3%A9riel_de_golf", new StatsQuestionDTO(0,0));
        questionDTO.getStatsQuestion().setNbOK(2);
        questionDTO.getStatsQuestion().setNbJouer(5);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(1,2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"Le joueur devant taper sa balle sur le départ peut la poser sur une cheville de bois ou de plastique appelée tee, qui ne peut pas être utilisée en dehors des départs. L'utilité d'un tee est de surélever la balle pour faciliter l'utilisation de clubs de golf spéciaux","https://fr.wikipedia.org/wiki/Mat%C3%A9riel_de_golf", new StatsQuestionDTO(0,0)));
        listeQuestions.add(new QuestionDTO(1,3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"Le joueur devant taper sa balle sur le départ peut la poser sur une cheville de bois ou de plastique appelée tee, qui ne peut pas être utilisée en dehors des départs. L'utilité d'un tee est de surélever la balle pour faciliter l'utilisation de clubs de golf spéciaux","https://fr.wikipedia.org/wiki/Mat%C3%A9riel_de_golf", new StatsQuestionDTO(0,0)));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions);
        questionnaireDTO.setNbDeFoisJoueQuestionnaire(-5);

        Assertions.assertThrows(NbDeFoisJoueQuestionnaireIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO));
    }



}
