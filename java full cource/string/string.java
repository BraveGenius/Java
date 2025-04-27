// import java.util.*;
// public class string{
// public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("what is your fname");
//     String fname=sc.nextLine();
//     System.out.println("what is your lname");
//     String lname=sc.nextLine();
//     String fullname =fname +"@"+ lname;
//      System.out.println(fullname .length());
//    // System.out.println("my name is :" + fname +" "+ lname);
//    for(int i=0; i<fullname.length();i++){
//    System.out.println(fullname.charAt(i));
// }
// }
// }
///////////////////////////////////
// import java.util.*;
// public class string{
// public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("what is your fname");
//     String fname=sc.nextLine();
//     System.out.println("what is your lname");
//     String lname=sc.nextLine();
//     String fullname=(fname+lname);
//     // if(fname.compareTo(lname)==0){
//     //     System.out.println("String are equal");
//     // } else{
//     //     System.out.println("String are not equal");
//     // }
//     String name=fullname.substring(5, 10);
//     System.out.println(name);
// }
// }
/////////////////////////////////////////////
import java.util.*;
public class string{
public static void main(String args[]){
    StringBuilder sb=new StringBuilder("ankit");
    System.out.println(sb);
    //char at index 0
    System.out.println(sb.charAt(0));
    //set char at index 0
    sb.setCharAt(0,'P');
    System.out.println(sb);
    //insert
    sb.insert(0, 'k');
    System.out.println(sb);
    //delete
    sb.delete(0, 1);
    System.out.println(sb);
    //append
    sb.append(" ");
    sb.append("y");
    sb.append("ad");
    sb.append("av");
    System.out.println(sb);
    //covert the last char to front ex-hell0=olleh///////////
    for(int i=0; i<sb.length()/2;i++){
        int front=i;
        int back=sb.length()-1-i; //5-1-0=>4

    char frontChar=sb.charAt(front);
        char backchar = sb.charAt(back);

        sb.setCharAt(front, backchar);
        sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);
}
}