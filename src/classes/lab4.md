#Classes in Java

##Lab 4.1
1. Open the `Car` and `CarFactory` classes
2. Look at the table below which describes a collection of car objects

   |  make | model  | colour   | engineSize | topSpeed |
   |---|---|---|---|---|
   |Honda   |Civic   |Green   |1.8   |   112|
   |VW     |Polo   |Black   |1.2   |98   |
   |Audi   |A4   |Silver   |  2.0 |136  |
   |Subaru   |Impreza   |Blue   |1.4|124  |

3. The current `Car` class has fields for `make` and `model`
   1. Now update it with the additional attributes in the table `colour`,`engineSize` and `topSpeed`
4. Decide what the appropriate types should be for the new attributes (don't make them all Strings)
5. Write Getter and Setter methods for your new fields
6. Also update the `toString()` method so that it returns all the new attributes 
7. In the `CarFactory` class instantiate all the models in the table
8. Set all the attributes  on each `Car` object
9. Now call the `toString()` method on each of your `Car` objects
10. Expected output for each should look something like:


            Make:Honda, Model:Civic, Colour:Green, Engine Size:1.8, Top Speed:112

###Calling methods on objects in an array
Say we have a simple class called `Pet` and it looks like this:

            public class Pet {
               
               //fields
               private String name;
               private String noise;
   
               //getters and setters...
   
               //methods
               public void sayHello() {
                  System.out.println(name + " says " + noise);
               }
   
            }
And then we instantiated two objects of type `Pet`  

            Pet cat = new Pet();
            cat.setName("Ralph");
            cat.setNoise("Meow!");

            Pet dog = new Pet();
            dog.setName("Suzie");
            dog.setNoise("Woof!");
            

Next we add the two objects two an array. To to loop across the array and call `sayHello()` on each element we could do the following:   

            int counter = 0;
            while(counter < 2) {
               pets[counter].sayHello();
               
               counter++;
            }

The expected output in this case would be:

            Ralph says Meow!
            Suzie says Woof!


##Lab 4.2
1. Update the `accelerate()` method to include the top speed
   1. The output should look like the following eg:
   `The Honda Civic is accelerating to 112mph`
2. Create an array to hold all your `Car` objects and add all objects to it
3. Loop across the array calling the `accelerate()` method on each element
4. Expected output:  

            The Honda Civic is accelerating to 112mph
            The VW Polo is accelerating to 98mph
            The Audi A4 is accelerating to 136mph
            The Subaru Impreza is accelerating to 124mph
            

###Constructors
A constructor allows you to build a class with its attributes on one line without the use of setters
A constructor is similar to a method but doesn't have a return type. For the `Pet` class it would look like this:  

            public class Pet {

               //fields
               private String name;
               private String noise;

               //constructor
               public Pet(String name, String noise) {
                  this.name = name;
                  this.noise = noise;
               }

               //other methods...
            }

###Validation
Constructors and setters are often used for validation, eg. to check if a certain attribute value is valid  
Say, for example, we didn't want any `Pet` object to have a name longer than 10 characters

            //constructor
            public void setName(String name) {
                  if (name.length > 10) {
                     System.out.println("Name too long, setting default name");
                     this.name = "Default";
                  } else {
                     this.name = name;
                  }
            }

##Lab 4.3
1. Add a constructor to the `Car` class that takes all attributes as arguments
2. Add validation to your constructor to check the engine size
   1. The engine size cannot be less than 1.0
   2. The engine size can not be more than 3.0
   3. If the engine size is not a valid value a default size of 2.0 should be set
   4. If invalid, print out the message `Engine size not valid, setting engineSize to 2.0`
3. Now create the following car using the constructor  

   |  make | model  | colour   | engineSize | topSpeed |
      |---|---|---|---|---|
   |Land Rover   |Defender   |Green   |3.2   |   104|

4. Confirm that the above message is printed out



            

