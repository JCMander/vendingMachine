package test.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import assessment.Coin;

public class CoinTest {
	Coin coin;

	@Before
	public void setUp() throws Exception {
		coin = new Coin("One pound", 100);
	}

	@Test
	public void test() {
		Assert.assertEquals("One pound", coin.getCoin());
		Assert.assertEquals(100, coin.getDenomination());
	}

}
