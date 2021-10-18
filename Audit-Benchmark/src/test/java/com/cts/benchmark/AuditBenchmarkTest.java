package com.cts.benchmark;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class AuditBenchmarkTest {

	@Mock
	private AuditBenchmark benchmark;
	
	@BeforeEach
	public void setup() {
		benchmark = new AuditBenchmark("Internal", 3);
	}
	
	@Test
	public void testGetSetAuditType() {
		assertEquals("Internal", benchmark.getAuditType());
		benchmark.setAuditType("SOX");
		assertEquals("SOX", benchmark.getAuditType());
	}
	@Test
	public void testGetSetAccNoAnswers() {
		assertEquals(new Integer(3), benchmark.getAccNoAnswers());
		benchmark.setAccNoAnswers(1);
		assertEquals(new Integer(1), benchmark.getAccNoAnswers());
	}
	@Test
	public void testToString()
	{
		String str=benchmark.toString();
		assertEquals(str,benchmark.toString());
	}
	@Test
	public void testHashCode1()
	{
		AuditBenchmark model=new AuditBenchmark();
		benchmark=model;
		assertEquals(model.hashCode(),benchmark.hashCode());
		
	}
	@Test
	public void testHashCode2()
	{
		AuditBenchmark model=new AuditBenchmark();
		benchmark=new AuditBenchmark("Internal", 3);
		assertNotEquals(model.hashCode(),benchmark.hashCode());
		
	}
}
