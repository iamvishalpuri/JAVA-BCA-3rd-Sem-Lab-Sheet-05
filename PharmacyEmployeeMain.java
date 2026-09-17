/** Q20: Final Challenge — Pharmacy Employee Management System */
public class PharmacyEmployeeMain {
    static class Employee {
        private int employeeId;
        private String employeeName;
        private double salary;
        static int employeeCount;
        protected String department;

        Employee(int employeeId, String employeeName, double salary, String department) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.department = department;
            setSalary(salary);
            employeeCount++;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary >= 0) {
                this.salary = salary;
            } else {
                System.out.println("Invalid salary. Salary cannot be negative.");
            }
        }

        String getDepartmentLabel() {
            return department;
        }

        void displayEmployee() {
            System.out.println(employeeId + " | " + employeeName + " | " + salary + " | " + department);
        }
    }

    static class Pharmacist extends Employee {
        private String licenseNo;

        Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
            super(employeeId, employeeName, salary, "Pharmacy");
            this.licenseNo = licenseNo;
        }

        void displayRoleDetails() {
            displayEmployee();
            System.out.println("License No: " + licenseNo);
        }
    }

    static class StoreManager extends Employee {
        private String storeSection;

        StoreManager(int employeeId, String employeeName, double salary, String storeSection) {
            super(employeeId, employeeName, salary, "Store Management");
            this.storeSection = storeSection;
        }

        void displayRoleDetails() {
            displayEmployee();
            System.out.println("Store Section: " + storeSection);
        }
    }

    static class EmployeeUtility {
        void processEmployees(Employee[] employees) {
            for (int i = 0; i < employees.length; i++) {
                Employee employee = employees[i];
                if (employee.getSalary() < 0) {
                    System.out.println("Invalid employee record found.");
                    continue;
                }

                if (employee instanceof Pharmacist) {
                    System.out.println("Processing Pharmacist in " + employee.getDepartmentLabel());
                    ((Pharmacist) employee).displayRoleDetails();
                } else if (employee instanceof StoreManager) {
                    System.out.println("Processing Store Manager in " + employee.getDepartmentLabel());
                    ((StoreManager) employee).displayRoleDetails();
                }
                System.out.println("------------------------");
            }
            System.out.println("Employee Count: " + Employee.employeeCount);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(3001, "Aditi", 38000, "LIC-P3001"),
            new StoreManager(3002, "Manav", 42000, "Cold Storage")
        };

        EmployeeUtility utility = new EmployeeUtility();
        utility.processEmployees(employees);
    }
}
