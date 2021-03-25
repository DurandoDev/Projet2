package com.hemebiotech.analytics;

/**
 * The main class
 * @author Nathan D
 * @version 1.0
 */
public class AnalyticsCounter {
	/**
	 *
<<<<<<< HEAD
	 * @param args méthode main
	 * @throws Exception fait appel à une méthode gérant les exceptions
	 */
	public static void main(String[] args) throws Exception {
		/*
		  Appel de la méthode symptomCount dans la classe SymptomCount
=======
	 * @param args main method
	 */
	public static void main(String[] args) {
		/*
>>>>>>> develop
		  @see SymptomCount
		 */
		SymptomCount.symptomCount("symptoms.txt","result.out");

	}
}