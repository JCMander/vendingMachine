package test.Tests;

import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import assessment.Change;
import assessment.Coin;

public class ChangeTest {
	
	Collection<Coin> change;
	Change ch;

	@Before
	public void setUp() throws Exception {
		ch = new Change();
	}

	@Test
	public void test() {
		change = ch.getOptimalChangeFor(10);
		for(Coin coin: change){
			Assert.assertEquals(10, coin.getDenomination());
		}
	}

}
