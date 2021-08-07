import java.util.ArrayList;

public class CompanyEmpWage{

    int monthlyWage = 0;
    int empTotalHr = 0;
    int companyHr;
    int totalAttendance = 0;
    int workingDays;
    int wagePerHr;
    String company;
    
    ArrayList<Integer> dailyWage = new ArrayList<Integer>();

    public CompanyEmpWage(String company, int wagePerHr, int workingDays, int companyHr){

        this.company = company;
        this.wagePerHr = wagePerHr;
        this.workingDays = workingDays;
        this.companyHr = companyHr;
    }
}