import java.util.Scanner;

class main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first : ");
    int a=sc.nextInt();
     System.out.print("Enter the second : ");
     int b=sc.nextInt();
     System.out.print("Enter the third : ");
     int c=sc.nextInt();
  
    float avg=(a+b+c)/3;
    System.out.print(" the  avg  is: "+avg);
   sc.close();
 

    
    
    
 }

}