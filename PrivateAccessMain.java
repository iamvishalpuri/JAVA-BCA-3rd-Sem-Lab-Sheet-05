/** Q10: Private Access Specifier */
public class PrivateAccessMain {
    static class Employee {
        private int employeeId;
        private String employeeName;
        private double salary;

        Employee(int employeeId, String employeeName, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.salary = salary;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public double getSalary() {
            return salary;
        }

        public void displayEmployee() {
            System.out.println(employeeId + " | " + employeeName + " | " + salary);
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(501, "Rahul", 45000.0);
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());
        employee.displayEmployee();

        // System.out.println(employee.salary); // Not allowed: salary is private.
    }
}
