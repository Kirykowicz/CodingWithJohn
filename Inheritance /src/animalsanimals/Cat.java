package animalsanimals;

public class Cat extends Animal {
    private String litterPreference; 

    public void meow(){
        System.out.println("meow meow meow");
    }

    public String getLitterPreference() {
        return this.litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    public void eat(){
        System.out.println("nom nom nom");
    }

}
