import java.util.*;
public class problem2 {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        //boolean isprime=true;
        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                //isprime =false;
                return false;
            }
        }
        return true;
    }
    public static void printinrange(int n){
        for(int i=2;i<=n-1;i++){
            if(isprime(i)){
                System.out.println(i+" ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    printinrange(20);
}
    
}
