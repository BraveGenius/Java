// import java.util.*;

// public class function {
//     public static void printMyNmae(String name){
//         System.out.println(name);
//         return;
//     } 
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         String name = sc.next();
//         printMyNmae(name);
//     }
//      }
/////////////////////////////////
// import java.util.*;

// public class function {
//     public static int calculatesum(int a,int b){
//         int sum =a+b;
        
//         return sum;
//     } 
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number a:");
//         int a = sc.nextInt();
//         System.out.println("Enter the number b :");
//         int b=sc.nextInt();

//        int sum =calculatesum(a, b);
//         System.out.println("sum of two number is: "+sum);
//     }
//      }
//////////////////////////////////
// import java.util.*;
// public class function{
//     public static int calculateproduct(int a,int b){
//        return a*b; 

//     } 
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number A  :");
//         int a=sc.nextInt();
//         System.out.println("Enter the number B :");
//         int b =sc.nextInt();
        
//         System.out.println("product of two number is:"+calculateproduct(a,b) );

//     }
// }
///////////////////////////////////////////////////////////////////
import java.util.*;
public class function{
    public static int printFactorial(int n){
        if(n<0){
            System.out.println("invialid number");
            return 0;
        }
       int factorial =1;
        for (int i=n;i>=1;i--){
            factorial=factorial*i;
        }

       return factorial; 

    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number n :");
        int n =sc.nextInt();
        
        System.out.println("factorial of the numbers are :"+printFactorial(n) );

    }
}


