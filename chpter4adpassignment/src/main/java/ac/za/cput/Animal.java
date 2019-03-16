package ac.za.cput;

public class Animal {

    private String name; //encapsulation

    public Animal(){

    }

    public Animal(String name){

        this.name=name;
    }

    public void setName(String name){

        this.name=name;
    }

    public String getName(){

        return this.name;
    }
}
