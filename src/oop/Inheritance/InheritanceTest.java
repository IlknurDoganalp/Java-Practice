package oop.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

        Motor motor = new Motor("Honda", "Civic", 2020, 4);
        motor.aracinKisaBilgileri();
        motor.surusDeneyimi();

        motor.setMarka("Bmw");
        motor.setModel("CXs90");
        motor.setYil(2019);
        motor.aracinKisaBilgileri();

    }
}
