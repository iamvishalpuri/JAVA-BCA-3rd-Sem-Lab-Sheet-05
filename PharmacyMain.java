/** Q3: Pharmacy — Instance and Class Variables */
public class PharmacyMain {
    static class Pharmacy {
        String pharmacyName;
        String location;
        static int pharmacyCount;

        Pharmacy(String pharmacyName, String location) {
            this.pharmacyName = pharmacyName;
            this.location = location;
            pharmacyCount++;
        }

        void displayPharmacy() {
            System.out.println("Pharmacy: " + pharmacyName + ", Location: " + location);
        }

        static void displayPharmacyCount() {
            System.out.println("Total Pharmacies: " + pharmacyCount);
        }
    }

    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("CityCare", "Delhi");
        Pharmacy p2 = new Pharmacy("MediLife", "Noida");
        Pharmacy p3 = new Pharmacy("HealthPlus", "Gurgaon");

        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }
}
