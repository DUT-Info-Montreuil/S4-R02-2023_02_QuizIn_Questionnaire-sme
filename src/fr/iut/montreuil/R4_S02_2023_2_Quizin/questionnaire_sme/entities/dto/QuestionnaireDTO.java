package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireDTO {
    private int idQuestionnaire;
    private ArrayList<QuestionDTO> questions;
    private int nbJouerQuestionnaire ;

    public QuestionnaireDTO(int idQuestionnaire, ArrayList<QuestionDTO> questions) {
        this.idQuestionnaire = idQuestionnaire;
        this.questions = questions;
        this.nbJouerQuestionnaire=0;
    }

    public QuestionnaireDTO( ArrayList<QuestionDTO> questions) {
        this.questions = questions;
    }

    public QuestionnaireDTO() {

    }


    public int getNbJouerQuestionnaire() {
        return nbJouerQuestionnaire;
    }

    public void setNbJouerQuestionnaire(int nbJouerQuestionnaire) {
        this.nbJouerQuestionnaire = nbJouerQuestionnaire;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
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


    public void addQuestion(QuestionDTO questionDTO) {
        this.questions.add(questionDTO);
    }
}
