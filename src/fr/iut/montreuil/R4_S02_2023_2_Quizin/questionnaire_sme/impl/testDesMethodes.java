package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.impl;

//import com.opencsv.CSVReader;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class testDesMethodes {

    public static void main(String[] args) {

        String pathfile = "src/fr/iut/montreuil/R4_S02_2023_2_Quizin/questionnaire_sme/ressources/questionsQuizz_V1.1.csv";
        String line = " ";

        try {
            BufferedReader br = new BufferedReader(new FileReader(pathfile));
            while ((line = br.readLine()) != null) {
                System.out.println(line);


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Fil not found");
        } catch (IOException a) {
            a.printStackTrace();
        }
    }
}



