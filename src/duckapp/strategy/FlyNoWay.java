package duckapp.strategy;

public class FlyNoWay implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
