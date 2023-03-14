package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;
import java.util.ArrayList;
public class QuestionnaireDTO {
    private int idQuestionnaire;
    private ArrayList<QuestionDTO> questions;

    public QuestionnaireDTO(int idQuestionnaire, ArrayList<QuestionDTO> questions) {
        this.idQuestionnaire = idQuestionnaire;
        this.questions = questions;
    }

    public QuestionnaireDTO( ArrayList<QuestionDTO> questions) {

        this.questions = questions;
    }



    private QuestionDTO question;

    public QuestionDTO getQuestion() {
        return question;
    }

    public void setQuestion(QuestionDTO question) {
        this.question = question;
    }

    public void addQuestion(){}

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "questions=" + questions +
                '}';
    }
}
