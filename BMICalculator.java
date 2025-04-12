import java.util.Scanner;

    public class BMICalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // 🌟 Welcome Page
            System.out.println("=========================================");
            System.out.println("        WELCOME TO THE BMI CALCULATOR    ");
            System.out.println("=========================================");
            System.out.println("This program will calculate your BMI (Body Mass Index)");
            System.out.println("All you need to do is enter your weight and height.");
            System.out.println("-----------------------------------------");
    
            // Optional: A little pause effect (fake "loading")
            try {
                Thread.sleep(1000); // 1 second
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.println(".");
            } catch (InterruptedException e) {
                // do nothing
            }
    
            // 🚶‍♂️User Input
            System.out.print("\nEnter your weight in kilograms (e.g., 68.5): ");
            double weight = scanner.nextDouble();
    
            System.out.print("Enter your height in meters (e.g., 1.75): ");
            double height = scanner.nextDouble();
    
            // 🧮 BMI Calculation
            double bmi = weight / (height * height);
    
            // 🖨️ Output
            System.out.printf("\nYour BMI is: %.2f\n", bmi);
    
            // 🧠 Category Info
            System.out.print("Category: ");
            if (bmi < 18.5) {
                System.out.println("Underweight 🥺");
            } else if (bmi < 24.9) {
                System.out.println("Normal weight 🎉");
            } else if (bmi < 29.9) {
                System.out.println("Overweight ⚠️");
            } else {
                System.out.println("Obese ❗");
            }
    
            System.out.println("\n💡 Tip: A healthy BMI is typically between 18.5 and 24.9.");
    
            // 👋 Exit
            System.out.println("\nThanks for using the BMI Calculator! Stay healthy! 💪");
            scanner.close();
        }
    }
    


