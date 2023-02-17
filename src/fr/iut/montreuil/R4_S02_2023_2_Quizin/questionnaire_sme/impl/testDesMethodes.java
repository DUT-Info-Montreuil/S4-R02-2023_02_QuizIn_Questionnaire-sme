package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.impl;

import com.opencsv.CSVReader;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;

import java.io.FileReader;
import java.util.Arrays;

public class testDesMethodes {

    public static void main(String[] args) {
        try {

            CSVReader reader = new CSVReader(new FileReader("src/fr/iut/montreuil/R4_S02_2023_2_Quizin/questionnaire_sme/ressources/questionsQuizz_V1.1.csv"));
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
}



