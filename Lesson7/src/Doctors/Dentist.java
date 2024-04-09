package Doctors;

class Dentist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Дантист лечит пациента.");
    }
}
