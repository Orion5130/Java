public class Dog extends Animals{
    public Dog(String name){
        super("Пёс " + name);
        runLimit = 500;
        jumpLimit = 0.5;
        swimLimit = 10;
    }
}
