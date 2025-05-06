// checking given year is laeap year or not 
import java.util.Scanner;
public class Lone {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter your yeasr::");
        int a=sc.nextInt();
        scanner.close();
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
        
    }
    
}
