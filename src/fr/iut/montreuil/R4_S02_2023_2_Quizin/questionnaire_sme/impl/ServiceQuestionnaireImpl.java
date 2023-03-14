package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.impl;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;
import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class ServiceQuestionnaireImpl implements IServiceQuestion {

    public /*!!!!!!!!A CHANGER en QuestionnaireDTO!!!!!!!*/void chargerListeQuestion(String nomFichier) {
        try {

            CSVReader reader = new CSVReader(new FileReader(nomFichier));
            String[] nextline;
            while ((nextline = reader.readNext()) != null) {
                if (nextline != null) {
                    System.out.println(Arrays.toString(nextline));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("csv read complete");

    }

    @Override
    public QuestionnaireDTO chargerListeQuestion(File fichier) {
        return null;
    }

    @Override
    public QuestionnaireDTO fournirListeQuestionnaires() {
        return null;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaires() {
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
