package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * The main class : counting and sorting each symptom from a list of symptoms into result.out
 * @author Nathan D
 * @version 1.0
 */
public class AnalyticsCounter {
	/**
	 *

	 * @param args main method
	 */
	public static void main(String[] args) {
		/*
		  @see SymptomCount
		 */
		try{
			SymptomCount countSymptom = new SymptomCount();
			countSymptom.symptomCount("symptoms.txt","result.out");
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}