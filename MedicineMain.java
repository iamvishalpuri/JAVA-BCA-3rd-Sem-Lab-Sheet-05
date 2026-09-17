/** Q2: Medicine — Parameterized Constructor and this */
public class MedicineMain {
    static class Medicine {
        String medicineName;
        String batchNo;
        double price;

        Medicine(String medicineName, String batchNo, double price) {
            this.medicineName = medicineName;
            this.batchNo = batchNo;
            this.price = price;
        }

        void displayMedicine() {
            System.out.println(medicineName + " | " + batchNo + " | " + price);
        }
    }

    public static void main(String[] args) {
        Medicine medicine1 = new Medicine("Paracetamol", "B101", 30.0);
        Medicine medicine2 = new Medicine("Amoxicillin", "B102", 90.0);
        medicine1.displayMedicine();
        medicine2.displayMedicine();
    }
}
