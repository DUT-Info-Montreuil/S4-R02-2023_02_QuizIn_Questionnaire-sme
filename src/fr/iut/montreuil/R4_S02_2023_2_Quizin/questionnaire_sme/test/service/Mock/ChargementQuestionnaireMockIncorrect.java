package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierIncorrectExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierPasTrouveExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierVideExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;

import java.io.File;
import java.util.List;

public class ChargementQuestionnaireMockIncorrect implements IServiceQuestion {


    @Override
    public List<QuestionnaireDTO> chargerListeQuestion(File fichier) throws FichierVideExceptions, FichierIncorrectExceptions, FichierPasTrouveExceptions {
        throw new FichierIncorrectExceptions();

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
