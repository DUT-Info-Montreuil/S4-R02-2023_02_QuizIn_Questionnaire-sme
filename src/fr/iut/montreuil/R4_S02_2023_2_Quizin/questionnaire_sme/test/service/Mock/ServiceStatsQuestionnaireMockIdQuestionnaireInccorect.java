package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.*;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;

public class ServiceStatsQuestionnaireMockIdQuestionnaireInccorect implements IServiceQuestion {
    @Override
    public QuestionnaireDTO chargerListeQuestion(String fichier) throws FichierVideExceptions, FichierIncorrectExceptions, FichierPasTrouveExceptions {
        return null;
    }

    @Override
    public QuestionnaireDTO fournirListeQuestionnaires() {
        return null;
    }

    @Override
        public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws IdQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {
            throw new IdQuestionnaireIncorrectExeptions();
        }

    @Override
    public void majStatQuestions(QuestionnaireDTO q) {

    }

}
