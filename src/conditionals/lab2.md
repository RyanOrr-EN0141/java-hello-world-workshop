#Conditionals and Control Flow

###If and Else If
The code between the curly brackets (the code block) for the corresponding `if` or `else if` will execute if the  
statement between the brackets returns true

                if (statement that resolves to true) { 
                    //do something 
                } else if (other statement that resolves to true) {
                    //do something else
                }

                //code outside the if block - this runs no matter what

###Else
We can also use the `else` statement, which executes if all statements above have returned `false`  

                    if (statement that resolves to true) {
                        //do something
                    } else {
                        //do something else
                    }

An `if` statement...  
can have **any number** of `else if` tests (though it's bad practice to make it too long)  
**must have** one `if` test at the beginning   
**may have** one `else` test at the end

###Operators
The operator for less than is `<`  
eg. `x < y` = if x is less than y this statement will return `true`

Some commonly used operators in Java are:  
`==` equals  
`!=` does not equal  
`<` less than  
`>` greater than  
`<=` less than or equal to  
`>=` greater than or equal to

**Side note**  
_when comparing Strings never use `==` to compare equality, use `.equals()` instead_  
_eg. `(myString.equals(anotherString))`_


#Lab 2.1
1. Open the class called `ConditionalsAndControlFlow`
2. Write code to check if the random number is less than 10
3. If it is less - print out "Less than 10"
4. if it is larger - print out "More than 10"
5. There is a bug in this code - what is it and how could we fix it?
6. **Bonus** Only use one print statement in the program

#Lab 2.2 (Optional)
1. Look up the syntax for a `switch` statement in Java 
2. Rewrite your `if else` statement as a `switch`statement instead

###AND and OR


#Lab 2.3 (Optional)
1. Introduce a second random number using:
   1.        int num2 = random.nextInt(21); 
2. Now write a statement that checks **both** numbers 
   1. If both numbers are under 10 print "Both are less than 10"
   2. If both numbers are **equal to or greater than** 10 print "Both are equal to or more than 10"
   3. If one is greater than 10 and the other less print "" 

