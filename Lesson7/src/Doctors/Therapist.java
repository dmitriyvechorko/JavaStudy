package Doctors;

class Therapist extends Doctor {
    public static void assignDoctor(Patient patient) {
        if (patient.treatmentPlan == 1) {
            patient.doctor = new Surgeon();
        } else if (patient.treatmentPlan == 2) {
            patient.doctor = new Dentist();
        } else {
            patient.doctor = new Therapist();
        }
    }

    @Override
    public void treat() {
        System.out.println("Терапевт лечит пациента.");
    }
}
