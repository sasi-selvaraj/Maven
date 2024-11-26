package Rsetassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postemployees {
	@Test(enabled=false)
	public void createAnemployee() {
		RestAssured.baseURI="http://localhost:8000/employee";
		RequestSpecification requestSpecification= RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
				+ "  \"id\": 5,\r\n"
				+ "  \"name\": \"yasar Graham\",\r\n"
				+ "  \"username\": \"blue\",\r\n"
				+ "  \"email\": \"yasar1112@gmail.com\",\r\n"
				+ "  \"address\": {\r\n"
				+ "    \"street\": \"pdtk\",\r\n"
				+ "    \"suite\": \"Apt. 1112\",\r\n"
				+ "    \"city\": \"dubai2512\",\r\n"
				+ "    \"zipcode\": \"987654321\",\r\n"
				+ "    \"geo\": {\r\n"
				+ "      \"lat\": \"45632\",\r\n"
				+ "      \"lng\": \"56789432\"\r\n"
				+ "    }\r\n"
				+ "  },\r\n"
				+ "  \"phone\": \"4532167895342\",\r\n"
				+ "  \"website\": \"yasar.org\",\r\n"
				+ "  \"company\": {\r\n"
				+ "    \"name\": \"aysha\",\r\n"
				+ "    \"catchPhrase\": \"multiple server \",\r\n"
				+ "    \"bs\": \" real-time y-markets\"\r\n"
				+ "  }\r\n"
				+ "}");
		Response response = requestSpecification.request(Method.POST);
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());

}
@Test
public void updateAnEmployee() {
	RestAssured.baseURI="http://localhost:8000/employee/175a";
	RequestSpecification requestSpecification= RestAssured.given().
			header("Content-Type","application/json")
			.body("{\r\n"
					+ "  \r\n"
					+ "  \"name\": \"vency Graham\",\r\n"
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
					+ "}");
	
	Response response = requestSpecification.request(Method.PUT);
	System.out.println(response.asPrettyString());
	System.out.println(response.getStatusLine());

}}




