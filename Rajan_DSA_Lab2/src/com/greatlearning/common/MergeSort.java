package com.greatlearning.common;

public class MergeSort {
	public void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] >= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);

		}
	}

	public void findDenominations(int[] arr, long toPay) {
		long lAmount = toPay;
		int iDenominations[] = new int[arr.length];
		sort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length && lAmount != 0; i++) {
			if (lAmount >= arr[i]) {
				long lTmp = arr[i];
				iDenominations[i] = (int) (lAmount / lTmp);
				lAmount = lAmount % arr[i];
			}
		}
		if (lAmount != 0) {
			System.out.println("Denominations not available to make exact payment.");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < iDenominations.length; i++) {
				if (iDenominations[i] != 0) {
					System.out.println(arr[i] + ":" + iDenominations[i]);
				}
			}
		}
	}

}
