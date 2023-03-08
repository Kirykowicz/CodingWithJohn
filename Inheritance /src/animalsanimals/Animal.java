package animalsanimals;

public class Animal {
    private String name;
    private String color;

    public void eat(){
        System.out.println("munch munch munch");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
