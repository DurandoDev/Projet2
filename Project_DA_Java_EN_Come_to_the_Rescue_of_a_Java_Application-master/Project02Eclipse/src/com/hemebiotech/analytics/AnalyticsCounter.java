package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.ArrayList;


public class AnalyticsCounter {
	private static int count =0;
	public static void main(String args[]) throws Exception {
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		ReadSymptomDataFromFile listSymptom = new ReadSymptomDataFromFile("symptoms.txt");

		ArrayList<String> alreadyCount = new ArrayList<>();

		for (int i=0;i<listSymptom.GetSymptoms().size();i++){
			// Verify if the symptom have been already check
			if (!(alreadyCount.contains(listSymptom.GetSymptoms().get(i)))){
				alreadyCount.add(listSymptom.GetSymptoms().get(i)); //add the symptom if it's not check

				count=0;

				for (int j=0;j<listSymptom.GetSymptoms().size();j++){
					if (listSymptom.GetSymptoms().get(j).equals(listSymptom.GetSymptoms().get(i))){
						count++;
					}
				}
				writer.write(listSymptom.GetSymptoms().get(i)+": "+count + "\n");
			}
		}
		writer.close();
	}
}