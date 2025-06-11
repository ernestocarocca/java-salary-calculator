package calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        SalaryCalculator massage = new SalaryCalculator();

        Scanner scanner = new Scanner(System.in);
        int salary = 0;
        while (true) {
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
        }
    }
    }