package duckapp.strategy;

public class RocketDuck extends Duck{

    public RocketDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }




}
