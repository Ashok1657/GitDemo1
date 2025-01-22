package Example;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.response.ValidatableResponse;

public class APIAutomation {

	public static void main(String[] args) {
		ValidatableResponse response = given().header("Content-Type", "application/json").header("name", "json").when()
				.get("https://api.coindesk.com/v1/bpi/currentprice.json").then().statusCode(200)
				.body("GBP.description", equalTo("British Pound Sterling"));

		ValidatableResponse resp = response.statusCode(200).log().all();
		System.out.println(response);
	}
}
