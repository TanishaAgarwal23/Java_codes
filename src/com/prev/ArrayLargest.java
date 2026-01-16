package com.prev;

public class ArrayLargest {

	public static int arrayLargest(int numbers[]) {
		int largest=Integer.MIN_VALUE;
		 for(int i=0;i<numbers.length;i++) {
			 if(largest<numbers[i]) {
				 largest=numbers[i];
			 }
		 }
		 return largest;
	}
	public static void main(String args[]) {
		int numbers[]= {7,18,99,16,3,10};
		System.out.println("largest value is:" +arrayLargest(numbers));
	}

}
/*
c++
int main(){
vector<int>arr(5);
vector<int>arr(5,10);      starting 5 values 10-10 10 10 10 10 10 20 30
arr.push_back(10);
arr.push_back(20);
arr.push_back(30);
int n= arr.size();
  
  //largest
  int main(){
  vector<int>arr = {3,2,2,6,1};
  int ans = arr[0];
  for(int i=0;i<arr.size();i++){
    ans=arr[i];}
    }
    cout<<ans<<endl;
  
  
  //2nd largest
   int main(){
   vector<int>arr = {3,2,2,6,1};
   int 1ans=arr[0];
   int 2ans = int.min
   for(int i=0;i<arr.size();i++){
       if(arr[i]>1ans){
       2ans=1ans;
       1ans=arr[i];}
      else if(arr[i] < 1ans){
       if(arr[i] > 2ans){
       2ans=arr[i];
       }
       }
       }
       cout<<2ans<<endl;
       }
   */
*/