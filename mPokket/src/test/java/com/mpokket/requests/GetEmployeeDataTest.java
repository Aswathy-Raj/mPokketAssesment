package com.mpokket.requests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.mpokket.utility.BaseTest;
import com.mpokket.utility.IEndPoints;

import io.restassured.http.ContentType;

public class GetEmployeeDataTest extends BaseTest{
	
	@Test
	public void getEmployeesData() {
	given()
	.pathParam("empid", "EMP_TY_01")
	.when()
	.get(IEndPoints.GET_SINGLE_EMPLOYEE)
	.then()
	.assertThat().statusCode(200)
	.assertThat().contentType(ContentType.JSON)
	.log().all();
	}
}

