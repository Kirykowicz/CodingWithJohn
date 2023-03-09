public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("eat eat eat");
    }

    public void poop() {
        System.out.println("phlbblobpblbop");
    }

    @Override
    public String toString() {
        return "My name is " + super.name;
    }
}
