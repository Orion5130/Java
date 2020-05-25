public class Cat extends Animals{
    public Cat(String name){
        super("Кот " + name);
        runLimit = 200;
        jumpLimit = 2;

    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " не умеет плавать.");
    }
}