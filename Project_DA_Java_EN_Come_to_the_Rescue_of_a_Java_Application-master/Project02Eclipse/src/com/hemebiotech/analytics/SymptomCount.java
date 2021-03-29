package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * counting and sorting each symptom from a list of symptoms into result.out.
 */
public class SymptomCount {
    /**
     * Count the symptoms occurrence and place them into result.out.

     * @param source file to read
     * @param destination file to write in
     */
    public void symptomCount(final String source, final String destination) throws IOException {

            String symptom;
            Map<String, Integer> symptomCount = new TreeMap<>();
            /*
              Initialize the file where we're going to put our result data
              @see FileWriter
             */
            FileWriter writer = new FileWriter(destination);
            /*
              Create a list from the file specified in parameter
              @see ReadSymptomDataFromFile
             */
            ISymptomReader listSymptom = new ReadSymptomDataFromFile(source);

            for (int i = 0; i < listSymptom.GetSymptoms().size(); i++) {

                symptom = listSymptom.GetSymptoms().get(i);

                /*
                  Verify if the symptom haven't been already check
                 */
                if ((symptomCount.containsKey(symptom))) {
                    /*
                      increment the count for the key associated
                     */
                    symptomCount.put(symptom, symptomCount.get(symptom) + 1);
                } else {
                    symptomCount.put(symptom, 1);
                }
            }
            /*
              Write the keys and the values in result.out
             */
            for (Map.Entry<String, Integer> entry:symptomCount.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                writer.write(key + ": " + value + "\n");
            }
            writer.close();
    }
}
