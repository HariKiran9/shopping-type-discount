/**
 * 
 */
package com.shopping.card.type.impl;

import com.shopping.card.type.CardType;

/**
 * @author bc887d
 *
 */
public class PremiumCardTypeImpl implements CardType {

	private final String CARD_TYPE;

	public PremiumCardTypeImpl() {
		this.CARD_TYPE = "PREMIUM";
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

		double discountSlab1 = 10d;
		double discountSlab2 = 15d;
		double discountSlab3 = 20d;
		double discountSlab4 = 30d;

		double discountAmount1 = 0d;
		double discountAmount2 = 0d;
		double discountAmount3 = 0d;
		double discountAmount4 = 0d;

		double amountSlab1 = 4000;
		double amountSlab2 = amount - amountSlab1;
		double amountSlab3 = amountSlab2 - amountSlab1;
		double amountSlab4 = amountSlab3 - amountSlab1;

		if (amount > 0 && amount <= 4000) {
			discountAmount1 = (discountSlab1 * amount) / 100;
			finalDiscountAmount = discountAmount1;
		} else if (amount > 4000 && amount <= 8000) {
			discountAmount1 = (discountSlab1 * amountSlab1) / 100;
			discountAmount2 = (discountSlab2 * amountSlab2) / 100;
			finalDiscountAmount = discountAmount2 + discountAmount1;
		} else if (amount > 8000 && amount <= 12000) {
			discountAmount1 = (discountSlab1 * amountSlab1) / 100;
			discountAmount2 = (discountSlab2 * amountSlab1) / 100;
			discountAmount3 = (discountSlab3 * amountSlab3) / 100;
			finalDiscountAmount = discountAmount3 + discountAmount2 + discountAmount1;
		} else {
			discountAmount1 = (discountSlab1 * amountSlab1) / 100;
			discountAmount2 = (discountSlab2 * amountSlab1) / 100;
			discountAmount3 = (discountSlab3 * amountSlab1) / 100;
			discountAmount4 = (discountSlab4 * amountSlab4) / 100;
			finalDiscountAmount = discountAmount4 + discountAmount3 + discountAmount2 + discountAmount1;
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
