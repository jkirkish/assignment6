package com.coderscampus.Assignment6;



/**
 * @author jkirkish
 *
 */
public class DateSales {
	
	private String date;
	private String sales;
	
	
	
	public DateSales(String [] set)
	{
		this.date = set[0];
		this.sales = set[1];
	}
	
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the sales
	 */
	public String getSales() {
		return sales;
	}
	/**
	 * @param sales the sales to set
	 */
	public void setSales(String sales) {
		this.sales = sales;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((sales == null) ? 0 : sales.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateSales other = (DateSales) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (sales == null) {
			if (other.sales != null)
				return false;
		} else if (!sales.equals(other.sales))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DateSales [date=" + date + ", sales=" + sales + "]";
	}
	

}