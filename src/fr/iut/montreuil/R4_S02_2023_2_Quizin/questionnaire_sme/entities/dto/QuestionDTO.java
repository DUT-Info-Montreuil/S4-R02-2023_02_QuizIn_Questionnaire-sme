package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.bo.QuestionnaireBO;

public class QuestionDTO {
    private QuestionnaireBO FQBO;
    private int idQuestionnaire ;
    private int num_question;
    private String Langue;
    private String Libellé;
    private String Réponse;
    private int Difficulté;
    private String Explication;
    private String Référence;

//    public QuestionDTO(int idQuestionnaire, int num_question, String langue, String libellé, String réponse, int difficulté, String explication, String référence) {
//        //this.FQBO = FQBO;
//        this.idQuestionnaire = idQuestionnaire;
//        this.num_question = num_question;
//        Langue = langue;
//        Libellé = libellé;
//        Réponse = réponse;
//        Difficulté = difficulté;
//        Explication = explication;
//        Référence = référence;
//    }

    public QuestionDTO(int id,int numQuestionniare, String langue, String libelle, String reponse, int difficulte, String explication, String reference) {
        this.idQuestionnaire = id;
        this.num_question=numQuestionniare;
        this.Langue = langue;
        this.Libellé = libelle;
        this.Réponse = reponse;
        this.Difficulté = difficulte;
        this.Explication = explication;
        this.Référence = reference;
    }

    public void setFQBO(QuestionnaireBO FQBO) {
        this.FQBO = FQBO;
    }

    public QuestionDTO(QuestionnaireBO FQBO) {
        this.FQBO = FQBO;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public int getNum_question() {
        return num_question;
    }

    public void setNum_question(int num_question) {
        this.num_question = num_question;
    }

    public String getLangue() {
        return Langue;
    }

    public void setLangue(String langue) {
        Langue = langue;
    }

    public String getLibellé() {
        return Libellé;
    }

    public void setLibellé(String libellé) {
        Libellé = libellé;
    }

    public String getRéponse() {
        return Réponse;
    }

    public void setRéponse(String réponse) {
        Réponse = réponse;
    }

    public int getDifficulté() {
        return Difficulté;
    }

    public void setDifficulté(int difficulté) {
        Difficulté = difficulté;
    }

    public String getExplication() {
        return Explication;
    }

    public void setExplication(String explication) {
        Explication = explication;
    }

    public String getRéférence() {
        return Référence;
    }

    public void setRéférence(String référence) {
        Référence = référence;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "FQBO=" + FQBO +
                ", idQuestionnaire=" + idQuestionnaire +
                ", num_questionnaire=" + num_question +
                ", Langue='" + Langue + '\'' +
                ", Libellé='" + Libellé + '\'' +
                ", Réponse='" + Réponse + '\'' +
                ", Difficulté=" + Difficulté +
                ", Explication='" + Explication + '\'' +
                ", Référence='" + Référence + '\'' +
                '}';
    }
}
