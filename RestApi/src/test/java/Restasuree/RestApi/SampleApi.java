package Restasuree.RestApi;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class SampleApi {
@Test
public void run() {
	given()
	
	.when()
	     .get("http://localhost:3000/Employ")
	
	.then()
	.statusCode(200)
	.log().all();
}
@Test
public void creating() {
	HashMap data=new HashMap<>();
	data.put("name","dvreddy");
	data.put("job", "testing api");
	data.put("sal",40000);
	given()
	.contentType("application/json")
	.body(data)
	.when()
	.post("http://localhost:3000/Employ")
	
	.then()
	.statusCode(201)
	.log().all();
}
}
