package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.bo.QuestionnaireBO;

public class QuestionDTO {
    private QuestionnaireBO FQBO;
    private int idQuestionnaire ;
    private int num_question;
    private String langue;
    private String libelle;
    private String reponse;
    private int difficulté;
    private String explication;
    private String reference;

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
        this.langue = langue;
        this.libelle = libelle;
        this.reponse = reponse;
        this.difficulté = difficulte;
        this.explication = explication;
        this.reference = reference;
    }


    public QuestionnaireBO getFQBO() {
        return FQBO;
    }

    public void setFQBO(QuestionnaireBO FQBO) {
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
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public int getDifficulté() {
        return difficulté;
    }

    public void setDifficulté(int difficulté) {
        this.difficulté = difficulté;
    }

    public String getExplication() {
        return explication;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "FQBO=" + FQBO +
                ", idQuestionnaire=" + idQuestionnaire +
                ", num_questionnaire=" + num_question +
                ", Langue='" + langue + '\'' +
                ", Libellé='" + libelle + '\'' +
                ", Réponse='" + reponse + '\'' +
                ", Difficulté=" + difficulté +
                ", Explication='" + explication + '\'' +
                ", Référence='" + reference + '\'' +
                '}';
    }
}
