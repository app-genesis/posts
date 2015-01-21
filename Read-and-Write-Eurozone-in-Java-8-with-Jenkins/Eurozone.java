import java.util.ArrayList;

public class Eurozone {

	private String source;
	private int year;
	private int eurozoneMembers;

    public ArrayList<Country> country;

	public Eurozone() {}
	

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public int getEurozoneMembers() {
		return eurozoneMembers;
	}

	public void setEurozoneMembers(int eurozoneMembers) {
		this.eurozoneMembers = eurozoneMembers;
	}
	

	public ArrayList<Country> getCountry() {
		return country;
	}
	
	public void setCountry(ArrayList<Country> country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Source: " + getSource() + " for " + getEurozoneMembers() + " members" + " in " + getYear();
	}
}
