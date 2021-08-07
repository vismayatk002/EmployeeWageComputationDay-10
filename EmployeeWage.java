public class EmployeeWage{

    static final int IS_PRESENT = 1;
    static final int FULL_TIME_HR = 16;
    static final int PART_TIME_HR = 8;
    static final int FULL_TIME = 1;

    int dailyEmpWage = 0;
    int monthlyWage = 0;
    int empTotalHr = 0;
    int companyHr;
    int totalAttendance = 0;
    int workingDays;
    int wagePerHr;
    String company;

    public EmployeeWage(String company, int wagePerHr, int workingDays, int companyHr){

        this.company = company;
        this.wagePerHr = wagePerHr;
        this.workingDays = workingDays;
        this.companyHr = companyHr;
    }
    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public int calcDailyWage(int empType){
        
        switch(empType){
            case  FULL_TIME :
                empTotalHr += FULL_TIME_HR;
                dailyEmpWage =  wagePerHr * FULL_TIME_HR;
            break;
            default :
                empTotalHr += PART_TIME_HR; 
                dailyEmpWage = wagePerHr * PART_TIME_HR;
        }
        return dailyEmpWage;
    }
    public int calcMonthlyWage(){
        
        this.wagePerHr = wagePerHr;
        this.workingDays = workingDays;
        this.companyHr = companyHr;
        int dailyWage = 0;
        while(totalAttendance <=workingDays && empTotalHr <=companyHr){
            for(int day=1; day<=workingDays; day++){
                int empCheck = (int)(Math.random() * 10) % 2;
                if(checkIsPresent(empCheck)){
                    int empType = (int)(Math.random() * 10) % 2;
                    dailyWage = calcDailyWage(empType);   
                    monthlyWage += dailyWage;
                }
            }
        }
        return monthlyWage;
    }
}