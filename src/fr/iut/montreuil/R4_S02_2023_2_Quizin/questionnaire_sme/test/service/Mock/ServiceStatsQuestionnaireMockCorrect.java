package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock;


import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.*;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;

import java.util.ArrayList;

public class ServiceStatsQuestionnaireMockCorrect implements IServiceQuestion {
    @Override
    public QuestionnaireDTO chargerListeQuestion(String fichier) throws FichierVideExceptions, FichierIncorrectExceptions, FichierPasTrouveExceptions {
        return null;
    }

    @Override
    public QuestionnaireDTO fournirListeQuestionnaires() {
        return null;
    }

    @Override
        public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws IdQuestionnaireIncorrectExeptions,  StatsQuestionsIncorrectExeptions {
            ArrayList<QuestionDTO> statsQuestions = new ArrayList<QuestionDTO>();
            StatsQuestionDTO statsQuestionsDTO = new StatsQuestionDTO();
            statsQuestions.add(statsQuestionsDTO);
            statsQuestions.add(new StatsQuestionDTO());
            return new StatsDTO(statsQuestions,1, 5);
        }

    @Override
    public void majStatQuestions(QuestionnaireDTO q) {

    }
}


