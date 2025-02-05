package Övning6;
//Skapa en huvudklass Vehicle
//I Vehicle skapa ett publikt attribut speed
//Skapa en metod showSpeed() i Vehicle
//Skapa en underklass Car som ärver ifrån Vehicle
//Skapa en metod increaseSpeed(int increment) som ökar speed
//Skapa en klass Race som har en main-metod och som skapar en Car. Öka hastigheten och skriv ut den med metoderna ovan

// Klass Race med main-metoden
public class Race {
    public static void main(String[] args) {
        Car myCar = new Car(); // Skapa en bil
        myCar.increaseSpeed(65); // Öka hastigheten
        myCar.showSpeed(); // Visa hastigheten

        Bicycle myBike = new Bicycle(); // Skapa en cykel
        myBike.nbrOfGears(5); // Ställ in antal växlar
        myBike.increaseSpeed(3); // Öka hastigheten
        myBike.showSpeed(); // Visa hastigheten
    }
}
