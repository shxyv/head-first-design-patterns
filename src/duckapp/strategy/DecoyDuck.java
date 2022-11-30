package duckapp.strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck () {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }


    public void display() {
        System.out.println("Decoy duck showed itself");
    }

}
