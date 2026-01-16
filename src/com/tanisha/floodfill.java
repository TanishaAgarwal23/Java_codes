package com.tanisha;

import java.util.Arrays;

public class floodfill {
	
	public static void main(String args[]) {
		int[][]array = {
				{0,1,1,0,0,0},
				{1,0,0,1,0,0},
				{1,0,0,0,1,0},
				{1,0,0,1,1,0},
				{0,1,1,0,0,0}
				
		};
		floodFill(array,2,2);
		for(int i=0;i<array.length;i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		}
	public static void floodFill(int array[][], int x,int y) {
	    if(x>=array.length || x<0 || y>=array.length || y<0 || array[x][y]==1) {
			return;
	    
		}
	   
	    array[x][y]=1;
	    floodFill(array,x+1,y);
	    floodFill(array,x,y+1);
	    floodFill(array,x-1,y);
	    floodFill(array,x,y-1);
	}
		
	}


