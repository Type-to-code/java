package basic;
import java.util.Scanner;

public class print {
    /*  
    Scanner is used to take input.
    System.out.print() is used to give output.
    */
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("Input is => " +num);
        sc.close();
    }
    
}
