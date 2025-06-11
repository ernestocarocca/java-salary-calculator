package calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        SalaryCalculator massage = new SalaryCalculator();
        massage.printText();
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        SalaryCalculation result = SalaryCalculator.calculateSalary(salary);

        System.out.println("Netto lön" + result.netSalary);


    }
}
