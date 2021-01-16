package com.coderscampus.Assignment6;

/**
 * 
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jkirkish
 *
 */
public class DateSalesClass {
	
	public static DateSales[] sales = new DateSales[50];
	public static List<DateSales> model3 = new LinkedList<DateSales>();
	public static List<DateSales> modelS = new LinkedList<DateSales>();
	public static List<DateSales> modelX = new LinkedList<DateSales>();
	
public Integer modelSum17Total() {

	List<String> modelsum = model3.stream()
			                       .map(date -> date.getDate())
			                       .filter(date17 -> date17
			                       .endsWith("17"))
			                       .collect(Collectors.toList());
	for (int z = 5; z < model3.size() - 1; z++) {
		modelsum.add(z, "H");
	}

	Integer value = 0;
	List<Integer> salesTotal = new ArrayList<Integer>();
	for (int i = 0; i < 12; i++) {
		if (model3.get(i + 1).getDate().equals(modelsum.get(i))) {

			value = Integer.parseInt((model3.get(i + 1).getSales()));
			salesTotal.add(value);
		}

	}

	Integer sum17 = salesTotal.stream().mapToInt(x -> x).sum();
	return sum17;
}

public Integer modelSum18Total() {
	List<String> modelsum = model3.stream()
			                      .map(date -> date.getDate())
			                      .filter(date18 -> date18
			                      .endsWith("18"))
			                      .collect(Collectors.toList());

	Integer value = 0;
	List<Integer> salesTotal18 = new ArrayList<Integer>();
	for (int i = 0; i < 12; i++) {
		if (model3.get(i + 7).getDate().equals(modelsum.get(i))) {

			value = Integer.parseInt((model3.get(i + 7).getSales()));
			salesTotal18.add(value);
		}

	}

	Integer sum18 = salesTotal18.stream().mapToInt(x -> x).sum();
	return sum18;

}

public Integer modelSum19Total() {
	List<String> modelsum = model3.stream().map(date -> date.getDate())
			                               .filter(date19 -> date19
			                               .endsWith("19"))
			                               .collect(Collectors.toList());

	Integer value = 0;
	List<Integer> salesTotal19 = new ArrayList<Integer>();
	for (int i = 0; i < 12; i++) {

		if (model3.get(i + 19).getDate().equals(modelsum.get(i))) {

			value = Integer.parseInt((model3.get(i + 19).getSales()));
			salesTotal19.add(value);
		}

	}

	Integer sum19 = salesTotal19.stream()
			                    .mapToInt(x -> x)
			                    .sum();
	return sum19;
}

public String model3BestMonth() {

	List<String> Dates = model3.stream()
			                   .map(date -> date.getDate())
				               .collect(Collectors.toList());

	List<String> sales = model3.stream()
				               .map(sale -> sale.getSales())
				               .collect(Collectors.toList());

		Dates.remove(0);
		sales.remove(0);
		int max = 0;
		int index = 0;
		for (int i = 1; i < sales.size(); i++) {
			if (Integer.parseInt(sales.get(i)) > max) {
				max = Integer.parseInt(sales.get(i));
				index = i;
			}
		}

		return (returnDate(Dates.get(index)) + " at $" + sales.get(index) + ",");
}

	public String model3WorstMonth() {

		List<String> Dates = model3.stream()
				                   .map(date -> date.getDate())
				                   .collect(Collectors.toList());

		List<String> sales = model3.stream()
				                   .map(sale -> sale.getSales())
				                   .collect(Collectors.toList());

		Dates.remove(0);
		sales.remove(0);
		int min = 0;
		int index = 0;
		for (int i = 1; i < sales.size(); i++) {
			if (Integer.parseInt(sales.get(i)) < min) {
				min = Integer.parseInt(sales.get(i));
				index = i;
			}
		}

		return (returnDate(Dates.get(index)) + " at $" + sales.get(index) + ",");

	}

public Integer modelSSum16Total() {
	
	List<String> modelsum = modelS.stream()
			                      .map(date -> date.getDate())
			                      .filter(date17 -> date17.endsWith("16"))
			                      .collect(Collectors.toList());
	for (int z = 12; z < model3.size()-1; z++) {
		modelsum.add(z, "H");
	}
	

	Integer value = 0;
	List<Integer> salesTotal = new ArrayList<Integer>();
	for (int i = 0; i < 12; i++) {
		if (modelS.get(i + 1).getDate().equals(modelsum.get(i))) {

			value = Integer.parseInt((modelS.get(i + 1).getSales()));
			salesTotal.add(value);
		}
	}

	Integer sum16 = salesTotal.stream()
			                  .mapToInt(x -> x)
			                  .sum();
	return sum16;
}	
public Integer modelSSum17Total() {
	
	List<String> modelsum = modelS.stream()
			                      .map(date -> date.getDate())
			                      .filter(date17 -> date17.endsWith("17"))
			                      .collect(Collectors.toList());
    
	

	Integer value17 = 0;
	List<Integer> salesTotal17 = new ArrayList<Integer>();
	for (int i = 0; i < 12; i++) {
		
		if (modelS.get(i+13).getDate().equals(modelsum.get(i))) {
            
			value17 = Integer.parseInt((modelS.get(i + 13).getSales()));
			salesTotal17.add(value17);
			}
		}

	Integer sumS17 = salesTotal17.stream()
			                     .mapToInt(x -> x)
			                     .sum();
	return sumS17;
}
public Integer modelSSum18Total() {

List<String> modelsum = modelS.stream()
		                      .map(date -> date.getDate())
		                      .filter(date17 -> date17.endsWith("18"))
		                      .collect(Collectors.toList());



	Integer value = 0;
	List<Integer> salesTotal = new ArrayList<Integer>();
	for (int i = 0; i < 12; i++) {
		 if (modelS.get(i + 25).getDate().equals(modelsum.get(i))) {
			 value = Integer.parseInt((modelS.get(i + 25).getSales()));
			 salesTotal.add(value);
		 }
	}

	Integer sum17 = salesTotal.stream().mapToInt(x -> x).sum();
	return sum17;
}
public Integer modelSSum19Total() {

	List<String> modelsum = modelS.stream()
								  .map(date -> date.getDate())
		                          .filter(date17 -> date17.endsWith("19"))
		                          .collect(Collectors.toList());


	Integer value = 0;
	List<Integer> salesTotal = new ArrayList<Integer>();
		for (int i = 0; i < 12; i++) {
				if (modelS.get(i + 37).getDate().equals(modelsum.get(i))) {
					value = Integer.parseInt((modelS.get(i + 37).getSales()));
					salesTotal.add(value);
				}
			}

	Integer sum17 = salesTotal.stream().mapToInt(x -> x).sum();
	return sum17;
}
public Integer modelXSum16Total() {

	List<String> modelXum = modelX.stream()
		                          .map(date -> date.getDate())
		                          .filter(date17 -> date17.endsWith("16"))
		                          .collect(Collectors.toList());
	for (int z = 12; z < model3.size()-1; z++) {
		modelXum.add(z, "H");
	}


	Integer value = 0;
	List<Integer> salesTotal = new ArrayList<Integer>();
	for (int i = 0; i < 12; i++) {
		if (modelX.get(i + 1).getDate().equals(modelXum.get(i))) {
			value = Integer.parseInt((modelX.get(i + 1).getSales()));
			salesTotal.add(value);
		}
	}

	Integer sum16 = salesTotal.stream()
							  .mapToInt(x -> x)
		                      .sum();
	return sum16;
}	
public Integer modelXSum17Total() {

		List<String> modelXum = modelX.stream()
		                              .map(date -> date.getDate())
		                              .filter(date17 -> date17.endsWith("17"))
		                              .collect(Collectors.toList());

		Integer value17 = 0;
		List<Integer> salesTotal17 = new ArrayList<Integer>();
		for (int i = 0; i < 12; i++) {
			if (modelX.get(i+13).getDate().equals(modelXum.get(i))) {
				value17 = Integer.parseInt((modelX.get(i + 13).getSales()));
				salesTotal17.add(value17);
			}
		}

		Integer sumS17 = salesTotal17.stream()
									 .mapToInt(x -> x)
									 .sum();
		return sumS17;
}
public Integer modelXSum18Total() {

	List<String> modelXum = modelX.stream()
	                      		  .map(date -> date.getDate())
	                              .filter(date17 -> date17.endsWith("18"))
	                              .collect(Collectors.toList());

	Integer value = 0;
	List<Integer> salesTotal = new ArrayList<Integer>();
		for (int i = 0; i < 12; i++) {
				if (modelX.get(i + 25).getDate().equals(modelXum.get(i))) {
					value = Integer.parseInt((modelX.get(i + 25).getSales()));
					salesTotal.add(value);
				}
			}

		Integer sum17 = salesTotal.stream().mapToInt(x -> x).sum();
		return sum17;
}
public Integer modelXSum19Total() {

	List<String> modelXum = modelX.stream()
	                              .map(date -> date.getDate())
	                              .filter(date17 -> date17.endsWith("19"))
	                              .collect(Collectors.toList());


	Integer value = 0;
	List<Integer> salesTotal = new ArrayList<Integer>();
		for (int i = 0; i < 12; i++) {
			if (modelX.get(i + 37).getDate().equals(modelXum.get(i))) {

				value = Integer.parseInt((modelX.get(i + 37).getSales()));
				salesTotal.add(value);
			}
		}

		Integer sum17 = salesTotal.stream()
								  .mapToInt(x -> x)
								  .sum();
		return sum17;
}
public void model3YearlyReport() {

	/*
	 * List<String> modelsum = model3.stream() .map(date ->date.getDate())
	 * .filter(date17 -> date17.endsWith("17")) .collect(Collectors.toList());
	 * 
	 * modelsum.stream().forEach(modelSum ->System.out.println(modelSum));
	 */
	System.out.println("Model 3 Yearly Sales Report-----------------------2017 -> $" + modelSum17Total());
	System.out.println("2018 - > $" + modelSum18Total() + " and " + "2019 -> $" + modelSum19Total());
	System.out.println();
	System.out.println("The best month for Model 3 was:"  + model3BestMonth() +  " The worst month for Model3 " + " was: " + model3WorstMonth());

}public String modelSBestMonth() {
	
	List<String> Dates = modelS.stream()
			                   .map(date -> date.getDate())
			                   .collect(Collectors.toList());
	List<String> sales = modelS.stream()
			                   .map(sale -> sale.getSales())
			                   .collect(Collectors.toList());

	Dates.remove(0);
	sales.remove(0);
	int max = 0;
	int index = 0;
	for (int i = 1; i < sales.size(); i++) {
		if (Integer.parseInt(sales.get(i)) > max) {
			max = Integer.parseInt(sales.get(i));
			index = i;
		}
	}

	return (returnDate(Dates.get(index)) + " at $" + sales.get(index) + ",");
}

public String modelSWorstMonth() {

	List<String> Dates = modelS.stream()
			                   .map(date -> date.getDate())
			                   .collect(Collectors.toList());
	List<String> sales = modelS.stream()
			                   .map(sale -> sale.getSales())
			                   .collect(Collectors.toList());

	Dates.remove(0);
	sales.remove(0);
	int min = 0;
	int index = 0;
	for (int i = 1; i < sales.size(); i++) {
		if (Integer.parseInt(sales.get(i)) < min) {
			min = Integer.parseInt(sales.get(i));
			index = i;
		}
}
                       
return  (returnDate(Dates.get(index)) +" at $" + sales.get(index) + ",");  
	


	
}public String modelXBestMonth() {
	
	List<String> Dates = modelX.stream()
			                   .map(date -> date.getDate())
			                   .collect(Collectors.toList());
	List<String> sales = modelX.stream()
			                   .map(sale -> sale.getSales())
			                   .collect(Collectors.toList());

	Dates.remove(0);
	sales.remove(0);
	int max = 0;
	int index = 0;
	for (int i = 1; i < sales.size(); i++) {
		if (Integer.parseInt(sales.get(i)) > max) {
			max = Integer.parseInt(sales.get(i));
			index = i;
		}
	}

	return (returnDate(Dates.get(index)) + " at $" + sales.get(index) + ",");
}

public static String modelXWorstMonth() {

	List<String> Dates = modelX.stream()
			                   .map(date -> date.getDate())
			                   .collect(Collectors.toList());
	List<String> sales = modelX.stream()
							   .map(sale -> sale.getSales())
			                   .collect(Collectors.toList());

	Dates.remove(0);
	sales.remove(0);
	int min = 0;
	int index = 0;
	for (int i = 1; i < sales.size(); i++) {
		if (Integer.parseInt(sales.get(i)) < min) {
			min = Integer.parseInt(sales.get(i));
			index = i;
		}
	}
	              
	return  (returnDate(Dates.get(index)) +" at $" + sales.get(index) + ",");  
	
}

public void modelSYearlyReport() {
	System.out.println();
	System.out.println("Model S Yearly Sales Report-----------------------2016 -> $" + modelSSum16Total() );
	System.out.println("2017-> $"+ modelSSum17Total()+", 2018 - > $" + modelSSum18Total() + " and " + "2019 -> $" + modelSSum19Total());
	System.out.println();
	System.out
	.println("The best month for Model S was: "+modelSBestMonth() + "The worst month for Model S " + " was: " + modelSWorstMonth());

}

public void modelXYearlyReport() {
    System.out.println();
	System.out.println("Model X Yearly Sales Report-----------------------2016 -> $"+ modelXSum16Total());
	System.out.println("2017-> $" + modelXSum17Total() + ", 2018 - > $" + modelXSum18Total() + " and " + "2019 -> $" + modelXSum19Total());
	System.out.println();
	System.out
	.println("The best month for Model X was: " + modelXBestMonth() + "The worst month for Model X " + " was: " + modelXWorstMonth());

}

public void ReadFile(String File) {

	BufferedReader fileReader = null;
	try {
		fileReader = new BufferedReader(new FileReader(File));
		/*
		 * Don't put fileReader.Close here because its whats calls code smell. Smells
		 * are certain structures in the code that indicate violation of fundamental
		 * design principles and negatively impact design quality
		 */
		String line = null;
		int i = 0;
		while ((line = fileReader.readLine()) != null) {
			if (File.equals("model3.csv")) {
				sales[i] = new DateSales(line.split(","));
				model3.add(sales[i]);

				System.out.println(i + ". " + model3.get(i));
				i++;
			} else if (File.equals("modelS.csv")) {
				sales[i] = new DateSales(line.split(","));
				modelS.add(sales[i]);
				System.out.println(i + ". " + modelS.get(i));
				i++;
			} else if (File.equals("modelX.csv")) {
				sales[i] = new DateSales(line.split(","));
				modelX.add(sales[i]);
				System.out.println(i + ". " + modelX.get(i));
				i++;
			}

		}
	} catch (FileNotFoundException e) {
		System.out.println("File is not Found!");
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println("There was an I/O Exception");
		e.printStackTrace();
	} finally {

		try {
			System.out.println("CLosing the File");
			// put filreader close in this finally block
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
@SuppressWarnings("static-access")
public static String returnDate(String Date) {
	String thisDate = Date;
	String abbrMonth =thisDate.substring(0, 3);
	String abbrYear = thisDate.substring(4,6);
	
	String [] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	int month = 0;
	int year = 0;
	for(int i = 0; i<months.length;i++)
	{
		if(abbrMonth.equalsIgnoreCase(months[i]))
		{
			month = i + 1;
			year = Integer.parseInt(abbrYear)+2000;
		}
	}
	
   // DateFormat formatter = new SimpleDateFormat("yyyy-MM");
   // Date myDate = formatter.parse(thisDate);
    @SuppressWarnings("static-access")
	LocalDate localDate = LocalDate.now().of(year, month, 1);
    LocalDate.now().of(1,1,1);
    return (localDate.format(DateTimeFormatter.ofPattern("yyyy-MM")));
}

// this method uses a throws instead of a try catch.
public void fileReader2(String File) throws IOException {
	BufferedReader fileReader = null;
	try {
		fileReader = new BufferedReader(new FileReader(File));

		String line;
		while ((line = fileReader.readLine()) != null) {
			System.out.println(line);
		}
	} finally {

		// put filereader close in this finally block
		fileReader.close();
		}
	}
}