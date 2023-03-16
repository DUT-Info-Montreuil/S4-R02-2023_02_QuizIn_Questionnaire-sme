package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierIncorrectExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierPasTrouveExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierVideExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;

import java.io.File;
import java.util.List;

public class ChargementQuestionnaireVide implements IServiceQuestion {




    @Override
    public QuestionnaireDTO chargerListeQuestion(String fichier) throws FichierVideExceptions, FichierIncorrectExceptions, FichierPasTrouveExceptions {
        throw new FichierVideExceptions();
    }

    @Override
    public QuestionnaireDTO fournirListeQuestionnaires() {
        return null;
    }

    @Override
    public void majStatQuestions(QuestionnaireDTO q) {

    }

    @Override
    public QuestionDTO fournirStatQuestions() {
        return null;
    }
}
