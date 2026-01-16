package com.tanisha;
//arrayfromstack
import java.util.Arrays;
public class Stack {
	int[] stack;
	int top;

	public Stack(int stackSize)
	{
		stack=new int[stackSize];
		top=-1;
	}

public static void main(String args[]) {
	
	Stack stack=new Stack(10);
	stack.push(0);
	stack.push(1);
	stack.push(2);
	System.out.println(stack);
 }
public void push(int data) {
	if(top==stack.length-1) {
		throw new StackOverflowError();
	}
	stack[++top]=data;
}
public int pop() {
	if(top==-1) {
		throw new RuntimeException();
	}
	return stack[top--];
}
public int peek() {
	if(top==-1) {
		return -1;
	}
	return stack[top];
}
public String toString() {
	return Arrays.toString(stack);
}
}
