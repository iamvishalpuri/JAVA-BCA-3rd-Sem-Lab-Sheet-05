/** Q5: Medicine Eligibility — Method and Local Variable */
public class EligibilityMain {
    static class Medicine {
        String medicineName;
        int ageLimit;

        Medicine(String medicineName, int ageLimit) {
            this.medicineName = medicineName;
            this.ageLimit = ageLimit;
        }

        String checkEligibility(int patientAge) {
            String result;
            if (patientAge >= ageLimit) {
                result = "Eligible for " + medicineName;
            } else {
                result = "Not eligible for " + medicineName;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Medicine medicine = new Medicine("Strong Syrup", 18);
        System.out.println("Age 16: " + medicine.checkEligibility(16));
        System.out.println("Age 25: " + medicine.checkEligibility(25));
    }
}
