package tugas5;


import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITestKolak {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://kolakproject.herokuapp.com")
			.setContentType(ContentType.JSON).build().log().all();
	RequestSpecification loginJsonSpec;

	
	@Test
	public void RegisterKolakFaker() {
		// 
		Faker faker = new Faker();
		// data yang harus unik hanya username dan email, jadi faker hanya 2 data tersebut
		
		String username = faker.name().fullName();
		String email = faker.internet().emailAddress();
		
		String registerPayload = 
				"{\"username\":"+"\"" + username + "\""+","
				+ "\"password\":\"password123\","
				+ "\"email\":"+"\"" + email +"\""+","
				+ "\"phonenumber\":\"123123123\"}";
		Response responseRegister = given().spec(commonJsonSpec).body(registerPayload).when().post("/register");
		assertEquals(responseRegister.getStatusCode(), 201);
	}
}
