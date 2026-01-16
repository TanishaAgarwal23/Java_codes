package com.tanisha;

public class LinkedListString {

	NodeString head=null;
	
	public String peek() {
		if (head != null) {
			return head.getData();
		}
		return null;
	}
	
	public void insertAtBeginning(String data){
		NodeString n = new NodeString(data);
		n.setNext(head);
		head=n;
	}
	
	public void insertAtEnding(String data) {
		NodeString n1 = new NodeString(data);
		if(head==null) {
			head=n1;
			return ;
		}
		NodeString n = head;
		
		while(n.getNext()!=null) {
			n = n.getNext();
		}
		n.setNext(n1);	
	}
	    
	public String deleteAtBeginning() {
		if(head==null) {
			return null;
		}
		String data=head.getData();
        head=head.getNext();
        return data; 
		}
	public String deleteAtEnding(){
		
	   if(head==null) {
		   return null;
	   }
	   if(head.getNext()==null) {
		   String data=head.getData();
		   head=null;
		   return data;
	   }
	   NodeString n=head;
	   while(n.getNext().getNext()!=null ) {
		   n=n.getNext();
	   }
	   String data=n.getNext().getData();
	  n.setNext(null);
		    return data;
	}
	public void print() {
		System.out.println(toString());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		NodeString n = head;
		while(n!=null) {
			sb.append(n.getData() + ",");
			n = n.getNext();
		}
		return sb.toString();
	}
	public NodeString getHead() {
		return head;
	}
	public void setHead(NodeString head) {
		this.head=head;
	}
	public int getLength(int Length) {
       return Length;
		}
}

