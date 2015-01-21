import java.io.IOException;
import java.io.File;
import java.util.stream.Collectors;
import java.util.Comparator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EuroArea {
	public static void main(String args[]) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Eurozone eurozone = objectMapper.readValue(new File("C:\\kepler\\Eurozone\\src\\data.json"), Eurozone.class);
				
		System.out.println(eurozone);
		System.out.println("Which countries have more than 80% debt-to-GDP ratio? " + eurozone.getCountry().stream()
														   .filter(country -> country.getDebt() > 80)
														   .map(Country::getName)
														   .collect(Collectors.joining(", ")));
		
		System.out.println("Whcih countries exceed 100% debt-to-GDP ratio? " + eurozone.getCountry().stream()
												            .filter(country -> country.getDebt() > 100)
													    .collect(Collectors.groupingBy(Country::getName,
													             Collectors.summingDouble(Country::getDebt))));
		
		System.out.println("Which is the highest debt-to-GDP ratio in Eurozone: " + eurozone.getCountry().stream()
														 .map(Country::getDebt)
											 			 .max(Comparator.naturalOrder()).get() + "%");

		System.out.print("Which country has the lowest debt-to-GDP ratio in Eurozone? " + eurozone.getCountry().stream()
												                       .collect(Collectors.minBy(Comparator.comparing(Country::getDebt))).get());
		
		System.out.println("What is the debt per person in each country? (in thousands $) " + eurozone.getCountry().stream()
															   .collect(Collectors.toMap(
															            Country::getName,
																    c -> (int)((c.getGDP()*c.getDebt())/c.getPopulation())/100)));
									   
		System.out.println("\nLet's create an ideal europe!!!");
		Country ideal = new Country();
		ideal.setName("Europe");
		ideal.setGDP(100000);
		ideal.setDebt(0);
		ideal.setPopulation(742.5);
		objectMapper.writeValue(new File("C:\\kepler\\Eurozone\\src\\data2.json"),  ideal);
		
		Country idealEurope = objectMapper.readValue(new File("C:\\kepler\\Eurozone\\src\\data2.json"), Country.class);				
	    	System.out.println("Ideal Europe: " + idealEurope.toString());
			
	}
}
