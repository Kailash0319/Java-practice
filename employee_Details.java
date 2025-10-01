import java.util.Scanner;
public class employee_Details {

   static class Employee {
    String name;
    double salary;
    int age;
}  
   
    static Employee[] inputEmployees(Scanner sc) {

         Employee[] employees = new Employee[5]; 
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();

            System.out.println("\nEnter details of Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            employees[i].name = sc.nextLine();

            System.out.print("Salary: ");
            employees[i].salary = sc.nextDouble();

            System.out.print("Age: ");
            employees[i].age = sc.nextInt();
            sc.nextLine();
        }
        return employees;
    }

    
    static void printEmployees(Employee[] employees) {
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ": " +
                    "Name = " + employees[i].name +
                    ", Salary = " + employees[i].salary +
                    ", Age = " + employees[i].age);
        }
    }

    public static void main(String[] args) {
        System.out.println("Kailash Kumavat"); 

        Scanner sc = new Scanner(System.in);  
        Employee[] employees = inputEmployees(sc);
        printEmployees(employees);

        sc.close(); 
    }
}
