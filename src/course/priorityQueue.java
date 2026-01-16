package course;
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
 //imp 
	static class Student implements Comparable<Student>{//overriding
		String name;
		int rank;
		
		public Student(String name,int rank) {
			this.name=name;
			this.rank=rank;
		}
		@Override
		public int compareTo(Student s2) {
			return this.rank-s2.rank;
		}
	}
	public static void main(String args[]) {
		/*PriorityQueue<Integer> pq=new PriorityQueue(Comparator.reverseOrder());//descending order
		pq.add(3);
		pq.add(7);
		pq.add(1);
		pq.add(5);
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.remove();*/
		PriorityQueue<Student> st=new PriorityQueue<>();
		st.add(new Student("A",4));
		st.add(new Student("B",5));
		st.add(new Student("C",2));
		st.add(new Student("D",8));
		
		while(!st.isEmpty()) {
			System.out.println(st.peek().name+"->"+st.peek().rank );
			st.remove();
		}
		}
	}


