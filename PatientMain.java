/** Q4: Patient Records — Object Array, Loop and Local Variable */
public class PatientMain {
    static class Patient {
        int patientId;
        String patientName;
        int age;

        Patient(int patientId, String patientName, int age) {
            this.patientId = patientId;
            this.patientName = patientName;
            this.age = age;
        }

        void displayPatient() {
            System.out.println(patientId + " - " + patientName + " - Age: " + age);
        }
    }

    static class PatientManager {
        void displayAllPatients(Patient[] patients) {
            for (int i = 0; i < patients.length; i++) {
                patients[i].displayPatient();
            }
        }
    }

    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Ankit", 22),
            new Patient(2, "Riya", 19),
            new Patient(3, "Mohit", 34),
            new Patient(4, "Sneha", 27),
            new Patient(5, "Tarun", 41)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
