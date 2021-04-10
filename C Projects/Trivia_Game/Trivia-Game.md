# Trivia Game 😃

Compiler used: **Visual Studios**

`Note: If you are wanting to actually run this file yourself then please advise that you will need to add this file to a solution in order to run it.`

### Intro/Main Menu 

For the Trivia game we use a simple menu that gives the user a brief introduction and then options to make a selection. 

![Step 1](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Intro.JPG)

### Sports Question

![Sports-Selection](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Sports-Question.jpg)

After choosing an answer the program will let us know if we were correct or not.

![Sports-Answers](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Sports-Answer-Example.jpg)


### Geography Question

Formatted just like the sports question. Below you can see the question, with an example of given answer. 

![Geography-Selection](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Geography-Question-Answer-Example.jpg)

### Hard Question

Again, to keep things simple used same formatting as in other questions. Below you can see the question, with an example of given answer.  

![Hard-Selection](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Hard-Question.jpg)

### Exiting

Like everything else, all good things must come to an end. At anytime in the process at the main menu the user can input 4 to exit out of the program.

![Exit](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Exit.jpg)


## Code Break-Down

Alot of the code that was used here goes off the basics of the C language. The main concept that is used here is `switch:case` statements and the use of a `do-while` loop. 

### Variables and Functions

In this program and in the current form that it is in only really has 2 variables and 4 functions. One in which is global and the other is local for the functions. 

- Global Variable
  - int giResponse = 0; 
  - `This is how we are keeping track of the users selection at the main menu.` 



In the do while loop on line 20 you can see system("CLS"); ![cls](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Code-Snippets/cls.png)

`Note: This is clearing the screen with each selection. Instead of repeating in a line on our screen, we will see it only one time.` 

Down at the end of the do while loop on line 51 you will see pause(2); ![pause](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Code-Snippets/pause.png)

`The (2) is what we are stating for the time. So, after input and pressing enter you will see "correct" or "incorrect" for 2 seconds. After these 2 seconds, 
you will go back to the main menu of the program.` 
