package fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.impl;

import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierIncorrectExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.Exception.FichierPasTrouveExceptions;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.R4_S02_2023_2_Quizin.questionnaire_sme.modeles.IServiceQuestion;
//import com.opencsv.CSVReader;
import java.io.*;
import java.util.List;

public class ServiceQuestionnaireImpl implements IServiceQuestion {

    public QuestionnaireDTO chargerListeQuestion(String nomFichier) throws FichierPasTrouveExceptions, FichierIncorrectExceptions {
        String pathfile = "src/fr/iut/montreuil/R4_S02_2023_2_Quizin/questionnaire_sme/ressources/questionsQuizz_V1.1.csv";
        String line = " ";
        QuestionnaireDTO questionnaire = new QuestionnaireDTO();

        try {
            BufferedReader br = new BufferedReader(new FileReader(pathfile));
            String[] elements;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                elements = line.split(";");
                questionnaire.addQuestion(new QuestionDTO(1, Integer.parseInt(elements[1]), elements[2], elements[3], elements[4], Integer.parseInt(elements[5]), elements[6], elements[7]));
            }

        } catch (FileNotFoundException e) {
            throw new FichierPasTrouveExceptions();
        } catch (IOException a) {
            a.printStackTrace();
        } catch (NumberFormatException e) {
            throw new FichierIncorrectExceptions();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new FichierIncorrectExceptions();
        }
        return questionnaire;
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
