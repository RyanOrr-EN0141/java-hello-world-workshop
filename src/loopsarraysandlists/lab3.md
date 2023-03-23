#Arrays and Loops

###Declaring an array and updating its elements

                //declaring an array of type int with 3 elements
                int[] myArray = new int[3];
                
                //adding elements to the array
                myArray[0] = 16;    //assigns value of first element at index 0
                myArray[1] = 8;     //assigns value of second element at index 1
                myArray[2] = 23;    //assigns value of third element at index 2

                //these values can be reassigned using the same method

                //The following will throw an error! 
                myArray[3] = 11;  //trying to assign a fourth element to an array with 3 elements
                (Remember: arrays always start at zero)

###Declaring an array on one line
                int[] myArray = {16, 8, 23};

###Accessing an element in an array
                int elem = myArray[1];
                System.out.println(elem); //prints out "8"

###Get the length of an array
                int length = myArray.length; //length is 3

###Iterate over the array with a while loop

                //while loop executes three times, when the counter has reached 3 it stops
                //this loop prints out each element in the array on a new line

                int counter = 0;
                while (counter < 3) {
                    int elem = myArray[counter];
                    System.out.println(elem);

                    counter++;
                }

###Iterate over the array with a for loop
                //this for loop does the same thing as the while loop above
                //but it sets up the counter, the condition and increments all in one line
                
                for(int counter = 0; counter < 3; counter++) {
                    int elem = myArray[counter];
                    System.out.println(elem);
                }




##Lab 3.1
1. Open the class called `Arrays`
2. Declare an array of type String called "pets"
3. Add the Strings to the array
4. Use a `while loop` to iterate across the array
5. When the loop lands on the cat print out "Found the cat! It's at index X"
6. Add another animal name to the array
7. Attempting this breaks the array and the loop, fix this 
8. **Bonus** Update the loop so it will work no matter what the length of the "pets" array is

##Lab 3.2 (Optional)
1. Look up the syntax for a `for loop`
2. Rewrite your code using the `for loop` in place of the `while loop` 


#Lists
Lists are similar to Arrays but are dynamically sized

###Declaring a List
                //creating a new ArrayList of type String
                List<String> myList = new ArrayList<>();

###Adding an element
                myList.add("First String");

###Retrieve an element
                //getting the element at the first index
                String elem = myList.get(0);

###Get the size of the List
                //unlike arrays we don't call .length on a List
                int size = myList.size();


##Lab 3.3
1. Open the class called `Lists`
2. Repeat the steps in Lab 3.1 but use an `ArrayList` instead of an array
3. This time you won't have to resize the List when you add another animal4. 

