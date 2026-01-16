package course;
/* given n friends, each one can remain single or can be paired up with some other
 * friend. each friend can be paired only once. find out the total number of ways in which friends 
 * can remain single or can be paired up. */
public class FriendsPairingProb {

	public static int FriendsPairingProb(int n) {
		if(n==1||n==2) {
			return n;
		}
		//choice
		//single
		//int fnm1=FriendsPairingProb(n-1);
		//pair
		//int fnm2=FriendsPairingProb(n-2);
		//int pairWays=(n-1)*fnm2;
		//totWays
		//int TotalWays=fnm1 + pairWays;
		return FriendsPairingProb(n-1)+(n-1)*FriendsPairingProb(n-2);
		}
public static void main(String args[]) {
	System.out.println(FriendsPairingProb(6));
}
}
