package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.impl.ServiceQuestionnaireImpl;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

public class ChargementQuestionnaireMockOk implements IServiceQuestion {


    @Override
    public QuestionnaireDTO chargerListeQuestion(File fichier) {
        return null;
    }

    @Override
    public QuestionnaireDTO fournirListeQuestionnaires() {
        return null;
    }

    @Override
    public void majStatQuestions(QuestionnaireDTO q) {

    }

    @Override
    public QuestionDTO fournirStatQuestions() {
        return null;
    }
}
