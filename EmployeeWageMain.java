public class EmployeeWageMain{

    public static void main(String[] args){
    
        EmployeeWage company1 = new EmployeeWage();
        company1.calcMonthlyWage("TCS", 100, 20, 160);
        EmployeeWage company2 = new EmployeeWage();
        company2.calcMonthlyWage("Infosys", 50, 25, 170);
        EmployeeWage company3 = new EmployeeWage();
        company3.calcMonthlyWage("Wipro", 200, 15, 120);
    }
}