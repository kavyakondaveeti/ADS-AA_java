import java.util.*;
import java.util.*;
public class SelectionSort{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of elements");
         int n=sc.nextInt();
         int[] array = new int[n];
         System.out.println("Enter any "+n+" elements");
         for(int i=0;i<n;i++){
              array[i]= sc.nextInt();
              
         }
         selectionSort(array);
         System.out.println("Sorted array is:");
         for(int i=0;i<n;i++){
              System.out.println(array[i]);
         }
    }
     static void selectionSort(int[] array){
          int n=array.length;
          for(int i=0;i<n-1;i++){
              int min=i;
              for(int j=i+1;j<n;j++){
                 if(array[min]>array[j]){
                     min=j;                      
                  }
                  int temp=array[min];
                  array[min]=array[i];
                  array[i]=temp;
              }  
          }
     }
}