package Doctors;

class Patient {
    int treatmentPlan;
    Doctor doctor;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void receiveTreatment() {
        doctor.treat();
    }
}