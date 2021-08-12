package org.example;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertTrue;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    RestAssured
                .given()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .body("id[0]",equalTo(1))
                .log().all();

    }
    @Test
    public void post()
    {
        JSONObject json=new JSONObject();
        json.put("userId",1);
        json.put("id",11);
        json.put("title",1);
        json.put("body",1);
        RestAssured
                .given()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(json.toJSONString())
                .when()
                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .body("id[1]",2equalTo);
                .log().all();

    }

    @Test
    public void post1()
    {
         RestAssured
                .given()
                .header("Content-Type","application/json")
                 .param("id","2")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .get("https://jsonplaceholder.typicode.com/comments")
                .then()
                .log().all();

    }

}