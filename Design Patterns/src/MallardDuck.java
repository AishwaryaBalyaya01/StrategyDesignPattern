public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehaviour = new FlyWithwings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Hey, I am a Mallard Duck..MeMe!!!!");
    }
}
