
# Git Workshop

## Getting started
Create a [Github](https://www.github.com) account.
Download [Git](https://git-scm.com/downloads).
The git repository used can be found [here](https://github.com/ufssd/GitWorkshop).

The final project will be a simple 4-function calculator. Each calculator function (addition, multiplication, etc.) will be defined in its own file. 
Each group will create one branch to this repository, containing a file with the calculator function.

## Download the code
To create the branch, go to the Github page for the repository. In the top right, click fork. This creates a copy of the repository for your own Github account. To download the repository, enter your command line where you want to have your project. To clone the project, type in the command line `git clone <url for your forked repository>`. You can find the url for your forked repository on the Github page if you click the green button "Clone or download" and copy the url that shows. Once the repository has been cloned, `cd` into the project directory.

## Make your changes
Complete the file your group is assigned. Then in Main.java, add a case to the switch statement where you call the function you made. 
Your files need to be **staged** to push your changes to the repository on Guthub. To commit all the files with changes, type in the command line `git commit add .` To stage an individual file one at a time, such as Addition.java, you can type `git add Addition.java` (the file name is case sensitive). To push the changes to your branch, type `git commit origin master`.

## Push your changes
Once your changes are pushed onto your new branch, you can create a pull request. On the Github page for your forked repository, click the "new pull request" button above the list of files. Click the green "Create pull request" button. Add a message about what your pull request does. Then click the "Create pull request" button again. 
