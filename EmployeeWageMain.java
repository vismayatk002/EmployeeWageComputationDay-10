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
        emp.empWageBuilder(companyArr);
        System.out.println("\nEmployee wage of " + TCS.company + "'s Employee : " + TCS.monthlyWage);
        System.out.println("\nEmployee wage of " + Infosys.company + "'s Employee : " + Infosys.monthlyWage);
        System.out.println("\nEmployee wage of " + Wipro.company + "'s Employee : " + Wipro.monthlyWage);
        
        System.out.println("\nDaily wages of " + TCS.company + "'s Employee : " + TCS.dailyWage);
    }
}