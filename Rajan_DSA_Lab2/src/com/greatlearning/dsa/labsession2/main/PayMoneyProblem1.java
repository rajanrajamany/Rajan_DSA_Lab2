package com.greatlearning.dsa.labsession2.main;

import com.greatlearning.common.GetInputs;
import com.greatlearning.interfaces.IreadData;

public class PayMoneyProblem1 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of transaction array");

		IreadData getData = new GetInputs();

		int iSize = getData.readInt();
		int arr[] = new int[iSize];

		System.out.println("Enter the values of array");

		for (int i = 0; i < iSize; i++)
			arr[i] = getData.readInt();

		System.out.println("Enter the total no of targets that needs to be achieved");
		int iIterations = getData.readInt();

		while (iIterations-- != 0) {
			boolean bAchieved = false;
			System.out.println("Enter the value of target");
			long lTarget = getData.readLong();
			long lSum = 0;

			for (int i = 0; i < iSize; i++) {
				lSum += arr[i];
				if (lSum >= lTarget) {
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					bAchieved = true;
					break;
				}
			}
			if (!bAchieved) {
				System.out.println(" Given target is not achieved ");
			}
		}
	}
}