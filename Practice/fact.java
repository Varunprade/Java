package Practice;
import java.util.*;
public class fact {
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
        int fact=1;
    while(t-->0){
        int n=sc.nextInt();
       for(int i=1;i<=n;i++) {
fact=fact*i;
}
System.out.println(fact);
fact=1;
    }
}
}
