// 9. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой – 600 м.*/
public abstract class Animals {
    protected String name;

    protected int runLimit = 0;
    protected double jumpLimit = 0;
    protected int swimLimit = 0;

    public Animals(){ this.name = "Безымянный"; }
    public Animals(String name){ this.name = name; }

    public void run(int distance){
        if( runLimit > 0 && distance <= runLimit){
            System.out.println(this.name + " пробежал " + distance +" метров.");
        }
        else {
            System.out.println(this.name + " не сможет пробежать столько.");
        }
    }

    public void jump(double height){
        if( jumpLimit > 0 && height <= jumpLimit){
            System.out.println(this.name + " подпрыгнул на  " + height +" метров.");
        }
        else {
            System.out.println(this.name + " не сможет прыгнуть так высоко.");
        }
    }

    public void swim(int distance){
        if( jumpLimit > 0 && distance <= jumpLimit){
            System.out.println(this.name + " проплыл  " + distance +" метров.");
        }
        else {
            System.out.println(this.name + " не сможет проплыть столько.");
        }
    }
}

