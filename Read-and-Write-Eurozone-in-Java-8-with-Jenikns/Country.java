
public class Country {
	
	private String name;
	private double gdp;
	private double debt;
	private double population;
	
	public Country() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGDP() {
		return gdp;
	}

	public void setGDP(double gdp) {
		this.gdp = gdp;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return getName() + "'s population "+ getPopulation() +" millions. GDP " + getGDP() + " millions with " + getDebt() + "% debt. \n";
	}
}
