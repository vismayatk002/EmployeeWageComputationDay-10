import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;

//class EmployeeWage inherits interface EmpWage
public class EmployeeWage implements EmpWage{

    static final int IS_PRESENT = 1;
    static final int FULL_TIME_HR = 16;
    static final int PART_TIME_HR = 8;
    static final int FULL_TIME = 1;

    //declaration of HashMap
    HashMap<String , CompanyEmpWage> companyHash = new HashMap<>();
    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public void calcMonthlyWage(ArrayList<CompanyEmpWage> companyArr){
        
        int dailyEmpWage = 0;
        //iteration of ArrayLIst using iteration method
        //create object of Iterator
        Iterator itr = companyArr.iterator();
        while (itr.hasNext()){
            //store object inside the arraylist to  Variable
            CompanyEmpWage wageObject = (CompanyEmpWage)itr.next();
            //iterating till the condition will false
            while(wageObject.totalAttendance <=wageObject.workingDays && wageObject.empTotalHr <=wageObject.companyHr){
                for(int day=1; day<=wageObject.workingDays; day++){
                    int empCheck = (int)(Math.random() * 10) % 2;
                    if(checkIsPresent(empCheck)){
                        wageObject.totalAttendance++;
                        int empType = (int)(Math.random() * 10) % 2;
                        switch(empType){
                            case  FULL_TIME :
                                wageObject.empTotalHr += FULL_TIME_HR;
                                dailyEmpWage = wageObject.wagePerHr * FULL_TIME_HR;
                                break;
                            default :
                                wageObject.empTotalHr += PART_TIME_HR; 
                                dailyEmpWage = wageObject.wagePerHr * PART_TIME_HR;
                        }
                        //calculating monthly wage using daily wage
                        wageObject.monthlyWage += dailyEmpWage;
                        //adding daily wage into objects array list variable
                        wageObject.dailyWage.add(dailyEmpWage);
                    }
                } 
            }
        //adding key & value to hash map
        companyHash.put(wageObject.company , wageObject);
        }
    }
    //method to retrieve monthly wage from hash map using key
    public int getCompanyEmpWage(String company){

        return companyHash.get(company).monthlyWage;                                
    }
}