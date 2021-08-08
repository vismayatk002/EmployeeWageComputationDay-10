import java.util.ArrayList;

public class EmployeeWageMain{

    public static void main(String[] args){
    
        ArrayList<CompanyEmpWage> companyArr = new ArrayList<CompanyEmpWage>();
        //creating objects
        CompanyEmpWage TCS = new CompanyEmpWage("TCS", 100, 20, 160);
        CompanyEmpWage Infosys = new CompanyEmpWage("Infosys", 50, 25, 170);
        CompanyEmpWage Wipro = new CompanyEmpWage("Wipro", 200, 15, 120);
        //storing objects in array
        companyArr.add(TCS);
        companyArr.add(Infosys);
        companyArr.add(Wipro);
        EmployeeWage emp = new EmployeeWage();
        emp.calcMonthlyWage(companyArr);
        System.out.println("\nEmployee wage of " + TCS.company + "company's Employee : " + TCS.monthlyWage);
        System.out.println("\nEmployee wage of " + Infosys.company + "company's Employee : " + Infosys.monthlyWage);
        System.out.println("\nEmployee wage of " + Wipro.company + "company's Employee : " + Wipro.monthlyWage);
        
        System.out.println("\nDaily wages of " + TCS.company + "company's Employee : " + TCS.dailyWage);
        
        System.out.println("\nTotal Wage of TCS company : " + emp.getCompanyEmpWage("TCS"));
    }
}