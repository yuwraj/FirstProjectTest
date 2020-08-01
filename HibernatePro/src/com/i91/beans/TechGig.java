package com.i91.beans;

public class TechGig {
	public static void main(String args[]) {
		int land = 10, ferti = 10, otherFerti = 5, wheatReqFerti = 2, wheatReqOthFerti = 2, riceReqFerti = 3,
				riceReqOthFerti = 1, wheatPrice = 14, ricePrice = 25;
		/*
		 * land = in.nextInt(); ferti = in.nextInt(); otherFerti = in.nextInt();
		 * wheatReqFerti = in.nextInt(); wheatReqOthFerti = in.nextInt();
		 * riceReqFerti = in.nextInt(); riceReqOthFerti = in.nextInt();
		 * wheatPrice = in.nextInt(); ricePrice = in.nextInt();
		 */
		double landUsedByFertiWheat = (double) ferti / wheatReqFerti;
		double landUsedByOthFertiWheat = (double) otherFerti / wheatReqOthFerti;
		double wheatFinalLand = 0;
		if (landUsedByFertiWheat > landUsedByOthFertiWheat) {
			wheatFinalLand = landUsedByOthFertiWheat;
		} else {
			wheatFinalLand = landUsedByFertiWheat;
		}

		double wheatFinalPrice = (double) wheatFinalLand * wheatPrice;
		double landUsedByFertiRice = (double) ferti / riceReqFerti;
		double landUsedByOthFertiRice = (double) otherFerti / riceReqOthFerti;
		double riceFinalLand = 0;
		if (landUsedByFertiRice > landUsedByOthFertiRice) {
			riceFinalLand = landUsedByOthFertiRice;
		} else {
			riceFinalLand = landUsedByFertiRice;
		}

		double riceFinalPrice = (double) riceFinalLand * ricePrice;
		if (riceFinalPrice > wheatFinalPrice) {
			System.out.println(String.format("%.2f", riceFinalPrice) + " " + String.format("%.2f", 0.00) + " "
					+ String.format("%.2f", riceFinalLand));
		} else {
			System.out.println(String.format("%.2f", wheatFinalPrice) + " " + String.format("%.2f", wheatFinalLand)
					+ " " + String.format("%.2f", 0));
		}

	}
}