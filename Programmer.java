package exercises.ClassesAndObjects;
////Create a Java class called Programmer
////The Programmer class will have the following instance variables:
////name as a string
////age as an integer
////wearsGlasses as a boolean
////The Programmer class will have the following methods:
////drinkCoffe() - that prints in console Espresso is the secret!
////printDetails() - that prints in console NameHere is a AgeHere-yo programmer
////hasGlasses - that prints in console Is NameHere wearing glasses? followed by the value of the dedicated variable
////create a Java tester class called TestProgrammers where you:
////create 2 Programmer objects (class instance)
////define the state of the objects by assigning values to the instance variables
////call the drinkCoffee() and printDetails() methods for the first Programmer object
////call the printDetails() and hasGlasses() methods for the second Programmer object

public class Programmer {

        String name;
        int age;
        boolean wearsGlasses;

        public void drinkCoffe(){
            System.out.println("Espresso is the secret!");
        }
        public void printDetails(){
            System.out.println("NameHere is a AgeHere-yo programmer");
        }
        public void hasGlasses(){
            System.out.println("Is NameHere wearing glasses? followed by the value of the dedicated variable");
        }


}
