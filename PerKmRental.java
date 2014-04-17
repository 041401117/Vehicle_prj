package org.jx.test.rental;

public class PerKmRental {
	private double rental = 1;
	private double revenue = 0;

	public PerKmRental(double kilometers) {
		this.revenue = this.rental * kilometers;
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
