import java.util.*;

public class largernum{
    public static int getlargest(int number[]){
        int largest=Integer.MAX_VALUE;
        for (int i=0; i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }     
        }
          return largest;

        public static void main(String args[]){
            int number[]={2,4,6,8,10,12,14,16,18};
            System.out.println("largest number is :"+ getlargest(number) );
      
    }
    
}
}