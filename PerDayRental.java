package org.jx.test.rental;

public class PerDayRental {
	private double rental = 100;
	private double revenue = 0;
	private PerKmRental pkr;

	public PerDayRental(double kilometres, int days) {
		pkr = new PerKmRental(kilometres);
		this.revenue = pkr.getRevenue() * days;
	}

	public double getRevenue() {
		return this.revenue;
	}

	public double getRental() {
		return rental;
	}

	public void setRental(double rental) {
		this.rental = rental;
	}

}
