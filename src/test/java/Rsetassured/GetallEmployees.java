package Rsetassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GetallEmployees {
	@Test(enabled=false)
	public void getAllEmployees() {

		RestAssured.baseURI="http://localhost:8000/employee/2";
		RequestSpecification requestSpecification= RestAssured.given();
		Response response= requestSpecification.request(Method.GET);
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	
	@Test
	public void DeleteAnEmployee() {
		RestAssured.baseURI="http://localhost:8000";
		RequestSpecification requestSpecification= RestAssured.given();
		Response response= requestSpecification.request(Method.DELETE,"employee/175a");
		System.out.println(response.asPrettyString());

	} 
	public void AnEmployee() {
		RestAssured.baseURI="http://localhost:8000";
		RequestSpecification requestSpecification= RestAssured.given();
		Response response= requestSpecification.request(Method.DELETE,"employee/175a");
		System.out.println(response.asPrettyString());
}}



