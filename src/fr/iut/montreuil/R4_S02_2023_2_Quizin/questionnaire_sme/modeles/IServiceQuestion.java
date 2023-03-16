package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierIncorrectExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierPasTrouveExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierVideExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;

import java.io.File;
import java.util.List;

public interface IServiceQuestion {


    public List<QuestionnaireDTO> chargerListeQuestion(String fichier) throws FichierVideExceptions, FichierIncorrectExceptions, FichierPasTrouveExceptions;



    public QuestionnaireDTO fournirListeQuestionnaires();
    public void majStatQuestions(QuestionnaireDTO q );
    public QuestionDTO fournirStatQuestions();




}
