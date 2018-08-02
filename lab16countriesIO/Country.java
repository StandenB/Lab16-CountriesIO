package lab16countriesIO;

public class Country {

	private String countryName;

	public Country (String countryName) {
		super();
		this.countryName = countryName;
	}
	public Country () {}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + "]";
	}

	
	
}
