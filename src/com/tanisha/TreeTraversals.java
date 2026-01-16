package com.tanisha;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversals {
//private static ArrayList<Integer> path;
public static void main(String args[]) {
	BTNode n1=new BTNode(1);
	BTNode n2=new BTNode(2);
	BTNode n3=new BTNode(3);
	BTNode n4=new BTNode(4);
	BTNode n5=new BTNode(5);
	BTNode n6=new BTNode(6);
	BTNode n7=new BTNode(7);
	n1.setLeft(n2);
	n1.setRight(n3);
	n2.setLeft(n4);
	n2.setRight(n5);
	n3.setLeft(n6);
	n3.setRight(n7);
	/*levelOrder(n1);
	BTNode mirror = convertMirrorCopy(n1);
	levelOrder(mirror);
	levelOrder(n1);*/
	//List<Integer> inOrder = List.of(4,2,5,1,6,3);
	//List<Integer> preOrder = List.of(1,2,4,5,3,6);
	//BTNode result=createTreeFromTraversal(inOrder,preOrder);
	//preOrder(result);
	//System.out.println();
	//postOrder(result);
	//System.out.println();
	//inOrder(result);
	//System.out.println();
	//levelOrder(result);
	//System.out.println();
System.out.println("preOrder");
	preOrder(n1);
	System.out.println("postOrder");
	postOrder(n1);
	System.out.println("inOrder");
	inOrder(n1);
	System.out.println("levelOrder");
	levelOrder(n1);
//System.out.println(getHeight(n1));
//System.out.println(getMax(n1));
//System.out.println(searchElement(n1,8));
//List<Integer> path1=new ArrayList<>();
//System.out.println(findPath(n1,12,path1));
//System.out.println(path1);
	BTNode lca = findLowestCommonAncestor(n1,3,6);
	System.out.println("Lowest common ancestor: " + lca.getData());
	List<Integer> p=new ArrayList<>();
	findPathToLCA(p,n1,2,5);
	System.out.println(p);
}
public static void preOrder(BTNode node) {
	if(node==null) {
		return;
	}
	System.out.println(node.getData());
	preOrder(node.getLeft());
	preOrder(node.getRight());
}
public static void postOrder(BTNode node) {
	if(node==null) {
		return;
	}
	
	postOrder(node.getLeft());
	postOrder(node.getRight());
	System.out.println(node.getData());
}
public static void inOrder(BTNode node) {
	if(node==null) {
		return;
	}
	
	inOrder(node.getLeft());
	System.out.println(node.getData());
	inOrder(node.getRight());
	
}
public static void levelOrder(BTNode node) {
	Queue<BTNode> queue =new LinkedList<>();
	if(node==null) {
		return;
	}
	queue.add(node);
	while(!queue.isEmpty()) {
		BTNode n=queue.remove();
		System.out.println(n.getData());
	if(	n.getLeft()!=null) {
		 queue.add(n.getLeft());
		 }
	if(	n.getRight()!=null) {
		queue.add(n.getRight());
			}
		}
	}
public static int getHeight(BTNode node) {                   
     if(node == null){              
     return -1;                      
  }                                 
  else{                             
     int left = getHeight(node.getLeft());  
     int right = getHeight(node.getRight());
     if(left > right){              
         return 1+left;           
     }                              
     else{                          
         return 1+right;          
     	}                              
  	}                               
}

public static int getMax(BTNode node) {
	if(node == null) {
		return Integer.MIN_VALUE;
	}
	int max = node.getData();
		int leftMax = getMax(node.getLeft());
		int rightMax = getMax(node.getRight());
		if(leftMax > max) {
			max = leftMax;	
		}
		if(rightMax > max) {
			max = rightMax;
		}
		return max;
}
public static boolean searchElement(BTNode node,int n) {
	if(node==null) {
		return false;
	}
	if(node.getData()==n) {
		return true;
	}
	
	return searchElement(node.getLeft(),n) || searchElement(node.getRight(),n);
}

public static boolean findPath(BTNode node,int n, List<Integer> path) {
	if(node==null) { 
		return false;
	}
	path.add(node.getData());
	if(node.getData()==n) {
		return true;
	}
	boolean find=findPath(node.getLeft(),n,path);
		if(find) {
			return true;
		}
	find=findPath(node.getRight(),n,path);
		if(find) {
			return true;
		}
		path.remove(path.size()-1);
//		path.remove(Integer.valueOf(node.getData()));
		return false;
	}
public static boolean isMirror(BTNode n1,BTNode n2) {
	if(n1==null&&n2==null) {
		return true;
	}
	if(n1==null||n2==null) {
		return false;
	}
	return isMirror(n1.getLeft(),n2.getRight()) && isMirror(n1.getRight(),n2.getLeft());

}
public static void convertMirror(BTNode n1) {
	if(n1==null) {
		return;
	}
	BTNode temp = n1.getLeft();
	n1.setLeft(n1.getRight()); 
	n1.setRight(temp);
	convertMirror(n1.getLeft());
	convertMirror(n1.getRight());
}

public static BTNode convertMirrorCopy(BTNode n1) {
	if(n1==null) {
		return null;
	}
	
	BTNode copy = new BTNode(n1.getData());
	copy.setLeft(convertMirrorCopy(n1.getRight()));
	copy.setRight(convertMirrorCopy(n1.getLeft()));
	return copy;
}
public static BTNode createTreeFromTraversal(List<Integer> inOrder,List<Integer> preOrder) {
	if(inOrder.isEmpty() || preOrder.isEmpty()) {
		return null;
	}
	BTNode n = new BTNode(preOrder.get(0));
	//find index of n
	int i=0;
	for(;i<inOrder.size();i++) {
		if(n.getData() == inOrder.get(i)) {
			break;
		}
	}
	//sublist - higher value is exclusive
	n.setLeft(createTreeFromTraversal(inOrder.subList(0, i),preOrder.subList(1, i+1)));
	n.setRight(createTreeFromTraversal(inOrder.subList(i+1, inOrder.size()),preOrder.subList(i+1,preOrder.size())));
	return n;
}
public static BTNode findLowestCommonAncestor(BTNode node,int n1,int n2) {
	if(node==null) {
		return null;
	}
	if(node.getData()==n1||node.getData()==n2) {
		return node;
	}
	BTNode left=findLowestCommonAncestor(node.getLeft(),n1,n2);
	BTNode right=findLowestCommonAncestor(node.getRight(),n1,n2);
	if (left != null && right != null) {
		return node;
        }
	if (left != null) {
		return left;
	   }
		return right;
	}

public static BTNode findPathToLCA(List<Integer> p,BTNode node,int n1,int n2) {
	if(node==null) {
		return null;
	}
	int index = p.size();
	p.add(node.getData());
	//System.out.println(p);
	if(node.getData()==n1||node.getData()==n2) {
		return node;
	}
	BTNode left=findPathToLCA(p,node.getLeft(),n1,n2);
	BTNode right=findPathToLCA(p,node.getRight(),n1,n2);
	if(left==null && right==null) {
		p.remove(index);
	}
	if (left != null && right != null) {
		for(int i=p.size()-1;i>index;i--) {
			p.remove(i);
		}
		return node;
        }
	if (left != null) {
		return left;
	   }
		return right;
	}
}

