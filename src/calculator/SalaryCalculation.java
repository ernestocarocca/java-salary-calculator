package calculator;

public class SalaryCalculation {
    public int invoiceAmountExVAT;
    public int vat;
    public int invoiceAmount;
    public int administrationFee;
    public int invoiceAfterFees;
    public int employeeSocialCharges;
    public int grossSalaryIncludingSemester;
    public int salaryTax;
    public int netSalary;

    public SalaryCalculation(
            int invoiceAmountExVAT,
            int vat,
            int invoiceAmount,
            int administrationFee,
            int invoiceAfterFees,
            int employeeSocialCharges,
            int grossSalaryIncludingSemester,
            int salaryTax,
            int netSalary

    ) {
        this.invoiceAmountExVAT = invoiceAmountExVAT;
        this.vat = vat;
        this.invoiceAmount = invoiceAmount;
        this.administrationFee = administrationFee;
        this.invoiceAfterFees = invoiceAfterFees;
        this.employeeSocialCharges = employeeSocialCharges;
        this.grossSalaryIncludingSemester = grossSalaryIncludingSemester;
        this.salaryTax = salaryTax;
        this.netSalary = netSalary;
    }
}
