package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.impl;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ServiceStatsQuestionnaireMockCorrect;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock.ServiceStatsQuestionnaireMockIdQuestionnaireInccorect;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StatistiquesQuestionnaireImplTest {




    @Test
    public void statsQuestionnaireCorrect() throws StatsQuestionsIncorrectExeptions,  IdQuestionnaireIncorrectExeptions {


        IServiceQuestion ISQ = new ServiceStatsQuestionnaireMockCorrect();

        //creation d'un QuestionnaireDTO
        ArrayList<QuestionDTO> listeQuestions = new ArrayList<QuestionDTO>();
        QuestionDTO questionDTO = new QuestionDTO(1, "fr", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "Tee", 1, "Le joueur devant taper sa balle sur le départ peut la poser sur une cheville de bois ou de plastique appelée tee, qui ne peut pas être utilisée en dehors des départs. L'utilité d'un tee est de surélever la balle pour faciliter l'utilisation de clubs de golf spéciaux", "https://fr.wikipedia.org/wiki/Mat%C3%A9riel_de_golf", new StatsQuestionDTO());
        questionDTO.getStatsQuestion().setNbOK(2);
        questionDTO.getStatsQuestion().setNbJouer(5);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(2, "fr", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "Tee", 1 , "ffff", "https://fr.wikipedia.org/wiki/Mat%C3%A9riel_de_golf", new StatsQuestionDTO()));
        listeQuestions.add(new QuestionDTO(3, "fr", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "Tee", 1, "ffff", "hh", new StatsQuestionDTO()));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions);
        questionnaireDTO.setNbJouerQuestionnaire(5);
        ISQ.fournirStatsQuestions(questionnaireDTO);

    }



        @Test
        public void idQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions,  IdQuestionnaireIncorrectExeptions {

            IServiceQuestion ISQ2 = new ServiceStatsQuestionnaireMockIdQuestionnaireInccorect();

            //creation d'un QuestionnaireDTO
            ArrayList<QuestionDTO> listeQuestions2 = new ArrayList<QuestionDTO>();
            QuestionDTO questionDTOt2 = new QuestionDTO(1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1, "","",new StatsQuestionDTO());
            questionDTOt2.getStatsQuestion().setNbOK(2);
            questionDTOt2.getStatsQuestion().setNbJouer(5);
            listeQuestions2.add(questionDTOt2);
            listeQuestions2.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"","", new StatsQuestionDTO()));
            listeQuestions2.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"","",new StatsQuestionDTO()));
            QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(-1, listeQuestions2);
            questionnaireDTO.setNbJouerQuestionnaire(5);


            Assertions.assertThrows(IdQuestionnaireIncorrectExeptions.class, () -> ISQ2.fournirStatsQuestions(questionnaireDTO));
        }

        @Test
        public void statsQuestionsCorrect() {
            IServiceQuestion ISQ = new ServiceStatsQuestionnaireMockCorrect();

            //creation d'un QuestionnaireDTO
            ArrayList<QuestionDTO> listeQuestions = new ArrayList<QuestionDTO>();

            QuestionDTO questionDTOv1 = new QuestionDTO(1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs.","https://fr.wikipedia.org/wiki/Matériel_de_golf", new StatsQuestionDTO());
            questionDTOv1.getStatsQuestion().setNbJouer(2);
            questionDTOv1.getStatsQuestion().setNbOK(0);

            QuestionDTO questionDTOv2 = new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"","", new StatsQuestionDTO());
            questionDTOv1.getStatsQuestion().setNbJouer(3);
            questionDTOv1.getStatsQuestion().setNbOK(3);

            QuestionDTO questionDTOv3 = new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"","",new StatsQuestionDTO());
            questionDTOv1.getStatsQuestion().setNbJouer(5);
            questionDTOv1.getStatsQuestion().setNbOK(5);

            listeQuestions.add(questionDTOv1);
            listeQuestions.add(questionDTOv2);
            listeQuestions.add(questionDTOv3);

            StatsDTO testBilanStat(listeQuestions, 10, 1);



//            Assertions.assertEquals();

        }

}




