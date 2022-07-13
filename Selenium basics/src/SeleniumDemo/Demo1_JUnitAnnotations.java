package SeleniumDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Demo1_JUnitAnnotations {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Inside beforeALL");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Inside AfterALL");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inside before");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Inside after");
	}

	@Test
	void test() {
		System.out.println("Inside test1");
	}
	
	

}
