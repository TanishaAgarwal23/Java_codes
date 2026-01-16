package course;
//print binary strings without consecutive 1's of size N
public class printBinStr {

	public static void printBinStr(int n,int lastPlace,String str) {
		//base case
		if(n==0) {
			System.out.println(str);
			return;
		}
		printBinStr(n-1,0,str +"0");
		if(lastPlace==0) {
			printBinStr(n-1,1,str+"1");
		}
	}
	public static void main(String args[]) {
		printBinStr(4,0,"");
	}

}
