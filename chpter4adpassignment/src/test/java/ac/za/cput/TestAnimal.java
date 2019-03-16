package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAnimal {

    Animal dog;
    String name;
    String ownerName;
    AnimalInterface interfacea;

    @Before
    public void setUp() throws Exception {
          dog=new Dog(); //polymorphism
          dog.setName("spark");
           name=dog.getName();
          interfacea=new Dog(); //polymorphism
          ownerName=interfacea.ownerName("John");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testName(){

        Assert.assertEquals("spark",name);
    }

    @Test
    public void testOwnerName(){
        Assert.assertEquals("John",ownerName);
    }


}