package company.a_13_Cisco;

import java.util.HashSet;
import java.util.Scanner;

class InvalidInputException extends Exception {
    String errorString;
    InvalidInputException(String errorString){
        super(errorString);
    }
}

class Employee {

    private int id = 0;
    private String name = null;
    private boolean male = true;

    Employee(int id, String name,  boolean male) {
        super();
        this.id = id;
        this.name = name;
        this.male = male;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ",  male=" + male + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime* result + id;
        return result;
    }
    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(o==this){
            return true;
        }
        if(getClass()!=o.getClass()){
            return false;
        }
        Employee e = (Employee)o;
        return (this.id == e.id);
    }


}

public class Test {

    /*
     * Validate the input and create Employee object
     * If any of the given input is not valid throw InvalidInputException();
     */
    public Employee createEmployee(String record) throws InvalidInputException{
        String[] inputArray = record.split(",");
        if(inputArray.length!=3){
            throw new InvalidInputException("InvalidInputException");
        }
        try{
            Integer.parseInt(inputArray[0]);
        }catch(Exception e){
            throw new InvalidInputException("InvalidInputException");
        }

        String name = inputArray[1].trim();
        if(name==null || name.equals("")){
            throw new InvalidInputException("InvalidInputException");
        }else if(!name.matches("[a-zA-Z]*")){
            throw new InvalidInputException("InvalidInputException");
        }

        try{
            Boolean.parseBoolean(inputArray[2]);
        }catch(Exception e){
            throw new InvalidInputException("InvalidInputException");
        }
        boolean male =Boolean.parseBoolean(inputArray[2]);
        int id = Integer.parseInt(inputArray[0]);
        Employee employee = new Employee(id, name, male);
        return employee;



    }

    public static void main(String[] str) {

        //Input is expected as comma separated values for Employee object like id(int), name (String),isMale(boolean)"
        // 1,John,true
        Scanner scan = new Scanner(System.in);

        HashSet<Employee> employeeSet = new HashSet<>();
        Test t = new Test();
        /*Process each line and create Employee object using the "createEmployee" method add in employeeSet*/
        while (scan.hasNext()) {
            try {
                String input = scan.nextLine();
                //System.out.println(input);
                Employee e = t.createEmployee(input);
                employeeSet.add(e);
            }catch(Exception e) {
                System.out.println(e.getClass().getName());
                System.exit(0);
            }

        }

        //Don't delete or modify this print statement
        System.out.println("Employees info : "+ employeeSet);

    }

}
