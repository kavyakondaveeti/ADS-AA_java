import java.util.*;
public class InsertionSort{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of elements");
         int n=sc.nextInt();
         int[] array = new int[n];
         System.out.println("Enter any "+n+" elements");
         for(int i=0;i<n;i++){
              array[i]= sc.nextInt();
              
         }
         insertionSort(array);
         System.out.println("Sorted array is:");
         for(int i=0;i<n;i++){
              System.out.println(array[i]);
         }
    }
     static void insertionSort(int[] array){
          int n=array.length;
          for(int i=1;i<n;i++){
              int min=array[i];
              int j=i-1;
              while(j>=0 && min<array[j]){
                 array[j+1]=array[j];
                 j--;
              }
              array[j+1]=min;
          }          

     }
}