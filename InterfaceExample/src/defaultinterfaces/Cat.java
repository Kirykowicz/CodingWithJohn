package defaultinterfaces;

public class Cat implements MakesNoise{

    private int age;
    private String name;

     @Override
    public String toString() {
        return "{" +
            " age='" + getAge() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void makeNoise(){
        System.out.println("meow meow meow");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
