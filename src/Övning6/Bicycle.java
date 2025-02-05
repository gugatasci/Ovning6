package Övning6;
//Lägg till en ny klass Bicycle som ärver ifrån Vehicle
//Bicycle har en egen metod nbrOfGears(int nbr) där man kan ställa in hur många växlar den har
//increaseSpeed(int force) ökar speed för cykeln beroende på vilken växel man har. En högre växel ökar speed mer än en låg växel
//Använd metoderna ovan och ställ in antal växlar och öka hastigheten på cykeln och skriv ut hastigheten i klassen Race

// Underklass Bicycle som ärver från Vehicle
class Bicycle extends Vehicle {
    private int gears;

    // Metod för att ställa in antal växlar
    public void nbrOfGears(int nbr) {
        this.gears = nbr;
    }

    // Metod för att öka hastigheten beroende på växel
    public void increaseSpeed(int force) {
        speed += force * gears;
    }
}
