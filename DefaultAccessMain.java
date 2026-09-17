/** Q11: Default Access Specifier */
public class DefaultAccessMain {
    static class Pharmacy {
        // package-private members (default access): no keyword used.
        String medicineName;
        double price;

        Pharmacy() {
            medicineName = "Vitamin C";
            price = 40.0;
        }

        void displayMedicine() {
            System.out.println("Medicine: " + medicineName + ", Price: " + price);
        }
    }

    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.medicineName = "Pain Relief Gel";
        pharmacy.price = 95.0;
        pharmacy.displayMedicine();
    }
}
