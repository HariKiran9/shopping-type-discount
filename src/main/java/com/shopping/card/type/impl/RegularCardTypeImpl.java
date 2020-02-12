/**
 * 
 */
package com.shopping.card.type.impl;

import com.shopping.card.type.CardType;

/**
 * @author bc887d
 *
 */
public class RegularCardTypeImpl implements CardType {

	private final String CARD_TYPE;

	public RegularCardTypeImpl() {
		this.CARD_TYPE = "REGULAR";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shopping.card.type.CardType#getCardType()
	 */
	public String getCardType() {
		return this.CARD_TYPE;
	}

	public double calculateDiscount(double amount) {
		double finalDiscountAmount = 0d;
		if (amount == 0) {
			finalDiscountAmount = 0;
		}

		double discountSlab2 = 10d;
		double discountSlab3 = 20d;
		double discountAmount2 = 0d;
		double discountAmount3 = 0d;

		double amountSlab1 = amount - 5000;
		double amountSlab2 = amountSlab1 - 5000;

		if (amount > 0 && amount <= 5000) {

		} else if (amount > 5000 && amount <= 10000) {
			discountAmount2 = (discountSlab2 * amountSlab1) / 100;
			finalDiscountAmount = discountAmount2;
		} else {
			if (amountSlab1 % 5000 == 0) {
				discountAmount2 = (discountSlab2 * amountSlab2) / 100;
			} else {
				discountAmount2 = (discountSlab2 * amountSlab1) / 100;
			}

			discountAmount3 = (discountSlab3 * amountSlab2) / 100;
			finalDiscountAmount = discountAmount2 + discountAmount3;
		}

		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("Discount Rs.");
		sBuilder.append(String.format("%.2f", finalDiscountAmount));
		sBuilder.append(" for Total Amount Rs.");
		sBuilder.append(String.format("%.2f", amount));
		sBuilder.append(" Amount after Discount : ");
		sBuilder.append(String.format("%.2f", amount - finalDiscountAmount));
		System.out.println(sBuilder.toString());
		return finalDiscountAmount;
	}

}
