package com.tanisha;
import java.util.Arrays;
import java.util.List;
public class LinkedListProb {
public static void main(final String args[]) {
	final LinkedList ll=new LinkedList();
	Arrays.asList(8,7,5,6,1,3,2,4).forEach(ll::insertAtBeginning);
	final LinkedList ll2=new LinkedList();
	Arrays.asList(8,7,5,6,1,3,2,4).forEach(ll2::insertAtBeginning);
	Node lastNode=ll2.getHead();
	Node midNode=ll2.getHead();
	for(int i=0;i<3;i++) {
		midNode=midNode.getNext();
	}
	while(lastNode.getNext()!=null) {
		lastNode=lastNode.getNext();
	}
	lastNode.setNext(midNode);
	//System.out.println(lastNthElement(3,ll));
	final LinkedList ll3=new LinkedList();
	Arrays.asList(9,6,4,3,1,1,0).forEach(ll3::insertAtBeginning);
	final LinkedList ll4=new LinkedList();
	Arrays.asList(8,7,7,5,2).forEach(ll4::insertAtBeginning);
	final LinkedList ll5=new LinkedList();
	Arrays.asList(7,6,5,4,3,2,1).forEach(ll5::insertAtBeginning);
	System.out.println(isCycle(ll));
	//System.out.println(isCycle(ll2));
	//System.out.println(findStartOfCycle(ll));
	//System.out.println(findStartOfCycle(ll2));
	//System.out.println(reverse(ll));
	//System.out.println(mergeTwoSortedLinkedList(ll3,ll4));
	//System.out.println(middleNode(ll));
	System.out.println(reverseKgroup(ll5,3));
	ll5.print();
}
public static LinkedList mergeTwoSortedLinkedList(LinkedList ll3,LinkedList ll4) {
	final LinkedList result=new LinkedList();
	Node current1 =ll3.getHead();
	Node current2=ll4.getHead();
	Node n=new Node(0);
	Node current=n;
	if(ll3==null) {
		return ll4;
	}
	if(ll4==null) {
		return ll3;
	}
	   while(current1!=null && current2!=null) {
		   if(current1.getData()<=current2.getData()) {
			   current.setNext(current1);
			   current1=current1.getNext();
		   }
		   else {
			   current.setNext(current2);
			   current2=current2.getNext();
		   }
		   current=current.getNext();
	   }
	   if(current1!=null) {
		   current.setNext(current1);
	   }
	   else {
		   current.setNext(current2);
	   }
	 result.setHead(n.getNext());
	   return  result;
	   }

public static int reverse(LinkedList ll) {
	Node prev=null;
	Node current=ll.getHead();
	Node next=null;
	if(ll.getHead()==null) {
		return -1;
	}
	while(current!=null) {
		 next=current.getNext();
		 current.setNext(prev);
		//update
		prev=current;
		current=next;
	}
     next=prev;
     ll.setHead(next);
     return next.getData();     
    }
public static int reverseKgroup(LinkedList ll5,int k) {
	if(k<=1 || ll5.getHead()==null) {
		return ll5.getHead().getData();
	}
	Node prev=null;
	Node current =ll5.getHead();
	while(true) {
		Node last=prev;
		Node newEnd=current;
		Node next=current.getNext();
		for(int i=0;current!=null&&i<k;i++) {
			current.setNext(prev);
			prev=current;
			current=next;
			if(next!=null) {
				next=next.getNext();
			}
		}
		if(last!=null) {
			last.setNext(prev);
			}
		else {
			ll5.setHead(prev);
		}
		newEnd.setNext(current);
		if(current==null) {
			break;
		}
		prev=newEnd;
	}
	return ll5.getHead().getData();
}

public static boolean isCycle(LinkedList ll) {
	Node slowpt=ll.getHead();
	Node fastpt=ll.getHead();
	 if(ll.getHead()==null) {
		 return false;
	 }
	 while(fastpt!=null && fastpt.getNext()!=null)
	 {
		 slowpt=slowpt.getNext();
		 fastpt=fastpt.getNext().getNext();
		 if(slowpt==fastpt) {
			 return true;
		 }
	 }
	 return false;
	}
public static int middleNode(LinkedList ll) {
	Node slow=ll.getHead();
	Node fast=ll.getHead();
	while(fast!=null && fast.getNext()!=null) {
		slow=slow.getNext();
		fast=fast.getNext().getNext();
	}
	return slow.getData();
}
public static int findStartOfCycle(LinkedList ll) {
	Node slowpt=ll.getHead();
	Node fastpt=ll.getHead();
	Node ptr=ll.getHead();
	boolean hasCycle=false;
	 if(ll.getHead()==null) {
		 return -1 ;
	 }
	 while(fastpt!=null && fastpt.getNext()!=null)
	 {
		 slowpt=slowpt.getNext();
		 fastpt=fastpt.getNext().getNext();
		 if(slowpt==fastpt) {
			 hasCycle=true;
			 break;
		 }
     }
		 if(!hasCycle) {
			 return -1;
		 }
			 while(slowpt!=ptr)
				  {
				 slowpt=slowpt.getNext();
				 ptr=ptr.getNext();
				  }	 
	 return slowpt.getData();
}
 public static int lastNthElement(int n,LinkedList ll) {
	 Node current =ll.getHead();
	 int count=1;
	 Node lastnth=null;
	 if(ll.getHead()==null ) {
		 return -1;
	 }
	 while(current!=null) {
		 if(count==n) {
			 lastnth=ll.getHead();
		 }
		 else if(lastnth!=null) {
			  lastnth=lastnth.getNext();
		 }
		current= current.getNext();
	      count++;
		 }
	 if(lastnth==null) {
		 return -1;
	 }
	 return lastnth.getData();
 }
}
