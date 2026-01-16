package com.tanisha;

import java.util.Arrays;

public class Heap {

	int a[];
	int count;
	Type type;
	
	enum Type {
		MIN,
		MAX
	}
	
	public Heap(Type type,int size) {
		count=0;
		this.type=type;
	    a=new int[size];
	}
	public int parent(int i) {
		if(i>a.length&&i<=0) {
			return -1;
		}
		return (i-1)/2;
	}
	public int leftChild(int i) {
		int j=2*i+1;
       if(j>count&&j<0) {
			return -1;
		}
		return j;
	}
	public int rightChild(int i) {
		int j=2*(i+1);
       if(j>count) {
			return -1;
		}
		return j;
	}
	public void heapify(int i) {
		if(i<=0) {
			return;
		}
		int p=parent(i);
		if((a[p]<a[i]&&type.equals(Type.MAX))  ||(a[p]>a[i]&&type.equals(Type.MIN))) {
			int temp=a[p];
			a[p]=a[i];
			a[i]=temp;
			heapify(p);
		}
	}
	public void insert(int n) {
		a[count]=n;
		heapify(count);
		count++;
	}
	public static void main(String args[]) {
		Heap heap=new Heap(Type.MAX,10);
		heap.insert(13);
		heap.insert(19);
		heap.insert(16);
		heap.insert(12);
		heap.insert(18);
		heap.insert(15);
		heap.insert(10);

		System.out.println(Arrays.toString(heap.a));
		heap.insert(14);
		System.out.println(Arrays.toString(heap.a));
	}

}
