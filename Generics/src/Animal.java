public abstract class Animal {
    int age;
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();

    public void printName(){
        System.out.println("My name is " + name);
    }

    public abstract void eat();
}
