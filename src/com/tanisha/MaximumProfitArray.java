package com.tanisha;

public class MaximumProfitArray {
 public static void main(String args[]){
	 int a[]= {7,1,5,3,6,4};
	 int prices[]= {7,1,5,3,6,4};
	 System.out.println( maxProfit(prices));
	 System.out.println( maxProfit1(prices));
	System.out.println( maximumProfit(a));
	System.out.println( maximumProfit2(a));
 }
 
 
/* Q1.You are given an array prices where prices[i] is the price of a given stock on the ith day.
 You want to maximize your profit by choosing a single day to buy one stock and choosing a different day 
 in the future to sell that stock.
 Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

 
 public static int maxProfit(int[] prices) {
     int i=0;
     int j=1;
     int maxDiff=0;
     while(j<prices.length){
         int diff=prices[j]-prices[i];
         if(diff<0){
             i=j;
         }
         else if(maxDiff<diff){
             maxDiff=diff;
         }
         j++;
     }
       return maxDiff; 
 }
 
 
 /*Q2.On each day, you may decide to buy and/or sell the stock. You can only hold at most one 
 share of the stock at any time. However, you can buy it then immediately sell it on the same day.
  */
 
 
 public static int maxProfit1(int[] prices) {
     int i=0;
     int j=1;
     int p=0;
     while(i<prices.length && j<prices.length){
         int diff = prices[j] - prices[i];
         if(diff > 0){
             p = p + diff;
         }
         i++;
         j++;
     }
     return p;
 }
 
 
 /*Q3.On each day, you may decide to buy and/or sell the stock. You can only hold at most one 
 share of the stock at any time. However, you cannot buy it then immediately sell it on the same day.
  */
 
 
public static int maximumProfit(int a[]) {
	int i=0;
	int j=1;
	int sum=0;
	int maxDiff=0;
	while(j<a.length) {
		int diff=a[j]-a[i];
		if(diff<0) {
			i=j;
			
		}
		else if(maxDiff<diff) {
			maxDiff=diff;
		
		}
		else {
			sum=sum+maxDiff;
			maxDiff=0;
			i=j;
		}
		j++;	
	}
	sum=sum+maxDiff;
	return sum;
}

//method 2(Q3)-


public static int maximumProfit2(int a[]) {
	int sum=0,j=0;
	for(int i=0;i<a.length-1;) {
		for(j=i+1;j<a.length;j++) {
			if(a[j]<a[j-1]) {
				break;
			}
		}
		sum=sum+a[j-1]-a[i];
		i=j;
	}
	return sum;
}
}
