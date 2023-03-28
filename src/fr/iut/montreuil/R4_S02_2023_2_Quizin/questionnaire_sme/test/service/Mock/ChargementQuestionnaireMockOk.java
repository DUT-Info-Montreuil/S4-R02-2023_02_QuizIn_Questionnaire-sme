package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.test.service.Mock;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.impl.ServiceQuestionnaireImpl;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ChargementQuestionnaireMockOk implements IServiceQuestion {


    @Override
    public QuestionnaireDTO chargerListeQuestion(String fichier) {
        QuestionDTO questionCorrect = new QuestionDTO(1, 1, "fr", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "Tee", 1, "Le joueur devant taper sa balle sur le départ peut la poser sur une cheville de bois ou de plastique appelée tee, qui ne peut pas être utilisée en dehors des départs. L'utilité d'un tee est de surélever la balle pour faciliter l'utilisation de clubs de golf spéciaux", "https://fr.wikipedia.org/wiki/Mat%C3%A9riel_de_golf", new StatsQuestionDTO(0, 0)
        );
        List<QuestionDTO> listQuestionsCorrect = new ArrayList<QuestionDTO>();
        listQuestionsCorrect.add(questionCorrect);
        QuestionnaireDTO leQuestionnaireCorrect = new QuestionnaireDTO((ArrayList<QuestionDTO>) listQuestionsCorrect);
        return leQuestionnaireCorrect;
    }

    @Override
    public QuestionnaireDTO fournirListeQuestionnaires() {
        return null;
    }

    @Override
    public void majStatQuestions(QuestionnaireDTO q) {

    }

    public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws IdQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {
        return null;
    }
}
