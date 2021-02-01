package com.coderscampus.Assignment6;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

/**
 * @author jkirkish
 *
 */
public class DateSales {
	
	private YearMonth date;
	private Integer sales;
	
	public DateSales(String date, String sale)
	{
		this.date = YearMonth.parse(date, DateTimeFormatter.ofPattern("MMM-yy"));
		this.sales = Integer.parseInt(sale);
	}
	
	public YearMonth getDate() {
		return date;
	}
	public void setDate(YearMonth date) {
		this.date = date;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	@Override
	public String toString() {
		return "DateSales [date=" + date + ", sales=" + sales + "]";
	}
}
	
	
	
	