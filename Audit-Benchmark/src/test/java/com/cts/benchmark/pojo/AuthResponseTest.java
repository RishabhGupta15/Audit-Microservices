package com.cts.benchmark.pojo;

import static org.junit.Assert.assertNotEquals;
/**
 * Test AuthResponse class
 */
//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthResponseTest {

AuthResponse authResponse=new AuthResponse();
	
	/**
	 * Testing constructor
	 */
	@Test
	public void testAuthResponseConstructor()
	{
		AuthResponse response=new AuthResponse("abc", true);
		assertEquals( "abc" ,  response.getUid() );
	}
	/**
	 * Testing setter for uid
	 */
	@Test
	public void testUid()
	{
		authResponse.setUid("abc");
		assertEquals("abc" , authResponse.getUid() );
	}
	/**
	 * Testing isValid setter
	 */
	
	@Test
	public void testIsValid()
	{
		authResponse.setValid(true);
		assertEquals( true , authResponse.isValid());
	}
	
	/** 
	 * Testing toString method
	 */
	@Test
	public void testtoString() 
	{
        String s = authResponse.toString();
        assertEquals( s , authResponse.toString());
    }
	@Test
	public void testHashCode1()
	{
		AuthResponse model=new AuthResponse();
		authResponse=model;
		assertEquals(model.hashCode(),authResponse.hashCode());
	}
	@Test
	public void testHashCode2()
	{
		AuthResponse model=new AuthResponse("Green",true);
		authResponse=new AuthResponse();
		assertNotEquals(model.hashCode(),authResponse.hashCode());
	}
	@Test
	public void testEquals1()
	{
		AuthResponse model=new AuthResponse();
		authResponse=new AuthResponse();
		assertEquals(model,authResponse);
	}
	@Test
	public void testEquals2()
	{
		AuthResponse model=new AuthResponse("Green",true);
		authResponse=new AuthResponse();
		assertNotEquals(authResponse,model);
	}
}
