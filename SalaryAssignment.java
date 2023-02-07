public class SalaryAssignment {

    public static void main(String[] args) {

        Salary salaryObj1 = new Salary();
        Salary salaryObj2 = new Salary();
        Salary salaryObj3 = new Salary();

        salaryObj1.setSalary("Karan",50000);
        salaryObj2.setSalary("Arjun",75000);
        salaryObj3.setSalary("Rahul",100000);

        salaryObj1.SalaryScale();
        salaryObj2.SalaryScale();
        salaryObj3.SalaryScale();


    }
}

class Salary
{
    char employeeScale;
    String employeeName;
    float employeeSalary;

    void setSalary(String en, float es) {
        System.out.println("setting the initial name and salary for the employee....");
        employeeName=en;
        employeeSalary=es;
    }
    void SalaryScale() //
    {
        if(employeeSalary >=100000 && employeeSalary <125000)
            employeeScale='H';
        else if(employeeSalary >=60000 && employeeSalary <99999)
            employeeScale='M';
        else if(employeeSalary >=30000 && employeeSalary <59999)
            employeeScale='L';

        printSalaryRange();
    }
    void printSalaryRange()
    {
        System.out.println(employeeName+", salary is :"+employeeSalary+" hence salary scale is : "+employeeScale);
    }
}