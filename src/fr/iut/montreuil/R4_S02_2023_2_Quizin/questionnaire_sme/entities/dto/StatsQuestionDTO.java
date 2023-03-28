package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;

import java.util.ArrayList;
import java.util.Comparator;

public class StatsQuestionDTO extends QuestionDTO  {

    private int nbJouer;
    private int nbOK;

    public StatsQuestionDTO(int nbJouer, int nbOK) {
        this.nbJouer = nbJouer;
        this.nbOK = nbOK;

    }

    public int getNbJouer() {
        return nbJouer;
    }

    public void setNbJouer(int nbJouer) {
        this.nbJouer = nbJouer;
    }

    public int getNbOK() {
        return nbOK;
    }

    public void setNbOK(int nbOK) {
        this.nbOK = nbOK;
    }







}
