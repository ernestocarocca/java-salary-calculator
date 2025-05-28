package calculator;
public class SalaryCalculator {

    public static SalaryCalculation calculateSalary(
            int invoiceAmountExVAT,
            double administrationFeePercentage,
            double taxRatePercentage
    ) {
        double taxPercentage = 0.3;
        double socialChargeCalculatedBackWord = 0.2391;
        int vat = Math.round((float) (invoiceAmountExVAT * 0.25));
        int invoiceAmount = invoiceAmountExVAT + vat;

        int administrationFee = Math.round((float) (invoiceAmountExVAT * (administrationFeePercentage / 100)));
        int invoiceAfterFees = invoiceAmountExVAT - administrationFee;

        int employeeSocialCharges = (int) (invoiceAfterFees * socialChargeCalculatedBackWord);
        int grossSalaryIncludingSemester = invoiceAfterFees - employeeSocialCharges;

        int salaryTax = (int) (grossSalaryIncludingSemester * taxPercentage);
        int netSalary = grossSalaryIncludingSemester - salaryTax;

        return new SalaryCalculation(
                invoiceAmountExVAT,
                vat,
                invoiceAmount,
                administrationFee,
                invoiceAfterFees,
                employeeSocialCharges,
                grossSalaryIncludingSemester,
                salaryTax,
                netSalary
        );
    }
}