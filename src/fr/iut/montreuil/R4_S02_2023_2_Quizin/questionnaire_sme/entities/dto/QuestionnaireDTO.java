package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;

public class QuestionnaireDTO {

    private QuestionDTO question;

    public QuestionDTO getQuestion() {
        return question;
    }

    public void setQuestion(QuestionDTO question) {
        this.question = question;
    }

    public QuestionnaireDTO(QuestionDTO question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "question=" + question +
                '}';
    }
}
