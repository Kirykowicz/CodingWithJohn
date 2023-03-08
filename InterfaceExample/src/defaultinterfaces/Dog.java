package defaultinterfaces;

public class Dog implements MakesNoise{

    private int age;
    private String name;

    @Override
    public void makeNoise(){
        System.out.println("Bark woof bow wow");
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
