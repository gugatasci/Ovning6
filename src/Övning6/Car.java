package Övning6;

// Underklass Car som ärver från Vehicle
class Car extends Vehicle {

    // Metod för att öka hastigheten
    public void increaseSpeed(int increment) {
        speed += increment;
    }
}