import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Employee {
    private int employeeID;
    private String employeeName;
    private double employeeSalary;
    public Employee(int employeeID, String employeeName, double employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID + ", Name: " + employeeName + ", Salary: " + employeeSalary);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        while (true) {
            System.out.print("Enter Employee ID: ");
            int employeeID = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double employeeSalary = scanner.nextDouble();
            employees.add(new Employee(employeeID, employeeName, employeeSalary));
            System.out.print("Do you want to add another employee? (yes/no): ");
            scanner.nextLine(); 
            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("no")) {
                break;
            }
        }
        scanner.close();
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}