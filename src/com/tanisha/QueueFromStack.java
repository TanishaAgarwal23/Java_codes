package com.tanisha;
import java.util.Stack;
public class QueueFromStack {
public static void main(String args[]) {
		queueFromStack queue =new queueFromStack();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
	
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
}
	public static class queueFromStack{
		Stack<Integer>stack1=new Stack<>();
		Stack<Integer>stack2=new Stack<>();
			public void enqueue(int x) {
				stack1.push(x);
			}
			public int dequeue() {
				if(stack1.isEmpty()&&stack2.isEmpty()) {
					throw new IllegalStateException("queue is empty");
				}
				if(stack2.isEmpty()) {
					while(!stack1.isEmpty()) {
						stack2.push(stack1.pop());
					}
				}
				return stack2.pop();
			}
			
	}

}
