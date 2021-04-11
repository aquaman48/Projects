# Microsoft Visual Studios Assistance

So, you want to run the file yourself? Ok, if you already have the latest version of Microsoft Visual Studios installed then we can move forward.
If you do not have it installed then please install it and all the dependencies for working with C++ files. You can click [**here**](https://visualstudio.microsoft.com/downloads/) to download the free version of Microsoft Visual Studios. The community edition is free. When downloading keep an eye out for the C++ console files. 

## Getting Started

#### **Step 1**
<br />
Once you have everything installed and your workstation has been restarted you should be good to go. Once Visual Studios is open you will see a screen like the one below. On the right side of the screen we want to create a new project. 
<br />

![Step-1](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/VS/VS-New-Proj-1.png)

<br />
<br/>

#### **Step 2**

<br/>

After clicking create new project you should see a screen similiar to the one below. We want to use the Console App for C++. If you do not see that option try searching for it in the "Search for Templates" search bar. 

![Step-2](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/VS/Step-2.png)

<br/>

Once you find it select it and click on Next.

<br/>

#### **Step 3**

<br/>

On the following screen we are going to verify the location of our source files and give a project name. I went with C-Project as my project name, feel free to use whatever name you want. 

<br/>

`Note: Keep in mind of the default location or whatever location you give that is shown on this screen. If you ever want to see the files in file explorer or command line.`

<br /><br/>

![Step-3](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/VS/Step-3.png)

Also, to avoid confusion make sure the checkbox is checked for Place solution and project in same directory.
After you did all this click on create. 

<br/><br />


## Project Created

<br/> <br/>

Now at this point we have a project created. So the previous steps are how you can create a new project. Moving forward will go through the steps of adding the code for the  Trivia Game.

<br/> <br/>

#### **Step 4**

<br/>

Once the project has been created you should see a screen like this:

<br/> <br/>

![Step-4](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/VS/Step-4.PNG)

<br/> <br/>

We want to add a new file so we can insert our code for this program.

`If you do not see a Solution Explorer like in the screenshot, then use the shortcut ctrl+alt+L and it will display`

<br/> <br/>

#### **Step 5**

<br/> <br/>

Inside the Solution Explorer box, right click on Source Files and then select add, and new item.

<br/> <br/>

![Step-5](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/VS/Step-5.PNG)

<br/> <br/>

#### **Step 6**

<br/> <br/>

After selecting new item we are going to select the default C++ file. Notice it is a .cpp file. In order for us to compile the code for C we want to simply change the **source.cpp** over to something like **Trivia_Game.c**. We will use the **_.c_** file extension, which the C++ compiler in Visual Studios will work just fine with C files as well. 

<br/> <br/>

![Step-6](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/VS/Step-6.png)

<br/> <br/>

#### **Step 7**

<br/> <br/>

Now we have our new file added to our project and we should see the new file over in our solutions explorer underneath the default .cpp file that was created when we made the project. However, we can only have 1 file active at a time to be able to successfully debug our code. In my case I **right** clicked on C-Projects.cpp under the source files. Once you right click we want to remove. For now, I am just going to remove and then delete the file. If we just remove the file we would be able to bring the same file we removed back later.

<br /><br />

![Step-7](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/VS/Step-7.png)



`Note: From Step 5 to now is how we would also add and remove other files to code and debug as well.`

<br/> <br/>

#### **Step 8**

<br/><br/>

Now we should only have our one file here. This is the spot where we can start editing our code and getting our program ready. Now, you can copy/paste the [source code](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Trivia_Game/Trivia_Game.c) or type it out yourself making whatever changes you want. When you have all the code or at any point you want to run the debugger make sure the solution platform is changed from x86 --> x64. 

<br/> <br/>

![Step-8](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/VS/Step-8.PNG)

<br/> <br/>

#### **Step 9**

<br/> <br/>

Now, you have all your code and it is looking good. That means you want to see the fruits of your labor and check out the new program you coded. Well, after you change to x64 as mentioned in the previous step. You can run the program with `f5` or go to debug>start-debugging.

<br/><br/>

![Step-9](https://github.com/aquaman48/Projects/blob/main/C%20Projects/Screenshots/VS/Step-9.PNG)

<br/><br/>

# Congratulations

You made it! I hope it wasn't to hard to follow along. 
Once you run the debugger the real fun begins as it will either work or not work. Sometimes it might not work as intended, others it will work flawlessly. Just remember to fix the issues as they come up and take your time to soak in all the information. 

Best of luck!

Aquaman48 
