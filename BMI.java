
import java.util.Scanner;


public class TestingProject {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         
      // Get values from user
      System.out.print("Input weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("Input height in meters: ");
      double height = sc.nextDouble();
      
      double BMI = getBMI(weight, height);
      System.out.println(BMI);
      System.out.println(getStusts(BMI));

      System.out.println("Thanks for using our BMI App!");


    }
    
    // get BMI function
      
      public static double getBMI (double weight, double height){
      double BMI = weight / (height * height);
      return BMI;
      }
      
      
      // get stuts function
      public static String getStusts (double BMI){
          if ( BMI >=0 && BMI <= 15.9 ){
              return "Severely Underweight";
          }
          else if ( BMI >= 16 && BMI <=18.4){
               return "Underweight";
          }
          else if (BMI >= 18.5 && BMI <=25){
              return"Normal";
          }
          
          else if (BMI > 25 && BMI <=30){
               return"Overweight";
          }
          else if (BMI > 30 && BMI <=35){
               return "Moderayely Obese";
          }
           else if (BMI > 35 && BMI <=39.9){
               return "Severely Obese";
          }
          else if (BMI >=40){
             return "Morbidly Obese";
          }
      return null;
      }
       
}
