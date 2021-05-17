package jp.te4a.spring.boot.myapp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Test;

public class HelloControllerTest {

	//@Test
	
	public void test() {
		HelloController hellocontroller = new HelloController();
		String expected = "this is Spring Boot sample.";
		String autual = hellocontroller.index();
		
		assertEquals(expected,autual);
		
	}
}
