package Doctors;

class Therapist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Терапевт лечит пациента.");
    }
}
