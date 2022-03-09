package com.mpokket.requests;

import org.testng.annotations.Test;

import com.mpokket.utility.BaseTest;
import com.mpokket.utility.IEndPoints;

import static io.restassured.RestAssured.*;

public class DeleteEmployeeTest extends BaseTest{
	
		@Test
		public void deleteEmployee () {
			given()
			.pathParam("empid", "EMP_TY_01")	
		.when()
		.delete(IEndPoints.DELETE_SINGLE_EMPLOYEE)
		.then()
		.assertThat().statusCode(200)

		.log().all();
		}
}
