import java.util.*;
public class arrays_twoD {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row in arrays :");
        int rows=sc.nextInt();
         System.out.println("Enter the size of column in arrays :");
        int column=sc.nextInt();
        int number[][] =new int[rows][column];
        //input
        //row
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<column;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the which u want to search :");
        int x=sc.nextInt();

         //output
         for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
               // System.out.print(number[i][j]+ " ");
               //compare with x

               if(number[i][j]==x){
                System.out.println("x found at location :"+i+j);
               }
            }
            System.out.println();
         }


    }
}
