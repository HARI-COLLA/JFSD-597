import java.util.Scanner;

public class Main {

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the name:");
      String var2 = var1.nextLine();
      System.out.println("Enter thr age:");
      int var3 = var1.nextInt();
      System.out.println("Enter the Cgpa:");
      float var4 = var1.nextFloat();
      System.out.println("Enter the grade:");
      char var5 = var1.next().charAt(0);
      System.out.println("Name :" + var2);
      System.out.println("age :" + var3);
      System.out.println("cgpa :" + var4);
      System.out.println("grade:" + var5);
   }
}
