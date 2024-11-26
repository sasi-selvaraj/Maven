package ems.bdd_style;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
@Test(enabled=false)
public class GetAllEmployees {
	public void getAllEmployees(){
	given().baseUri("http://localhost:8000").when().get("employee").prettyPrint();
		
		
	}

	@Test(enabled=false)
public void postemployeesBDD() {
	given().baseUri("http://localhost:8000")
	.header("Content-Type","application/json")
	.body("{\r\n"
			+ "  \r\n"
			+ "  \"name\": \"V Graham\",\r\n"
			+ "  \"username\": \"twinkle\",\r\n"
			+ "  \"email\": \"Sasi1112@gmail.com\",\r\n"
			+ "  \"address\": {\r\n"
			+ "    \"street\": \"trichy\",\r\n"
			+ "    \"suite\": \"Apt. 1112\",\r\n"
			+ "    \"city\": \"dubai1112\",\r\n"
			+ "    \"zipcode\": \"987654321\",\r\n"
			+ "    \"geo\": {\r\n"
			+ "      \"lat\": \"45632\",\r\n"
			+ "      \"lng\": \"56789432\"\r\n"
			+ "    }\r\n"
			+ "  },\r\n"
			+ "  \"phone\": \"4532167895342\",\r\n"
			+ "  \"website\": \"sasi.org\",\r\n"
			+ "  \"company\": {\r\n"
			+ "    \"name\": \"vency\",\r\n"
			+ "    \"catchPhrase\": \"multiple server \",\r\n"
			+ "    \"bs\": \" real-time s-markets\"\r\n"
			+ "  }\r\n"
			+ "}")
	.when().post("/employee").prettyPrint();
	
}

@Test(enabled=false)
public void putAnEmployees() {
	given().baseUri("http://localhost:8000")
	.header("Content-Type","application/json")
	.body("{\r\n"
			+ "  \r\n"
			+ "  \"name\": \"JIN Graham\",\r\n"
			+ "  \"username\": \"twinkle\",\r\n"
			+ "  \"email\": \"Sasi1112@gmail.com\",\r\n"
			+ "  \"address\": {\r\n"
			+ "    \"street\": \"trichy\",\r\n"
			+ "    \"suite\": \"Apt. 1112\",\r\n"
			+ "    \"city\": \"dubai1112\",\r\n"
			+ "    \"zipcode\": \"987654321\",\r\n"
			+ "    \"geo\": {\r\n"
			+ "      \"lat\": \"45632\",\r\n"
			+ "      \"lng\": \"56789432\"\r\n"
			+ "    }\r\n"
			+ "  },\r\n"
			+ "  \"phone\": \"4532167895342\",\r\n"
			+ "  \"website\": \"sasi.org\",\r\n"
			+ "  \"company\": {\r\n"
			+ "    \"name\": \"vency\",\r\n"
			+ "    \"catchPhrase\": \"multiple server \",\r\n"
			+ "    \"bs\": \" real-time s-markets\"\r\n"
			+ "  }\r\n"
			+ "}")
	.when()
	.put("/employee/4")
	.prettyPrint();
	 
}
@Test(enabled=false)
public void DeleteAnEmployees() {
	given().baseUri("http://localhost:8000")
	.header("Content-Type","application/json")
	.body("{\r\n"
			+ "  \r\n"
			+ "  \"name\": \"yasar Graham\",\r\n"
			+ "  \"username\": \"twinkle\",\r\n" 
			+ "  \"email\": \"Sasi1112@gmail.com\",\r\n"
			+ "  \"address\": {\r\n"
			+ "    \"street\": \"trichy\",\r\n"
			+ "    \"suite\": \"Apt. 1112\",\r\n"
			+ "    \"city\": \"dubai1112\",\r\n"
			+ "    \"zipcode\": \"987654321\",\r\n"
			+ "    \"geo\": {\r\n"
			+ "      \"lat\": \"45632\",\r\n"
			+ "      \"lng\": \"56789432\"\r\n"
			+ "    }\r\n"
			+ "  },\r\n"
			+ "  \"phone\": \"4532167895342\",\r\n"
			+ "  \"website\": \"sasi.org\",\r\n"
			+ "  \"company\": {\r\n"
			+ "    \"name\": \"vency\",\r\n"
			+ "    \"catchPhrase\": \"multiple server \",\r\n"
			+ "    \"bs\": \" real-time s-markets\"\r\n"
			+ "  }\r\n"
			+ "}")
	.when()
	.delete("/employee/4")
	.prettyPrint();


}

}

















