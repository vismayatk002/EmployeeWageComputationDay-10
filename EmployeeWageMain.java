public class EmployeeWageMain{

    static final int IS_PRESENT = 1;
    static final int WAGE_PER_HR = 20;
    static final int WORKING_DAYS = 20;
    static final int FULL_TIME_HR = 16;
    static final int PART_TIME_HR = 8;
    static final int FULL_TIME = 1;

    
    int dailyEmpWage = 0;
    int monthlyWage = 0;

    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public int calcDailyEmpWage(int empType){
        
        switch(empType){
            case FULL_TIME :
                dailyEmpWage =  WAGE_PER_HR * FULL_TIME_HR;
            break;
            default :
                dailyEmpWage =  WAGE_PER_HR * PART_TIME_HR;
        }
        return dailyEmpWage;
    }
    public int calcMonthlyWage(){
        
        int dailyWage = 0;
        for(int day=1; day<=WORKING_DAYS; day++){
            int empCheck = (int)(Math.random() * 10) % 2;
            if(checkIsPresent(empCheck)){    
                int empType = (int)(Math.random() * 10) % 2;
                dailyWage = calcDailyEmpWage(empType);   
                monthlyWage += dailyWage;
            }
        }
        return monthlyWage;
    }
    public static void main(String[] args){
    
        EmployeeWageMain emp = new EmployeeWageMain();
        System.out.println("Monthly wage :" + emp.calcMonthlyWage());
    }
}