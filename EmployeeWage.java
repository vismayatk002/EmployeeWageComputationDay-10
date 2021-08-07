import java.util.Iterator;
import java.util.ArrayList;

public class EmployeeWage implements EmpWage{

    static final int IS_PRESENT = 1;
    static final int FULL_TIME_HR = 16;
    static final int PART_TIME_HR = 8;
    static final int FULL_TIME = 1;

    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public void empWageBuilder(ArrayList<CompanyEmpWage> companyArr){
        

        Iterator itr = companyArr.iterator();
        while (itr.hasNext()){
            CompanyEmpWage wageObject = (CompanyEmpWage)itr.next();
            while(wageObject.totalAttendance <=wageObject.workingDays && wageObject.empTotalHr <=wageObject.companyHr){
                for(int day=1; day<=wageObject.workingDays; day++){
                    int empCheck = (int)(Math.random() * 10) % 2;
                    if(checkIsPresent(empCheck)){
                        wageObject.totalAttendance++;
                        int empType = (int)(Math.random() * 10) % 2;
                        switch(empType){
                            case  FULL_TIME :
                                wageObject.empTotalHr += FULL_TIME_HR;
                                wageObject.monthlyWage += wageObject.wagePerHr * FULL_TIME_HR;
                                break;
                            default :
                                wageObject.empTotalHr += PART_TIME_HR; 
                                wageObject.monthlyWage += wageObject.wagePerHr * PART_TIME_HR;
                        }
                    }
                }
            }
        }
    }
}