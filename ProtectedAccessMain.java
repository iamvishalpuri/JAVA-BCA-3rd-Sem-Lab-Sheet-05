/** Q12: Protected Access Specifier */
public class ProtectedAccessMain {
    static class HospitalStaff {
        protected int staffId;
        protected String staffName;

        protected HospitalStaff(int staffId, String staffName) {
            this.staffId = staffId;
            this.staffName = staffName;
        }

        protected void displayStaff() {
            System.out.println("Staff ID: " + staffId + ", Name: " + staffName);
        }
    }

    static class Pharmacist extends HospitalStaff {
        private String licenseNo;

        Pharmacist(int staffId, String staffName, String licenseNo) {
            super(staffId, staffName);
            this.licenseNo = licenseNo;
        }

        void displayPharmacist() {
            System.out.println("Pharmacist -> ID: " + staffId + ", Name: " + staffName + ", License: " + licenseNo);
        }
    }

    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(701, "Kiran", "LIC-22");
        pharmacist.displayStaff();
        pharmacist.displayPharmacist();
    }
}
