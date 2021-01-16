package com.coderscampus.Assignment6;

import java.io.IOException;

public class DateSalesReport {

	// public static DateSales[] sales = new DateSales[50];
	// public static List<DateSales> model3 = new LinkedList<DateSales>();
	// public static List<DateSales> modelS = new LinkedList<DateSales>();
	// public static List<DateSales> modelX = new LinkedList<DateSales>();

	public static void main(String[] args) throws IOException {
		/*
		 * control space (Sys) or (main) shortcuts review the Bufferred Reader Review
		 * streams Stream Maps Stream joining Stream FlapMaps Lambdas Use Arraylists
		 * Review Modifying Java Dates Parsing and Formattings and Modifying Array ---
		 * List<String>data = new ArrayList<String>(); more resource intensive with
		 * removing LinkedLIst --- > List<String> values = new LinkedList<String>();very
		 * easy to remove from less resource intensive Set -------> Set<Integers>
		 * numbers = new LinkedHashSet<>();Does not contain duplicates Maps------->
		 * Map<Integer,String> planes = new HashMap<>(); stores two types of data also
		 * called dictionary Maps store two types of data as Maps<(K)key,(V)value)
		 * pairs, unique identify the value attached to the key.
		 */
		DateSalesClass report = new DateSalesClass();
		report.ReadFile("model3.csv");
		report.ReadFile("modelS.csv");
		report.ReadFile("modelX.csv");
		report.model3YearlyReport();
		report.modelSYearlyReport();
		report.modelXYearlyReport();
	}
}
