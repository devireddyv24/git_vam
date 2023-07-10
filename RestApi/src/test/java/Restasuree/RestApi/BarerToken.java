package Restasuree.RestApi;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BarerToken {
	public  String token;
	static int i=0;
@Test(priority = 1,enabled = true)
public void token() {
	HashMap dat = new HashMap<>();
	i++;
	dat.put("clientName", "dev1"+i);
	dat.put("clientEmail", "testing1"+i+"@gmail.com");
	
	token= given().contentType("application/json").body(dat).when().post("https://simple-books-api.glitch.me/api-clients/").jsonPath().get("accessToken").toString();
	
	
	System.out.println(token);

}
public String orderid;
@Test(priority = 2,dependsOnMethods = "token")
public void res() {
	System.out.println(token);
	HashMap dat = new HashMap<>();
	dat.put("bookId", 1);
	dat.put("customerName", "testes");
	 orderid=given().contentType("application/json").body(dat).headers("Authorization","Bearer "+token)
	.when().post("https://simple-books-api.glitch.me/orders").jsonPath().get("orderId").toString();
	
	
}
@Test(priority = 3,dependsOnMethods = {"token","res"})
public void Getorderdetail() {
	System.out.println(orderid);
	given().headers("Authorization","Bearer "+token).when().get("https://simple-books-api.glitch.me/orders/"+orderid).then().statusCode(200).log().all();
}
}
