package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto;

import java.util.ArrayList;
import java.util.Comparator;

public class StatsQuestionDTO extends QuestionDTO  {

    private int nbJouer;
    private int nbOK;

    public StatsQuestionDTO() {
     this.nbJouer=0;
     this.nbOK=0;
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
