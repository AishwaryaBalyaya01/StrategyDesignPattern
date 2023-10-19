// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.display();

        System.out.println("------------------------");
        
        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehaviour(new FlyNoWay());
        modelDuck.setQuackBehaviour(new MuteQuack());
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.display();
    }
}