package ac.za.cput;

public class Dog extends Animal implements AnimalInterface { //inheritance question 1  //different type of inheritance using interface question 2

    public Dog(){

    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public String breed(String breed) {
        return breed;
    }
}
