package HW280523;

import java.util.HashMap;
import java.util.Map;

public class HW2 {
    /*
   2)Create a Map that will store Employee name and salary. Write a logic to retrieve an
   employee who gets the highest salary. Output should be in the below format
John Smith=$100000
     */
    public static void main(String[] args) {
        HashMap<String, Double> employees=new HashMap<>();
        employees.put("John", 26068.99);
        employees.put("James", 246004.34);
        employees.put("Tony", 73776.56);
        employees.put("Kelly", 34443.55);
        employees.put("Ken", 58695.44);
        employees.put("Bill", 55456.45);
        String hiPaidEmp="";
        double hiSalary=0;
        for (Map.Entry<String, Double> employee:employees.entrySet()){
            String empName=employee.getKey();
            Double salary=employee.getValue();

            if (salary>hiSalary){
                hiSalary=salary;
                hiPaidEmp=empName;
            }

        }
        System.out.println(hiPaidEmp+" "+hiSalary);
    }

}
