/**
 * 
 */
package com.shopping.card.type.factory;

import com.shopping.card.type.CardType;
import com.shopping.card.type.impl.PremiumCardTypeImpl;
import com.shopping.card.type.impl.RegularCardTypeImpl;

/**
 * @author bc887d
 *
 */
public class CardTypeFactory extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.shopping.card.type.factory.AbstractFactory#getCardType(java.lang.String)
	 */
	@Override
	public CardType getCardType(String cardType) {
		if (cardType == null) {
			return null;
		}
		if (cardType.equalsIgnoreCase("REGULAR")) {
			return new RegularCardTypeImpl();
		} else if (cardType.equalsIgnoreCase("PREMIUM")) {
			return new PremiumCardTypeImpl();
		}
		return null;
	}

}
