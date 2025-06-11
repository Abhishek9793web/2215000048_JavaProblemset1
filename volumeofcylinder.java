import java.util.Scanner;

class main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Radius : ");
    int a=sc.nextInt();
     System.out.print("Enter the Height : ");
     int b=sc.nextInt();
    float Volume = 22/7 * a^2 * b;
    System.out.print(" the volume of cylinder  is: "+Volume);
   sc.close();
 
     
    
    
    
 }

}