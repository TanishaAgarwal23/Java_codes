package com.tanisha;
import java.util.Stack;
public class RemoveDuplicates {
	public static void main(String args[]) {
		int a[]= {1,9,6,8,8,8,0,1,1,0,6,5};
		boolean flag=false;
		Stack<Integer>stack= new Stack<>();
				for(int i=0;i<a.length;i++) {
					if(flag&&stack.peek()!=a[i]) {
						stack.pop();
						flag=false;
					}
					if(stack.isEmpty()||stack.peek()!=a[i]) {
						stack.push(a[i]);
					}
					else {
						flag=true;
					}
							
				}
		if(flag) {
			stack.pop();
		}
		System.out.println(stack);
	}

}
