public class EmployeeWageMain{

    static final int IS_PRESENT = 1;
    static final int WAGE_PER_HR = 20;
    static final int FULL_TIME_HR = 16;
    static final int PART_TIME_HR = 8;
    static final int FULL_TIME = 1;
    
    int dailyEmpWage = 0;

    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public void calcDailyEmpWage(int empType){
        
        if(empType == FULL_TIME){
            dailyEmpWage =  WAGE_PER_HR * FULL_TIME_HR;
            System.out.println("Full time Daily Employee Wage :" + dailyEmpWage);
        }
        else{
            dailyEmpWage =  WAGE_PER_HR * PART_TIME_HR;
            System.out.println("Part time Daily Employee Wage :" + (dailyEmpWage));
        }
    }
    public static void main(String[] args){
    
        EmployeeWageMain emp = new EmployeeWageMain();
        int empCheck = (int)(Math.random() * 10) % 2;
        int empType = (int)(Math.random() * 10) % 2;
        if(emp.checkIsPresent(empCheck)){
            emp.calcDailyEmpWage(empType);
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}