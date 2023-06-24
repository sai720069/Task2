package in.veridic;

import in.veridic.Service.AdditionService;
import in.veridic.Utility.AdditionUtility;
import in.veridic.model.AdditionResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Task2ApplicationTests {

	@Test
	void testAddition()
	{
		int a = 1;
		int b = 2;
		int result = 3;

		AdditionUtility additionUtility = new AdditionUtility();
		int addition = additionUtility.addition(a, b);
		Assertions.assertEquals(result,addition);

	}
}
