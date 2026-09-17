/** Q14: Hierarchical Inheritance — Person -> Doctor and Nurse */
public class HierarchicalMain {
    static class Person {
        protected String name;
        protected int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayPerson() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    static class Doctor extends Person {
        private String specialization;

        Doctor(String name, int age, String specialization) {
            super(name, age);
            this.specialization = specialization;
        }

        void displayDoctor() {
            System.out.println("Doctor Details:");
            displayPerson();
            System.out.println("Specialization: " + specialization);
        }
    }

    static class Nurse extends Person {
        private String ward;

        Nurse(String name, int age, String ward) {
            super(name, age);
            this.ward = ward;
        }

        void displayNurse() {
            System.out.println("Nurse Details:");
            displayPerson();
            System.out.println("Ward: " + ward);
        }
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Meena", 45, "Cardiology");
        Nurse nurse = new Nurse("Anu", 30, "Emergency");
        doctor.displayDoctor();
        nurse.displayNurse();
    }
}
