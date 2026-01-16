package com.tanisha;
import java.util.Stack;
public class IsPalindrome {
	// Redo without linked list
	public static void main(String args[]) {
		String a[]= {"a","b","c","b","X","b","c","b","a"};
		LinkedListString ll=new LinkedListString();
		ll.insertAtBeginning("a");
		ll.insertAtBeginning("b");
		ll.insertAtBeginning("c");
		ll.insertAtBeginning("b");
		ll.insertAtBeginning("X");
		ll.insertAtBeginning("b");
		ll.insertAtBeginning("c");
		ll.insertAtBeginning("b");
		ll.insertAtBeginning("a");
		//ll.print();
		//System.out.println(isPalindrome(ll));
		System.out.println(ispalindrome(a));
	}
	public static boolean ispalindrome(String a[]) {
		Stack<String>stack=new Stack<>();
		int i=0,n=0;
		for(; i<a.length ;i++) {
			if(!a[i].equals("X")) {
			stack.push(a[i]);
		}
		 else {
			 n=i;
			 break;
		}
		}
		System.out.println(stack);
		
			 for(int j=n+1;j<a.length;j++) {
			String top=stack.peek();
			if(a[j] == top) {
				stack.pop();
			}
			else {
				return false;
			}
			if(stack.size()==0) {
				return true;
			}
		}
			return true; 
		}
	
				
	
	
	// bad algo
	public static boolean isPalindrome(LinkedListString ll) {
		if(ll.getHead()==null) {
			return true;
		}
		Stack<String>stack=new Stack<>();
		NodeString slow=ll.getHead();
		NodeString fast=ll.getHead();
		while(fast!=null && fast.getNext()!=null) {
			stack.push(slow.getData());
			slow=slow.getNext();
			fast=fast.getNext().getNext();
		}
	 if(fast!=null) {
		 slow=slow.getNext();
	 }
		 
		while(slow!=null) {
			if(stack.pop()!=slow.getData()) {
				return false;
			}
			slow=slow.getNext();
		}
		// error
		return true;
	}
}

