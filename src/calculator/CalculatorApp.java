package calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        /*
    SalaryCalculator massage = new SalaryCalculator();

        Scanner scanner = new Scanner(System.in);
        int salary = 0;
        do  {
            massage.printText();
            if (scanner.hasNextInt()) {
                salary = scanner.nextInt();
                SalaryCalculation result = SalaryCalculator.calculateSalary(salary);
                System.out.println("Netto lön" + result.netSalary);
                break;
            }else {
                System.out.println("❌ Faktura Beloppet behöver vara en siffra.");
                scanner.next();
            }
        }while (true);
        */

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean continueRunning = true;
        System.out.println("chose what you whana use");
        System.out.println("1.Add");
        System.out.println("2.Substract");
        System.out.println("3.multiply");
        System.out.println("4.Divide");
        double result = 0;
        int choice = scanner.nextInt();
        double num1, num2;
        System.out.println("enter you first number");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        switch (choice) {
            case 1:
                result = calc.add(  num1, num2);
            System.out.println("result" + result);
            break;
            case 2:
                result = calc.subtract(  num1, num2);
                System.out.println("result" + result);
                break;
            case 3:
                result = calc.multiply(  num1, num2);
                System.out.println("result" + result);
            case 4:
                result = calc.divide(  num1, num2);
                System.out.println("result" + result);
        }


    }
}