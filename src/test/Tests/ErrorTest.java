package test.Tests;

import org.junit.Before;
import org.junit.Test;
import assessment.Error;

public class ErrorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Error.emptyError();
		Error.outOfChangeError(10);
	}

}
