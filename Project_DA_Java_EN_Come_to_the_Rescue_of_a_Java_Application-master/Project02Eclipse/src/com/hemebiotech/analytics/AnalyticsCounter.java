package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * The main class : Apply the method in class SymptomCount to count and sort the symptoms
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