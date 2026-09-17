/** Q6: Encapsulated Medicine Product */
public class MedicineProductMain {
    static class MedicineProduct {
        private String medicineName;
        private String batchNo;
        private double price;

        MedicineProduct(String medicineName, String batchNo, double price) {
            this.medicineName = medicineName;
            this.batchNo = batchNo;
            this.price = price;
        }

        public String getMedicineName() {
            return medicineName;
        }

        public void setMedicineName(String medicineName) {
            this.medicineName = medicineName;
        }

        public String getBatchNo() {
            return batchNo;
        }

        public void setBatchNo(String batchNo) {
            this.batchNo = batchNo;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        void displayProduct() {
            System.out.println(medicineName + " | " + batchNo + " | " + price);
        }
    }

    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Cough Syrup", "C202", 120.0);
        product.setPrice(125.0);
        System.out.println("Updated Price: " + product.getPrice());
        product.displayProduct();
    }
}
