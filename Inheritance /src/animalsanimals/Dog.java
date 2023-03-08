package animalsanimals;

public class Dog extends Animal{
    private int walkDistancePreference;

    public void bark(){
        System.out.println("woof woof!");
    }


    public int getWalkDistancePreference() {
        return this.walkDistancePreference;
    }

    public void setWalkDistancePreference(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    }

    public void eat(){
        System.out.println("yum yum");
    }

}
