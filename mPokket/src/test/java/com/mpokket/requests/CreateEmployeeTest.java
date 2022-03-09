package com.mpokket.requests;

		import org.testng.annotations.Test;

import com.mpokket.pojoLibrary.CreateEmployeePOJO;
import com.mpokket.utility.BaseTest;
import com.mpokket.utility.IEndPoints;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;

		public class CreateEmployeeTest extends BaseTest{
		@Test
		public void createEmployee() {

		  CreateEmployeePOJO createEmpPOJO = new CreateEmployeePOJO("Anagha", "20000", "27");
		   Response createEmpResponse = RestAssured.given()
		    .contentType(ContentType.JSON)
		    .body(createEmpPOJO, ObjectMapperType.JACKSON_1)
		  .when()
		    .post(IEndPoints.CREATE_EMPLOYEE);
		   createEmpResponse.then()
		     .assertThat().contentType(ContentType.JSON)
		     .statusCode(200)
		     .log().all();
		}

}
