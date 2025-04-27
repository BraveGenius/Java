import java.util.*;

public class binarysearch{
    public static int binarysearch(int number[],int key){
        int start=0; int end= number.length-1;
        for (int i=0; i<number.length-1;i++){
            int mid =(start+end)/2;
            if (number[mid] == key)
            {
                return mid; 
            }
            if (number[mid]<key){//right
                start =mid+1;
            }
            else{//left
                end = mid-1;
            }
        }
               return -1;      
    }
    
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16,18};
        int key=10;
       
        System.out.println("index of key :"+ binarysearch(number, key));
      
    }
}