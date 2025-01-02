import java.util.*;
public class BubbleSort{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of elements");
         int n=sc.nextInt();
         int[] array = new int[n];
         System.out.println("Enter any "+n+" elements");
         for(int i=0;i<n;i++){
              array[i]= sc.nextInt();
              
         }
         bubbleSort(array);
         System.out.println("Sorted array is:");
         for(int i=0;i<n;i++){
              System.out.println(array[i]);
         }
    }
     static void bubbleSort(int[] array){
          int n=array.length;
          for(int i=0;i<n;i++){
              for(int j=0;j<n-i-1;j++){
                 if(array[j]>array[j+1]){
                      int temp=array[j+1];
                      array[j+1] =array[j];
                      array[j]=temp;
                  }
              }  
          }
     }
}