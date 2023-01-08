package com.greatlearning.dsa.labsession2.main;

import com.greatlearning.common.GetInputs;
import com.greatlearning.common.MergeSort;
import com.greatlearning.interfaces.IreadData;

public class CurrencyDenominationProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of currency denominations");
		IreadData getData = new GetInputs();
		int iSize = getData.readInt();

		System.out.println("Enter the currency denominations value");
		int arr[] = new int[iSize];
		for (int i = 0; i < iSize; i++) {
			arr[i] = getData.readInt();
			if (arr[i] <= 0) {
				System.out.println("Denomination cannot be 0 or less than 0, pls. enter a valid denomination");
				i--;
			}
		}

		System.out.println("Enter the amount you want to pay");

		long toPay = getData.readLong();

		MergeSort ob = new MergeSort();
		ob.findDenominations(arr, toPay);

	}
}
