/** Q15: Multilevel Inheritance — Person -> Employee -> Manager */
public class MultilevelMain {
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

        Employee(String name, int age, int employeeId) {
            super(name, age);
            this.employeeId = employeeId;
        }

        int getEmployeeId() {
            return employeeId;
        }
    }

    static class Manager extends Employee {
        private int teamSize;

        Manager(String name, int age, int employeeId, int teamSize) {
            super(name, age, employeeId);
            this.teamSize = teamSize;
        }

        void displayManager() {
            System.out.println("Manager Details:");
            System.out.println("Name: " + name + ", Age: " + age + ", ID: " + getEmployeeId() + ", Team Size: " + teamSize);
        }
    }

    public static void main(String[] args) {
        // Person -> Employee -> Manager
        Manager manager = new Manager("Rohit", 38, 1201, 12);
        manager.displayManager();
    }
}
