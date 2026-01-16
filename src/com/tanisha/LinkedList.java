//package com.tanisha;
//
//public class LinkedList {
//
//	Node head=null;
//	
//	public static void main(String args[]) {
//		final LinkedList ll = new LinkedList();
//		ll.insertAtEnding(87);
//		ll.insertAtBeginning(67);
//		ll.insertAtBeginning(56);
//		ll.insertAtBeginning(35);
//		ll.insertAtBeginning(67);
//		ll.insertAtEnding(90);
//	   ll.insertAtNthPosition(3, 85);
//	   ll.print();
//	   ll.deleteAtNthPosition(1);
//		ll.print();
//		System.out.println("deleted:" + ll.deleteAtBeginning());
//		ll.print();	
//		System.out.println("deleted:" +ll.deleteAtEnding());
//		ll.print();
//		}
//	
//	public void insertAtBeginning(int data){
//		Node n = new Node(data);
//		n.setNext(head);
//		head=n;
//	}
//	
//	public void insertAtEnding(int data) {
//		Node n1 = new Node(data);
//		if(head==null) {
//			head=n1;
//			return ;
//		}
//		Node n = head;
//		
//		while(n.getNext()!=null) {
//			n = n.getNext();
//		}
//		n.setNext(n1);	
//	}
//	    
//	public int deleteAtBeginning() {
//		if(head==null) {
//			return -1;
//		}
//		int data=head.getData();
//        head=head.getNext();
//        return data; 
//		}
//	public int deleteAtEnding(){
//		
//	   if(head==null) {
//		   return -1;
//	   }
//	   if(head.getNext()==null) {
//		   int data=head.getData();
//		   head=null;
//		   return data;
//	   }
//	   Node n=head;
//	   while(n.getNext().getNext()!=null ) {
//		   n=n.getNext();
//	   }
//	   int data=n.getNext().getData();
//	  n.setNext(null);
//		    return data;
//	}
//	/*public void print(Node head,int data) {
//		Node curr = new Node(data);
//		while(curr!=null) {
//			System.out.println(curr.getData());
//			curr = curr.getNext();
//		}
//	}*/
//	public void insertAtNthPosition(int x,int data) {
//		if(x == 1) insertAtBeginning(data);
//		Node n = new Node(data);
//		Node curr = head;
//		for(int i = 0;i<x-2;i++) {
//			curr = curr.getNext();
//		}
//		n.setNext(curr.getNext());
//		curr.setNext(n);
//		//return head.getData();
//	}
//	public void deleteAtNthPosition(int x) {
//		Node curr = head;
//		if(x == 1) deleteAtBeginning();
//	   for(int i = 0;i<x-2;i++) {
//		   curr = curr.getNext();
//	   }
//	   curr.setNext(curr.getNext().getNext());
//	}
//	public void print() {
//		System.out.println(toString());
//	}
//	
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		Node n = head;
//		while(n!=null) {
//			sb.append(n.getData() + ",");
//			n = n.getNext();
//		}
//		return sb.toString();
//	}
//	public Node getHead() {
//		return head;
//	}
//	public void setHead(Node head) {
//		this.head=head;
//	}
//	public int getLength(int Length) {
//       return Length;
//		}
//}

