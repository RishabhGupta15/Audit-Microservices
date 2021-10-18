package com.cognizant.model;

import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author POD5

 *  For testing the AuthResponse 
 * 
 */

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthResponseTest {

AuthResponse authResponse=new AuthResponse();
	/**
	 * to test  the AuthResponseConstructor()
	 * all params constructor
	 */
	@Test
	public void testAuthResponseConstructor()
	{
		AuthResponse response=new AuthResponse("abc", true);
		assertEquals( "abc" ,  response.getUid() );
	}
	/**
	 * to test the setter getter for user ID
	 */
	@Test
	public void testUid()
	{
		authResponse.setUid("abc");
		assertEquals("abc" , authResponse.getUid() );
	}
	
	/**
	 * to test the setter getter for validity
	 */
	@Test
	public void testIsValid()
	{
		authResponse.setValid(true);
		assertEquals( true , authResponse.isValid());
	}
	/**
	 * to test the toString method 
	 */
	@Test
	public void testtoString() 
	{
        String s = authResponse.toString();
        assertEquals( s , authResponse.toString());
    }
	@Test
	public void testHashCode()
	{
		AuthResponse model=new AuthResponse();
		authResponse=model;
		assertEquals(model.hashCode(),authResponse.hashCode());
	}
	@Test
	public void testHashCode2()
	{
		AuthResponse model=new AuthResponse("1", false);
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
		AuthResponse model=new AuthResponse("2",true);
		authResponse=new AuthResponse();
		assertNotEquals(model,authResponse);
	}

}
