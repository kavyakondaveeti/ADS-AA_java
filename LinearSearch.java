import java.util.*;
class LinearSearch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array:");
		int n=sc.nextInt();
		int[] A=new int[n];
		System.out.println("enter "+n+" no. of elements:");
		for(int i=0;i<n;i++){
			A[i]=sc.nextInt();	
		}
		System.out.println("Enter element to search");
		int key=sc.nextInt();
		int x=linearSearch(A,key);
	
		if(x!=-1){
			System.out.println("element is found at the index of "+x);
                }
		else{
			System.out.println("element is not found");
}
		
		
}
public static int linearSearch(int[] A,int key){
	for(int i=0;i<A.length;i++){
		if(A[i]==key){
			return i;
		
		}
	}
	return -1;
}
}