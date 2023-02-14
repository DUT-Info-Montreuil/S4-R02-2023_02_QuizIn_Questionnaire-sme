package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.bo;

import java.io.File;

public class FichierQuestionnaireBO {

    private File fichierQTS;

    public FichierQuestionnaireBO(File fichierQTS) {
        this.fichierQTS = fichierQTS;
    }

    public File getFichierQTS() {
        return fichierQTS;
    }

    public void setFichierQTS(File fichierQTS) {
        this.fichierQTS = fichierQTS;
    }
}
