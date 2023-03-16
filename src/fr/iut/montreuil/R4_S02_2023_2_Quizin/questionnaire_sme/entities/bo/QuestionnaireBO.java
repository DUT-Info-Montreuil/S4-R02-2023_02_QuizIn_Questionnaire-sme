package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.bo;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;

import java.io.File;
import java.util.ArrayList;

public class QuestionnaireBO {

    private ArrayList<QuestionDTO> questionnaire;

    public QuestionnaireBO() {

        this.questionnaire = new ArrayList<QuestionDTO>();
    }

    public void addQuestion(QuestionDTO q) {
        this.questionnaire.add(q);
    }

    public ArrayList<QuestionDTO> getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(ArrayList<QuestionDTO> questionnaire) {
        this.questionnaire = questionnaire;
    }
}