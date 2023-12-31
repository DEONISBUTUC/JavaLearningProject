package zooclubservice;

public abstract class Animal implements AnimalInterface {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();

    @Override
    public void makeSound(){};



}
