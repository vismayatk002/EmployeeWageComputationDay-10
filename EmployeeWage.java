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
    public void empWageBuilder(CompanyEmpWage[] companyArr){
        
        for(int i=0; i<companyArr.length; i++){

            while(companyArr[i].totalAttendance <=companyArr[i].workingDays && companyArr[i].empTotalHr <=companyArr[i].companyHr){
                for(int day=1; day<=companyArr[i].workingDays; day++){
                    int empCheck = (int)(Math.random() * 10) % 2;
                    if(checkIsPresent(empCheck)){
                        companyArr[i].totalAttendance++;
                        int empType = (int)(Math.random() * 10) % 2;
                        switch(empType){
                            case  FULL_TIME :
                                companyArr[i].empTotalHr += FULL_TIME_HR;
                                companyArr[i].monthlyWage += companyArr[i].wagePerHr * FULL_TIME_HR;
                                break;
                            default :
                                companyArr[i].empTotalHr += PART_TIME_HR; 
                                companyArr[i].monthlyWage += companyArr[i].wagePerHr * PART_TIME_HR;
                        }
                    }
                }
            }
        }
    }
}