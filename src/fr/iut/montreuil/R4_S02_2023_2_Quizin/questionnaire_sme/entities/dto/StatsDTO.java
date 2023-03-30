package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class StatsDTO {
    private ArrayList<QuestionDTO> statQuestDTO = new ArrayList<>();
    private int nbjouerQuestionniare;
    private int idQuestionnaire;

    public StatsDTO(ArrayList<QuestionDTO> statQuestDTO, int nbjouerQuest, int idQuestion) {
        this.statQuestDTO = statQuestDTO;
        this.nbjouerQuestionniare = nbjouerQuest;
        this.idQuestionnaire = idQuestion;
    }

    public ArrayList<QuestionDTO> getStatQuestDTO() {
        return statQuestDTO;
    }

    public void setStatQuestDTO(ArrayList<QuestionDTO> statQuestDTO) {
        this.statQuestDTO = statQuestDTO;
    }

    public int getNbjouerQuestionniare() {
        return nbjouerQuestionniare;
    }

    public void setNbjouerQuestionniare(int nbjouerQuestionniare) {
        this.nbjouerQuestionniare = nbjouerQuestionniare;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }
}
