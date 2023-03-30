package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.*;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsDTO;

import java.io.File;
import java.util.List;

public interface IServiceQuestion {


    public QuestionnaireDTO chargerListeQuestion(String fichier) throws FichierVideExceptions, FichierIncorrectExceptions, FichierPasTrouveExceptions;
    public QuestionnaireDTO fournirListeQuestionnaires();
    public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws IdQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions;

    public  void majStatQuestions(QuestionnaireDTO q);


}
