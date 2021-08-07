public class EmployeeWageMain{

    static final int IS_PRESENT = 1;
    static final int WAGE_PER_HR=20;
    static final int FULL_TIME_HR=8;
    int dailyEmpWage = 0;

    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public int calcDailyEmpWage(){
        dailyEmpWage =  WAGE_PER_HR * FULL_TIME_HR;
        return  dailyEmpWage; 
    }

    public static void main(String[] args){
    
        EmployeeWageMain emp = new EmployeeWageMain();

        int empCheck = (int)(Math.random() * 10) % 2;

        if(emp.checkIsPresent(empCheck)){
           
            System.out.println("Daily Employee Wage :" +  emp.calcDailyEmpWage());
        }
        else{
            System.out.println("Employee is absent");
        };
    }
}