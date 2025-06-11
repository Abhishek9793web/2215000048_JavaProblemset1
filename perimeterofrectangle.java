import java.util.Scanner;

class main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length : ");
    int a=sc.nextInt();
     System.out.print("Enter the width : ");
     int b=sc.nextInt();
  
    int Perimeter = 2 * (a + b);
    System.out.print(" the perimeter of Rectangle  is: "+Perimeter);
   sc.close();
 
     
    
    
    
 }

}