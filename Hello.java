
import java.util.*;

public class Hello{
    public static void main(String args[]){
    //output
    System.out.println("hello world with java");
    System.out.println("hello world with java");
    System.out.print("hello world with java\n from\n Brave Genius\n");
     //variales
    //  String name = "tony stark";
    //  int age = 48;
    //  double price = 25.25;
     int a = 25;
     int b = 20;
     int sum = a+b;
     int mux = a*b;
     System.out.println("The sum of two value is "+sum);
     System.out.println("The mul of two value is "+mux);
     //input function
     System.out.print("Enter value :");
     Scanner sc= new Scanner(System.in);
     String name = sc.nextLine();
     //nextInt()
     //nextFloat()
     System.out.println(name);

     //adding two number ny giving input
     System.out.print("Enter the value of su : ");
     Scanner su = new Scanner (System.in);
     int d= su.nextInt();
     int e= su.nextInt();
     int add=d+e;
     System.out.println("The value of d+e is "+add);

    }
}
