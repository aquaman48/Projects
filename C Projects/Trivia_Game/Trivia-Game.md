# Trivia Game 😃

Compiler used: **Visual Studios**

`Note: If you are wanting to actually run this file yourself then please advise that you will need to add this file to a solution in order to run it.`

[Source-Code](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Trivia_Game/Trivia_Game.c), [Code Breakdown](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Trivia_Game/Trivia-Game.md#code-break-down)

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

### Libraries 

There are 3 libraries we must bring in to successfully debug our program. 

1. #include<stdio.h>
2. #include<time.h>
3. #include<stdlib.h>

`stdio.h and stdlib.h are your basic general libraries. Since in our program we use the system("CLS") function we must include the time.h library as well.`

### Variables and Functions

In this program and in the current form that it is in only really has 2 variables and 4 functions. One in which is global and the other is local for the functions.
Since we are only using whole numbers will we give the functions and variables int data-types. 

- Functions
  - int sportsQuestion(void)
  - int geographyQuestion(void)
  - int hardQuestion(void)
  - void pause(int)

- Local Variable
  - int iAnswer

The functions are designed to hold the information that the user will see for each question. The code snippet below is pulled from the Sports Question. 
Here you can see this is the basic setup for the functions.
```
1. Category - line 63
2. Question - line 64
3. Option 1 - line 65
4. Option 2 - line 66
5. Option 3 - line 67
6. Option 4 - line 68
7. Ask for user input - line 69
8. Store user input in variable iAnswer - line 70
```

##### Example:
        
   ![Question-Func](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Code-Snippets/Question-function.JPG)
      


- Global Variable
  - int giResponse   `This is how we are keeping track of the users selection at the main menu.` 


## Control Flow 

Since the trivia game we have a menu and is dependent on user selection, to run our program we implemented the use of a `do-while` loop and a `switch:case` statement. 
We want the program to **display**(do) everything for our menu **until**(while) user inputs 4 to quit. 

### Do-While Loop & Switch Case Statement

- **Do-While**

In the do while loop on line 20 you can see this is where we start making use of our `time.h` lib we discussed above with the use of system("CLS"); 

![cls](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Code-Snippets/cls.png)

`Note: This is clearing the screen with each selection. Instead of repeating in a line on our screen, we will see only one instance of the program at a time.` 


The part of the code that controls how long the screen is displayed after user input can be found down at the end of the do while loop on line 51 you will see pause(2); 

![pause](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Code-Snippets/pause.png)

`Inside the parentheses we must pass a whole number, as we are calling the pause function that was created. void pause(int);
The (2) is what we are stating for the time. So, after input and pressing enter you will see "correct" or "incorrect" for 2 seconds. 
After these 2 seconds, you will go back to the main menu of the program.` 


![End-While](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Code-Snippets/End-of-doWhile.JPG)
At the very end of the do-while loop you will see while (giResponse != 4); This is how we get the program to exit. This is telling the program that while the user input is not (!=) 4 then we will keep showing this menu. 


- **Switch & Case**

Once the user has seen the main menu and has made a selection, the switch statement takes over. 

If you look at the image below you can see that for each "case" is the selection the user can make. So, if the user input for selection 1 was 4 then they would see _correct_, otherwise any other input would lead them to see _incorrect_. 

![Switch-Case](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/Code-Snippets/Switch-Statement.JPG)






