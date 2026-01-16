package com.tanisha;
public class FindMinMax {
	    public static void main(String[] args) {
	        int[] arr = {15, 89, 53, 78, 45, 6, 9, 36, 72, 19, 66, 49};
	        int n = arr.length;
	        int[] result = findMinMax(arr, 0, n-1);
	        System.out.println("Minimum number in the list: " + result[0]);
	        System.out.println("Maximum number in the list: " + result[1]);
	    }
	    public static int[] findMinMax(int[] arr, int low, int high) {
	        int[] result = new int[2];
	        int mid;
	        int[] result1 = new int[2];
	        int[] result2 = new int[2];
	        
	        if(low == high) {
	            result[0] = arr[low];
	            result[1] = arr[low];
	            return result;
	        }
	        if(high == low + 1) {
	            if(arr[low] > arr[high]) {
	                result[0] = arr[high];
	                result[1] = arr[low];
	            } else {
	                result[0] = arr[low];
	                result[1] = arr[high];
	            }
	            return result;
	        }
	        
	        mid = (low + high) / 2;
	        result1 = findMinMax(arr, low, mid);
	        result2 = findMinMax(arr, mid+1, high);

	        result[0] = Math.min(result1[0], result2[0]);
	        result[1] = Math.max(result1[1], result2[1]);
	        return result;
	    }
	}


