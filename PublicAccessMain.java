/** Q9: Public Access Specifier */
public class PublicAccessMain {
    static class Hospital {
        // public members are accessible from anywhere.
        public String hospitalName;
        public String hospitalCode;

        public Hospital() {
            hospitalName = "COER Hospital";
            hospitalCode = "CH001";
        }

        public void displayHospital() {
            System.out.println("Hospital: " + hospitalName + ", Code: " + hospitalCode);
        }
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.hospitalName = "City Hospital";
        hospital.hospitalCode = "C100";
        hospital.displayHospital();
    }
}
