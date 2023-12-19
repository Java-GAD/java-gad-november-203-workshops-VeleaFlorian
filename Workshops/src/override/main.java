package override;

public class main {
    public static void main(String[] args) {
        Car car = new Car();
        Audi audi = new Audi();
        Dacia dacia = new Dacia();
        Ford ford = new Ford();

        car.howFast();
        audi.howFast();
        dacia.howFast();
        ford.howFast();
    }
}
