// import java.util.*;

// public class condition{
//     public static void main(String args[]){
//         //System.out.println("enter the age :");
//         Scanner sc = new Scanner(System.in);
        
//         int age = sc.nextInt();
        
//     //if(x%2==0)
//         if (age>18)
//         {
//             System.out.println("Adult");
//         }
//         else{
//             System.out.println("not Adult");
//         }
//     }
// }


///////////////////////////////////////////////////////////////////////////

// import java.util.*;

// public class condition{
//     public static void main(String args[]){
//         Scanner sn=new Scanner(System.in);
//         System.out.println("Enter number a:");
//         int a=sn.nextInt();
//         System.out.println("Enter the number b:");
//         int b=sn.nextInt();

//         if(a==b){
//             System.out.println("Equal");
//         }
//         else{
//             if(a>b){
//                 System.out.println("a is greater");
//             }
//             else{
//                 System.out.println("b is greater");
//             }
//         }

//     }
// }
///////////////////////////////////////////////////////////////////////////////
import java.util.*;

public class condition{
    public static void main(String args[]){
    System.out.println("ENter the button :");
    Scanner sm=new Scanner(System.in);
    int button =sm.nextInt();
    // if(button == 1){
    //     System.out.println("hello");
    // }
    // else if(button==2){
    //     System.out.println("namaste");
    // }
    // else if(button==3){
    //     System.out.println("bonjour");
    // }
    // else{
    //     System.out.println("invalid button");
    // }

    switch(button){
        case 1 :System.out.println("hello");
        break;
        case 2 :System.out.println("namaste");
        break;
        case 3 :System.out.println("bonjour");
        break;
        default :System.out.println("invalid button");
    }

    }

}


////////////////////home work CALCULAATOR////////////////////////
// import java.util.*;

// public class condition {
//     public static void main(String args[]){
//         System.out.println("CALCULATER");
       
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number A: ");
//         int A=sc.nextInt();
//         System.out.println("enter the number B: ");
//         int B = sc.nextInt();
//          System.out.println("choice the symbol to calculate");
//         int symbol=sc.nextInt();
//         switch(symbol){
//             case 1 : System.out.println(A+B);
//             break;
//             case 2 :System.out.println(A-B);
//             break;
//             case 3 :System.out.println(A*B);
//             break;
//             case 4 :if(B==0){
//                 System.out.println("Invilid division");
//             }else{
//                 System.out.println("A/B");
//             }
//             break;
//             case 5 : if(B==0){
//                 System.out.println("Invalid division");

//             }else{
//                 System.out.println("A%B");
//             }
//             break;
//             default : System.out.println("invalid opretion");


//         }

//     }
    
// }


