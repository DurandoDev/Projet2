package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Count the symptoms occurrence and place them into result.out
 */
public class SymptomCount {
    /**
     * Count the symptoms occurrence and place them into result.out
     * @param source file to read
     * @param destination file to write in
     */
<<<<<<< HEAD
    public static void symptomCount() throws IOException {
        int count;
        ArrayList<String> alreadyCount = new ArrayList<>();
        /*
          Initialize the files needed
          @see FileWriter
         */
        FileWriter writer = new FileWriter ("result.out");
        /**
         * Create a list from the file specified in parameter
         *
         * @see ReadSymptomDataFromFile
         */
        ReadSymptomDataFromFile listSymptom = new ReadSymptomDataFromFile("symptoms.txt");

=======
    public static void symptomCount(String source,String destination) {
        try{
            int count;
            String mapKey;
            Map<String, Integer> symptomCount = new TreeMap<>();
            /*
              Initialize the file where we're going to put our result data
              @see FileWriter
             */
            FileWriter writer = new FileWriter (destination);
            /*
              Create a list from the file specified in parameter
>>>>>>> develop

              @see ReadSymptomDataFromFile
             */
            ReadSymptomDataFromFile listSymptom = new ReadSymptomDataFromFile(source);

            for (int i=0;i<listSymptom.GetSymptoms().size();i++){
                /*
                  Verify if the symptom haven't been already check
                 */
                if (!(symptomCount.containsKey(listSymptom.GetSymptoms().get(i)))){
                    /*
                      add the symptom if it's not check
                     */
                    mapKey = listSymptom.GetSymptoms().get(i);

                    count=0;
                    /*
                      Checking how many times the symptom is in the file
                     */
                    for (int j=0;j<listSymptom.GetSymptoms().size();j++){
                        if (listSymptom.GetSymptoms().get(j).equals(mapKey)){
                            count++;
                        }
                    }
                    symptomCount.put(mapKey, count);
                }
            }
            /*
              Write the keys and the values in result.out
             */
            for (Map.Entry<String,Integer> entry:symptomCount.entrySet()){
                String key = entry.getKey();
                Integer value = entry.getValue();
                writer.write(key+": "+value+"\n");
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
