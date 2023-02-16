package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;

import java.io.File;

public interface IServiceQuestion {


    public QuestionnaireDTO chargerListeQuestion(File fichier);
    public QuestionnaireDTO fournirListeQuestionnaires();
    public QuestionnaireDTO fournirUnQuestionnaires();
    public void majStatQuestions(QuestionnaireDTO q );
    public QuestionDTO fournirStatQuestions();




}
