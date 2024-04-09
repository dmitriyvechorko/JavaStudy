package Doctors;

public class Clinic {
    public static void main(String[] args) {
        Patient dmitry = new Patient(2);
        dmitry.assignDoctor();
        dmitry.receiveTreatment();

        Patient vladimir = new Patient(435);
        vladimir.assignDoctor();
        vladimir.receiveTreatment();

        Patient timur = new Patient(1);
        timur.assignDoctor();
        timur.receiveTreatment();
    }
}
