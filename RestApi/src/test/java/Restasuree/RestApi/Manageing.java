package Restasuree.RestApi;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import groovyjarjarasm.asm.commons.Method;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Manageing {
	@Test(enabled = false)
	public void geting() {
		given()

				.when().get("http://localhost:3000/Group").then().statusCode(200).log().all();
	}

	int i;

	@Test(enabled = false, priority = 1)
	public void puting() {

		HashMap dat = new HashMap<>();
		dat.put("name", "dev");
		dat.put("job", "testing");
		dat.put("phno", "7093778349");
		i = given().contentType("application/json").body(dat).when().post("http://localhost:3000/Group").jsonPath()
				.getInt("id");

	}

	@Test(priority = 2, enabled = false)
	public void put() {
		HashMap dat = new HashMap<>();
		dat.put("phno", "709377");
		System.out.println(i);
		given().contentType("application/json").body(dat).when()

				.put("http://localhost:3000/Group/" + i).then().statusCode(201).log().all();

	}

	
	@Test(enabled = false)
	public void books() {
		Response res=given()
		 .contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/store");
				JSONObject jo=new JSONObject(res.asString());
				for(int i=0;i<jo.getJSONArray("book").length();i++) {
				String s=jo.getJSONArray("book").getJSONObject(i).get("title").toString();
				System.out.println(s);
		}
				

	}
	@Test
	public void Groupdata() {
		Response res=given()
				 .contentType(ContentType.JSON)
						.when()
						.get("http://localhost:3000/Group");
						JSONObject jo=new JSONObject(res.asString());
						for(int i=0;i<jo.getJSONArray("data").length();i++) {
						String s=jo.getJSONArray("data").getJSONObject(i).get("name").toString();
						System.out.println(s);
				}
						
						
					
		
	}
}
