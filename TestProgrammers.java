package exercises.ClassesAndObjects;
//Create a Java class called Programmer
//The Programmer class will have the following instance variables:
//name as a string
//age as an integer
//wearsGlasses as a boolean
//The Programmer class will have the following methods:
//drinkCoffee() - that prints in console Espresso is the secret!
//printDetails() - that prints in console NameHere is a AgeHere-yo programmer
//hasGlasses - that prints in console Is NameHere wearing glasses? followed by the value of the dedicated variable
//create a Java tester class called TestProgrammers where you:
//create 2 Programmer objects (class instance)
//define the state of the objects by assigning values to the instance variables
//call the drinkCoffee() and printDetails() methods for the first Programmer object
//call the printDetails() and hasGlasses() methods for the second Programmer object
public class TestProgrammers {
    public static void main(String[] args) {
        Programmer pr1 = new Programmer();
        Programmer pr2 = new Programmer();
        pr1.name = "Claudio";
        pr1.age = 24;
        pr1.wearsGlasses = true;
        pr2.name = "John";
        pr2.age = 30;
        pr2.wearsGlasses = false;

        System.out.println(pr1.name + " is " + pr1.age + " years old");
        System.out.println(pr2.name + " is " + pr1.age + " years old");
        System.out.println("Claudio is wearing glasses?" + " " + pr1.wearsGlasses + ". And " + "John? " + pr2.wearsGlasses + ".");


        pr1.drinkCoffe(); // Espresso is the secret!
        pr1.printDetails(); // NameHere is a AgeHere-yo programmer
        pr2.printDetails(); // NameHere is a AgeHere-yo programmer
        pr2.hasGlasses(); // Is NameHere wearing glasses? followed by the value of the dedicated variable


    }}