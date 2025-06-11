import java.util.Scanner;
import java.lang.Math;
class main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the base : ");
    int a=sc.nextInt();
     System.out.print("Enter the exponent : ");
     int b=sc.nextInt();
  
    double result = Math.pow(a,b);
    System.out.print(" the result  is: "+result);
   sc.close();
 

    
    
    
 }

}