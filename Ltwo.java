// perimetr of a circle 2 Pi R
import java.util.Scanner;
public class Ltwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your radius ::");
        double a=sc.nextDouble();
        System.out.println(2*Math.PI*a);
        // writing logic for pow of numbers::
        System.out.println("Enter your number::");
        int b= sc.nextInt();
        System.out.println("ENter your powe::");
    
        int c=sc.nextInt();
        int d=b;
        
        for(int i=1;i<c;i++){
        b=b*d;
        }
        System.out.println(b);
        
    }
    
}
