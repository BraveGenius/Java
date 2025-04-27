// import java.util.*;
// public class patterns {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number a :");
//         int n=sc.nextInt();
//         System.out.println("Enter the number b :");
//         int m=sc.nextInt();

//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=m;j++){
//             System.out.print("*");
//             }
//             System.out.println();

//         }
        
//     }
    
// }
////////////////////////////////////////////////////
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sn= new Scanner(System.in);
//         System.out.println("Entert the number N:");
//         int n=sn.nextInt();
//         System.out.println("Enter the number b:");
//         int m=sn.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1; j<=m;j++){
//                 if(i==1 || j==1 || i==n || j==m ){
//                     System.out.print("*");
//                 }
//                 else{
//                 System.out.print(" ");
//             }
//             }
//             System.out.println();
//         }
//     }
// }
///////////////////////////////////////////////
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number N:");
//         int n=sc.nextInt();
//        // System.out.println("Enter the number M:");
//        // int m=sc.nextInt()---check the inverse pattern
          //for(int i=n; i>=1;i--)
//         for(int i=1; i<=n;i++){
//             for(int j=1; j<=i; j++){
                
//                     System.out.print("*");

//             }
//             System.out.println();
        
//         }

//     }
// }

//////////////////////////////////////////////////
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number N:");
//         int n=sc.nextInt();
//        // System.out.println("Enter the number M:");
//        // int m=sc.nextInt();
//         for(int i=n; i>=1;i--){
//             for(int j=1; j<=i; j++){
                
//                     System.out.print("*");

//             }
//             System.out.println();
        
//         }

//     }
// }
///////////////////////////////////////
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number N:");
//         int n=sc.nextInt();
//        // System.out.println("Enter the number M:");
//        // int m=sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1; j<=n-i; j++){
                
//                     System.out.print(" ");

//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
        
//         }
//     }
// }
////////////////////////////////////////

// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number N:");
//         int n=sc.nextInt();
//         // System.out.println("Enter the number M:");
//         // int m=sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//             }
//             System.out.println();
        
//         }

//     }
// }
/////////////////////////////////////////
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number N:");
//         int n=sc.nextInt();
//         // System.out.println("Enter the number M:");
//         // int m=sc.nextInt();
//         for(int i=1; i<=n;i++)
//         //for(int i=n; i>=1;i--)
//         {
//             for(int j=1;j<=n-i+1; j++)
//             //for(int j=1; j<=i; j++)
//             {
//                System.out.print(j+" ");
//             }
//             System.out.println();
        
//         }

//     }
// }
/////////////////////////////////
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number N:");
//         int n=sc.nextInt();
//         // System.out.println("Enter the number M:");
//         // int m=sc.nextInt();
//         int number=1;
//         for(int i=1; i<=n;i++){
//             for(int j=1; j<=i; j++){
//                System.out.print(number+" ");
//                number++;
//             }
//             System.out.println();
        
//         }

//     }
// }
/////////////////////////////////////////////
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number N:");
//         int n=sc.nextInt();
//         // System.out.println("Enter the number M:");
//         // int m=sc.nextInt();
        
//         for(int i=1; i<=n;i++){
//             for(int j=1; j<=i; j++){
//                 int sum=i+j;
//                 if(sum%2==0){
//                System.out.print(1+" ");
//                 }
//                 else{System.out.print(0+" ");}
              
//             }
//             System.out.println();
        
//         }

//     }
// }
/////////////////////////////advanced pattern////////////////
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number A :");
//         int n=sc.nextInt();
//         for(int i=1;i<=i;i++){
//             for(int j=1; j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             //spaces
//             int spaces=2*(n-1);
//             for(int j=1;j<=spaces; j++){
//                   System.out.print(" ");
//             }
//             //2nd part
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//  //////////////lower hafe////////////////
//              for(int i=n;i>=1;i--){
//              for(int j=1; j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             //spaces
//             int spaces=2*(n-1);
//             for(int j=1;j<=spaces; j++){
//                   System.out.print(" ");
//             }
//             //2nd part
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }


//     }
// }
///////////////////////////////////////////rombur
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number A :");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=1; j<=n;j++){
//                 System.out.print("*");
//             }   
//             System.out.println();
//         }
//     }
// }
///////////////////////////pramid number
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number A :");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=n-i;j++){
//                 //spaces
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=1; j<=i;j++){
//                 System.out.print(i+" ");
//             }   
//             System.out.println();
//         }
//     }
// }
////////////////////////////merror pramid/////////////
// import java.util.*;
// public class patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number A :");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=n-i;j++){
//                 //spaces
//                 System.out.print(" ");
//             }
//             //1st hafe nunmbers
//             for(int j=i; j>=1;j--){
//                 System.out.print(j+" ");
//             }   
//             //2nd hafe numbers
//             for(int j=2;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
/////////////////////////diamond//////////////
import java.util.*;
public class patterns{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number A :");
        int n=sc.nextInt();
       // upper hafe
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                //spaces
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }   
           
            System.out.println();
        }
        //lower hafe
         for(int i=n;i>=1;i--){
            for(int j=1; j<=n-i;j++){
                //spaces
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }   
           
            System.out.println();
        }
    }
}

