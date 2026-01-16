package com.tanisha;

import java.lang.reflect.Array;

public class BracketValidation {

	public static void main(String args[]) {
		String a[] = {"{","(",")","{","}","(","[","]",")","}"};
		LinkedListString ll = new LinkedListString();
		System.out.println(bracketValidation(a,ll));	
	}
	public static boolean bracketValidation(String a[], LinkedListString ll) {
		for(int i=0;i<a.length;i++) {
			String top = ll.peek();
			if((a[i].equals("}") && "{".equals(top))
					|| (a[i].equals(")") && "(".equals(top))
					|| (a[i].equals("]") && "[".equals(top))){
						ll.deleteAtBeginning();
				
			}else if(a[i].equals("{") || a[i].equals("(") || a[i].equals("[")) {
				ll.insertAtBeginning(a[i]);
			}
			else {
				return false;
			}
		}
		return true;
	}

}
