package Doctors;

public class Clinic {
    public static void main(String[] args) {
        Patient dmitry = new Patient(2);
        Therapist.assignDoctor(dmitry);
        dmitry.receiveTreatment();

        Patient vladimir = new Patient(435);
        Therapist.assignDoctor(vladimir);
        vladimir.receiveTreatment();

        Patient timur = new Patient(1);
        Therapist.assignDoctor(timur);
        timur.receiveTreatment();
    }
}
