package week1;

// -----------------BMI CALCULATOR----------------
// input : kg= weight , m=meter
// output : bmi formula : kg/(m*m)


import java.util.Scanner;
public class BMI_Calculator {
    public static void main(String[] args) {
        // variables :
        double kg,m,bmi;

        // scanner class
        Scanner input = new Scanner(System.in);

        // input :
        System.out.println("please enter your weight(kg): ");
        kg = input.nextDouble();
        System.out.println("please enter your height(meter): ");
        m = input.nextDouble();

        // bmi formula = kg /(m*m)
        bmi = kg / (m * m) ;

        // output:
        System.out.println("The Body Mass Index (BMI) :" + bmi);

        // Interpretation of BMI :
        if (bmi < 18.5) {
            System.out.println("You are underweight ! ");
        } else if (bmi >=18.5 && bmi < 25) {
            System.out.println("You have a normal weight ! ");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Youe are overweight ! ");
        } else {
            System.out.println("You are obese ! ");
        }
    }
}
