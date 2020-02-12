package com.shopping;

import com.shopping.card.type.CardType;
import com.shopping.card.type.factory.AbstractFactory;
import com.shopping.card.type.factory.creator.FactoryCreator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String cardType1 = "regular";
		AbstractFactory regularFactory = FactoryCreator.getFactory("cardtype");
		CardType regCardType = regularFactory.getCardType(cardType1);
		double discountAmount1 = regCardType.calculateDiscount(15000);
		System.out.println("Card Type : " + regCardType.getCardType() + " \tDiscount Gains Rs. : " + discountAmount1);

		System.out.println("=========================================");

		String cardType2 = "PREMIUM";
		AbstractFactory premiumFactory = FactoryCreator.getFactory("cardtype");
		CardType preCardType = premiumFactory.getCardType(cardType2);
		double discountAmount2 = preCardType.calculateDiscount(20000);
		System.out.println("Card Type : " + preCardType.getCardType() + " \tDiscount Gains Rs. : " + discountAmount2);
	}
}
