import java.util.Scanner;

class main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Principal : ");
    int a=sc.nextInt();
     System.out.print("Enter the Rate : ");
     int b=sc.nextInt();
     System.out.print("Enter the Time : ");
     int c=sc.nextInt();
    float SimpleInterest = (a * b * c) / 100;
    System.out.print(" the volume of Simple Interest  is: "+SimpleInterest);
   sc.close();
 
     
    
    
    
 }

}