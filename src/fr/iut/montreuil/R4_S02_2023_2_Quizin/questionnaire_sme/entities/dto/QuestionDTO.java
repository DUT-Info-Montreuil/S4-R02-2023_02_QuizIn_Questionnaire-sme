package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.bo.FichierQuestionnaireBO;

public class QuestionDTO {
    private FichierQuestionnaireBO FQBO;
    private int idQuestionnaire ;
    private int num_questionnaire;
    private String Langue;
    private String Libellé;
    private String Réponse;
    private int Difficulté;
    private String Explication;
    private String Référence;

    public QuestionDTO(FichierQuestionnaireBO FQBO, int idQuestionnaire, int num_questionnaire, String langue, String libellé, String réponse, int difficulté, String explication, String référence) {
        this.FQBO = FQBO;
        this.idQuestionnaire = idQuestionnaire;
        this.num_questionnaire = num_questionnaire;
        Langue = langue;
        Libellé = libellé;
        Réponse = réponse;
        Difficulté = difficulté;
        Explication = explication;
        Référence = référence;
    }

    public void setFQBO(FichierQuestionnaireBO FQBO) {
        this.FQBO = FQBO;
    }

    public QuestionDTO(FichierQuestionnaireBO FQBO) {
        this.FQBO = FQBO;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public int getNum_questionnaire() {
        return num_questionnaire;
    }

    public void setNum_questionnaire(int num_questionnaire) {
        this.num_questionnaire = num_questionnaire;
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
}
