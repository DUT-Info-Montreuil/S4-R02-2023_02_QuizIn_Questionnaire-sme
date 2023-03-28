package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;

public class QuestionDTO {

    private int idQuestionnaire ;
    private int num_question;
    private String langue;
    private String libelle;
    private String reponse;
    private int difficulte;
    private String explication;
    private String reference;
    private StatsQuestionDTO statsQuestion;

    public QuestionDTO(int idQuestionnaire, int num_question, String langue, String libelle, String reponse, int difficulte, String explication, String reference, StatsQuestionDTO statsQuestion) {
        this.idQuestionnaire = idQuestionnaire;
        this.num_question = num_question;
        this.langue = langue;
        this.libelle = libelle;
        this.reponse = reponse;
        this.difficulte = difficulte;
        this.explication = explication;
        this.reference = reference;
        this.statsQuestion = statsQuestion;
    }


    public QuestionDTO() {

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

    public int getDifficulte() {
        return difficulte;
    }
    public int getNbJouer(){
        return statsQuestion.getNbJouer();
    }

    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
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
                ", idQuestionnaire=" + idQuestionnaire +
                ", num_questionnaire=" + num_question +
                ", Langue='" + langue + '\'' +
                ", Libellé='" + libelle + '\'' +
                ", Réponse='" + reponse + '\'' +
                ", Difficulté=" + difficulte +
                ", Explication='" + explication + '\'' +
                ", Référence='" + reference + '\'' +
                '}';
    }
}
