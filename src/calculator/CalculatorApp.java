package calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        String newLine = System.lineSeparator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej här kan du få hjälp att räkna ut din baklänges moms."+ newLine + " Ange faktura Belopp: ");
        int salary = scanner.nextInt();




        SalaryCalculation result = SalaryCalculator.calculateSalary(salary, 1, 25.0);
        System.out.println("Nettolön: " + result.netSalary + " kr" + newLine + "avgift: " + result.administrationFee + newLine + "moms: " +result.vat);


    }
}
