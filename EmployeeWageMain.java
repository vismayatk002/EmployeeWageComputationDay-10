public class EmployeeWageMain{

    final int IS_PRESENT = 1;

    public void checkIsPresent(int empCheck){
        if(empCheck == IS_PRESENT)
            System.out.println("\nEmployee is Present");
        else
            System.out.println("\nEmployee is Absent"); 
    }

    public static void main(String[] args){
    
        EmployeeWageMain wage = new EmployeeWageMain();

        int empCheck = (int)(Math.random() * 10) % 2;
        wage.checkIsPresent(empCheck);
    }
}