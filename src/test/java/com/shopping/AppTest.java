package com.shopping;

import com.shopping.card.type.CardType;
import com.shopping.card.type.factory.AbstractFactory;
import com.shopping.card.type.factory.creator.FactoryCreator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		String cardType1 = "regular";
		AbstractFactory regularFactory = FactoryCreator.getFactory("cardtype");
		CardType regCardType = regularFactory.getCardType(cardType1);
		double discountAmount1 = regCardType.calculateDiscount(15000);
		assertEquals(1500.0, discountAmount1);

		String cardType2 = "PREMIUM";
		AbstractFactory premiumFactory = FactoryCreator.getFactory("cardtype");
		CardType preCardType = premiumFactory.getCardType(cardType2);
		double discountAmount2 = preCardType.calculateDiscount(20000);
		assertEquals(4200.0, discountAmount2);

	}
}
