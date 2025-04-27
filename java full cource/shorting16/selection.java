import java.util.*;
public class selection{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
      }
    public static void main(String args[]){
        int arr[]={55,6,78,43,24,52};
        //selection sort
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1; j<arr.length;i++){
                if(arr[smallest]>arr[i]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        printArray(arr);
    }
}

