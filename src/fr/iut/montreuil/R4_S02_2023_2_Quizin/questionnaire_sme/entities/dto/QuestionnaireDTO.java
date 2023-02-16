package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {

    private ArrayList<QuestionDTO> questions;

    public QuestionnaireDTO(ArrayList<QuestionDTO> questions) {
        this.questions = questions;
    }

    public ArrayList<QuestionDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<QuestionDTO> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "questions=" + questions +
                '}';
    }
}
