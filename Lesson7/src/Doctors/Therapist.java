package Doctors;

class Therapist extends Doctor {
    public static void assignDoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon());
        } else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(new Dentist());
        } else {
            patient.setDoctor(new Therapist());
        }
    }

    @Override
    public void treat() {
        System.out.println("Терапевт лечит пациента.");
    }
}
