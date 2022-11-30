package duckapp.strategy;

public class DemoDuckApp {


    public static void main(String[] args) {

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        Duck rocketDuck = new RocketDuck();
        rocketDuck.performFly();
        rocketDuck.setFlyBehaviour(new FlyWithRockets());
        rocketDuck.performFly();

    }



}
