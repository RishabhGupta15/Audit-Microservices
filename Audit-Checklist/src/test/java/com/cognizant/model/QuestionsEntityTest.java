package com.cognizant.model;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


/**
 * 
 *		   This class contains test cases for the QuestionsEntity model class
 *         which are written using junit and mockito
 */

//@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootTest
public class QuestionsEntityTest {

	QuestionsEntity questions = new QuestionsEntity();
	/**
	 * 
	 * test the allArgsConstructor of QuestionsEntity model class
	 */
	@Test
	public void testQuestionsEntityConstructor() {
		assertNotNull(questions);
	}
	/**
	 * 
	 * test the QuestionsEntityParameterizedConstructor of QuestionsEntity model class
	 */
	@Test
	public void testQuestionsEntityParameterizedConstructor() {
		QuestionsEntity parameterizedQuestions = new QuestionsEntity(1,"Internal","Is data deleted with permission of user?","Yes");
		assertEquals("Internal",parameterizedQuestions.getAuditType());
	}
	/**
	 * 
	 * test the Getter and Setter of Question id in QuestionsEntity model class
	 */
	@Test
	public void testSetQUestionId() {
		questions.setQuestionId(2);
		assertEquals(2,questions.getQuestionId().intValue());
	}
	/**
	 * 
	 * test the Getter and Setter of Audit Type in QuestionsEntity model class
	 */
	@Test
	public void testAuditType() {
		questions.setAuditType("SOX");
		assertEquals("SOX",questions.getAuditType());
	}
	/**
	 * 
	 * test the Getter and Setter of Question in QuestionsEntity model class
	 */
	@Test
	public void testQuestion() {
		questions.setQuestion("How are you");
		assertEquals("How are you",questions.getQuestion());
	}
	/**
	 * 
	 * test the Getter and Setter of Response in QuestionsEntity model class
	 */
	@Test
	public void testResponse() {
		questions.setResponse("No");
		assertEquals("No",questions.getResponse());
	}
	@Test
	public void testToString()
	{
		String str=questions.toString();
		assertEquals(str,questions.toString());
	}
	@Test
	public void testHashCode()
	{
		QuestionsEntity model=new QuestionsEntity();
		questions=new QuestionsEntity();
		assertEquals(model.hashCode(),questions.hashCode());
	}
	@Test
	public void testEquals1()
	{
		QuestionsEntity model=new QuestionsEntity();
		questions=new QuestionsEntity();
		assertEquals(model,questions);
	}
	@Test
	public void testEquals2()
	{
		QuestionsEntity model=new QuestionsEntity(1,"Internal","What is your POD","GREEN");
		questions=new QuestionsEntity();
		assertNotEquals(questions,model);
		
	}
	@Test
	public void testEquals3()
	{
		QuestionsEntity model=new QuestionsEntity(1,"Internal","What is your POD","GREEN");
		questions=model;
		assertEquals(questions,model);
		
	}
}
