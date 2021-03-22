package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class AnalyticsCounter {
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0


	public static void main(String args[]) throws Exception {
		// first get input
//		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
//		String line = reader.readLine();
//
//		while (line != null) {
//			System.out.println("symptom from file: " + line);
//			if (line.equals("headache")) {
//				headacheCount++;
//				System.out.println("number of headaches: " + headacheCount);
//			}
//			else if (line.equals("rash")) {
//				rashCount++;
//				System.out.println("number of rash: " + rashCount);
//			}
//			else if (line.contains("pupils")) {
//				pupilCount++;
//				System.out.println("number of dialated pupils: " + pupilCount);
//			}
//
//			line = reader.readLine();	// get another symptom
//		}
//
//		// next generate output
		FileWriter writer = new FileWriter ("result.out");
//		writer.write("headache: " + headacheCount + "\n");
//		writer.write("rash: " + rashCount + "\n");
//		writer.write("dialated pupils: " + pupilCount + "\n");
//		writer.close();

		ReadSymptomDataFromFile listSymptom = new ReadSymptomDataFromFile("symptoms.txt");
		ArrayList<String> alreadyCount = new ArrayList<>();
		alreadyCount.add("initialisation"); // adding one element to initialize  the next loop



		for (int i=0;i<listSymptom.GetSymptoms().size();i++){
			// Verify if the symptom have been already check
			if (!(alreadyCount.contains(listSymptom.GetSymptoms().get(i)))){
				alreadyCount.add(listSymptom.GetSymptoms().get(i)); //add the symptom if it's not check

				int count = 0;

				for (int j=0;j<listSymptom.GetSymptoms().size();j++){
					if (listSymptom.GetSymptoms().get(j).equals(listSymptom.GetSymptoms().get(i))){
						count++;
					}
				}
				System.out.println(listSymptom.GetSymptoms().get(i)+": "+count);
				writer.write(listSymptom.GetSymptoms().get(i)+": "+count + "\n");
			}
		}
		writer.close();
	}
}
