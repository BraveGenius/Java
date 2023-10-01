import java.util.*;
public class loop{
    public static void main(String args[]){
        // for(int counter = 0; counter<10; counter =  counter +1){
        //     //System.out.println("hello world");
        //     //System.out.println(counter);
        //     System.out.println(counter+" ");
        // }
        // for(int i=0; i<11; i++)
        // System.out.println(i);
        ///////////////////////////////
        // int i=0;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }
        ////////////////////
        // int i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // } while(i<11);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to sum :");
        int n=sc.nextInt();
        // int sum=0;
        // for (int i=1; i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println(sum);
        for (int i=1;i<11;i++){
            System.out.println(i*n);
        }


    }
}
