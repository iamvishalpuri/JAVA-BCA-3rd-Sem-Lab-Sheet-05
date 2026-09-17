/** Q13: Single Inheritance — Employee -> Pharmacist */
public class SingleInheritanceMain {
    static class Employee {
        protected int employeeId;
        protected String employeeName;
        protected double salary;

        Employee(int employeeId, String employeeName, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.salary = salary;
        }

        void displayEmployee() {
            System.out.println("Employee: " + employeeId + " | " + employeeName + " | " + salary);
        }
    }

    static class Pharmacist extends Employee {
        private String licenseNo;

        Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
            super(employeeId, employeeName, salary);
            this.licenseNo = licenseNo;
        }

        void displayPharmacist() {
            System.out.println("Pharmacist Data:");
            displayEmployee();
            System.out.println("License No: " + licenseNo);
        }
    }

    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(901, "Suman", 50000.0, "PHR-901");
        pharmacist.displayPharmacist();
    }
}
