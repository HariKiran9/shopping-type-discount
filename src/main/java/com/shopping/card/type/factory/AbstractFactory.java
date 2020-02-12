/**
 * 
 */
package com.shopping.card.type.factory;

import com.shopping.card.type.CardType;

/**
 * @author bc887d
 *
 */
public abstract class AbstractFactory {

	public abstract CardType getCardType(String cardType);

}
