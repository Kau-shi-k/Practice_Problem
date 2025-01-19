import java.util.Scanner;
public class random{
   public static void main(String[] args){
     System.out.println("Enter 5 Randon 3 digit Numbers");
     Scanner sc = new Scanner(System.in);
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     int num3 = sc.nextInt();
     int num4 = sc.nextInt();
     int num5 = sc.nextInt();
     int max = num1;
     int min = num1;
    
     if(num2>max) max = num2;
     if(num3>max) max = num3;
     if(num4>max) max = num4;
     if(num5>max) max = num5;
      
      System.out.println("Max number is" + max);
     if(num2<min) min = num2;
     if(num3<min) min = num3;
     if(num4<min) min = num4;
     if(num5<min) min = num5;
      
      System.out.println("Min number is" + min);
     sc.close();
}
}
