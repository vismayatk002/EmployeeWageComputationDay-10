public class EmployeeWageMain{

    public static void main(String[] args){
    
        EmployeeWage TCS = new EmployeeWage("TCS", 100, 20, 160);
        TCS.calcMonthlyWage();
        EmployeeWage Infosys = new EmployeeWage("Infosys", 50, 25, 170);
        Infosys.calcMonthlyWage();
        EmployeeWage Wipro = new EmployeeWage("Wipro", 200, 15, 120);
        Wipro.calcMonthlyWage();
        System.out.println("\nEmployee wage of " + TCS.company + "'s Employee : " + TCS.monthlyWage);
        System.out.println("\nEmployee wage of " + Infosys.company + "'s Employee : " + Infosys.monthlyWage);
        System.out.println("\nEmployee wage of " + Wipro.company + "'s Employee : " + Wipro.monthlyWage);
    }
}