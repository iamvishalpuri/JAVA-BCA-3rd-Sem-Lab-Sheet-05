/** Q7: Encapsulated Patient — Validation */
public class PatientValidationMain {
    static class Patient {
        private String patientName;
        private int age;
        private double weight;

        Patient(String patientName, int age, double weight) {
            this.patientName = patientName;
            this.age = age;
            this.weight = weight;
        }

        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            } else {
                System.out.println("Invalid age. Age must be >= 0.");
            }
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            if (weight > 0) {
                this.weight = weight;
            } else {
                System.out.println("Invalid weight. Weight must be > 0.");
            }
        }

        void displayPatient() {
            System.out.println(patientName + " | Age: " + age + " | Weight: " + weight);
        }
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Neha", 24, 56.5);
        patient.displayPatient();

        patient.setAge(25);
        patient.setWeight(58.0);
        patient.displayPatient();

        patient.setAge(-5);
        patient.setWeight(0);
        patient.displayPatient();
    }
}
