/**
 * 
 */
package com.shopping.card.type.factory.creator;

import com.shopping.card.type.factory.AbstractFactory;
import com.shopping.card.type.factory.CardTypeFactory;

/**
 * @author bc887d
 *
 */
public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("cardtype")) {
			return new CardTypeFactory();
		}
		return null;
	}

}
