/**
 * 
 */
package com.shopping.card.type;

/**
 * @author bc887d
 *
 */
public interface CardType {

	public String getCardType();

	public double calculateDiscount(double amount);
}
