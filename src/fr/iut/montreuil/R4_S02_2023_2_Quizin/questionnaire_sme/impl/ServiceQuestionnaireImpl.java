package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.impl;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;

import java.io.File;

public class ServiceQuestionnaireImpl implements IServiceQuestion {

    public QuestionnaireDTO chargerListeQuestion(File fichier){
        return null;
    }

    @Override
    public QuestionnaireDTO fournirListeQuestionnaires() {
        return null;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaires() {
        return null;
    }

    @Override
    public void majStatQuestions() {

    }

    @Override
    public QuestionDTO fournirStatQuestions() {
        return null;
    }
}
