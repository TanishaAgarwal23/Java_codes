package com.tanisha;
import java.util.Stack;
public class ValidatePopSequence {

	public static void main(String args[]){
		int pushed[]= {1,2,3,4,5,6,7,8};
		int popped[]= {2,5,4,6,8,7,3,1};
			System.out.println(validatePopSequence(pushed,popped));
	}
public static boolean validatePopSequence(int pushed[],int popped[]) {
	int n=pushed.length;
	int j=0; //popindex
	Stack<Integer>stack=new Stack<>();
	for(int i=0;i<n;i++) {
		stack.push(pushed[i]);
		while(!stack.isEmpty()&&j<n&&stack.peek()==popped[j]) {
			stack.pop();
			j++;
		}
	}
	return j==popped.length;
}
}
