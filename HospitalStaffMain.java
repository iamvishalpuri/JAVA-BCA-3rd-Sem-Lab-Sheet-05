/** Q19: Hospital Staff Management — Integrated OOP */
public class HospitalStaffMain {
    static class Person {
        protected String name;
        protected int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Employee extends Person {
        private int employeeId;
        private double salary;
        static int employeeCount;

        Employee(String name, int age, int employeeId, double salary) {
            super(name, age);
            this.employeeId = employeeId;
            this.salary = salary;
            employeeCount++;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary >= 0) {
                this.salary = salary;
            }
        }

        void displayBasic() {
            System.out.println("ID: " + employeeId + ", Name: " + name + ", Age: " + age + ", Salary: " + salary);
        }
    }

    static class Doctor extends Employee {
        private String specialization;

        Doctor(String name, int age, int employeeId, double salary, String specialization) {
            super(name, age, employeeId, salary);
            this.specialization = specialization;
        }

        String getSpecialization() {
            return specialization;
        }
    }

    static class Pharmacist extends Employee {
        private String licenseNo;

        Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
            super(name, age, employeeId, salary);
            this.licenseNo = licenseNo;
        }

        String getLicenseNo() {
            return licenseNo;
        }
    }

    static class StaffManager {
        void displayStaff(Employee[] employees) {
            for (int i = 0; i < employees.length; i++) {
                Employee employee = employees[i];
                employee.displayBasic();
                if (employee instanceof Doctor) {
                    Doctor doctor = (Doctor) employee;
                    System.out.println("Role: Doctor, Department: " + doctor.getSpecialization());
                } else if (employee instanceof Pharmacist) {
                    Pharmacist pharmacist = (Pharmacist) employee;
                    System.out.println("Role: Pharmacist, License: " + pharmacist.getLicenseNo());
                }
                System.out.println("----------------------");
            }
            System.out.println("Total Employees: " + Employee.employeeCount);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Doctor("Dr. Kavita", 42, 2101, 95000, "Orthopedics"),
            new Pharmacist("Nitin", 29, 2102, 42000, "PH-2102")
        };

        StaffManager manager = new StaffManager();
        manager.displayStaff(employees);
    }
}
