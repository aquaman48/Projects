//Trivia game, fun for the whole family!

#include<stdio.h>
#include<time.h>
#include<stdlib.h>

//Function Prototypes
int sportsQuestion(void);
int geographyQuestion(void);
int hardQuestion(void);
void pause(int);

//Global variables
int giResponse = 0;

int main()
{
	//do while loop
	do {
		system("CLS");
		printf("\n\tTHE TRIVIA GAME\n\n");
		printf("1\tSports\n");
		printf("2\tGeography\n");
		printf("3\tHard Question\n");
		printf("4\tQuit\n");
		printf("\nEnter your selection: ");
		scanf_s("%d", &giResponse);

		//switch statement for what user inputs
		switch (giResponse)
		{
		case 1:
			if (sportsQuestion() == 4)
				printf("\nCorrect!\n");
			else
				printf("\nIncorrect!\n");
			pause(2);
			break;
		case 2:
			if (geographyQuestion() == 2)
				printf("\nCorrect!\n");
			else
				printf("\nIncorrect!\n");
			pause(2);
			break;
		case 3:
			if (hardQuestion() == 3)
				printf("\nCorrect!\n");
			else
				printf("\nIncorrect\n");
			pause(2);
			break;
		}//end switch
	} while (giResponse != 4);
	return 0;
}//end of main function

//Function definitions
int sportsQuestion(void)
{
	int iAnswer = 0;
	system("CLS");
	printf("\tSports Question\n");
	printf("\nWhat university did Deion Sanders attend? ");
	printf("\n\n1\tUniversity of Miami\n");
	printf("2\tCalifornia State University\n");
	printf("3\tIndiana University\n");
	printf("4\tFlorida State University\n");
	printf("\nEnter your selection: ");
	scanf_s("%d", &iAnswer);
	return iAnswer;
}//end of sportsQuestion function

//geographyQuestion Function definition
int geographyQuestion(void)
{
	int iAnswer = 0;
	system("CLS");
	printf("\tGeography Question\n");
	printf("\nWhat is the capital of Florida? ");
	printf("\n\n1\tPensacola\n");
	printf("2\tTallahassee\n");
	printf("3\tJacksonville\n");
	printf("4\tMiami\n");
	printf("\nEnter your selection: ");
	scanf_s("%d", &iAnswer);
	return iAnswer;
}//end of geographyQuestion function definition

//hard question function definition
int hardQuestion(void)
{
	int iAnswer = 0;
	system("CLS");
	printf("\tHard Question\n");
	printf("\nIn California, you can not legally buy a mousetrap without having what?");
	printf("\n\n1\tDrivers License\n");
	printf("2\tFood Stamps\n");
	printf("3\tHunting License\n");
	printf("4\tNone of the above\n");
	printf("\nEnter your selection: ");
	scanf_s("%d", &iAnswer);
	return iAnswer;
}//end of hard question function


//void function definition
void pause(int inNum)
{
	int iCurrentTime = 0;
	int iElapsedTime = 0;
	iCurrentTime = time(NULL);
	do {
		iElapsedTime = time(NULL);
	} while ((iElapsedTime - iCurrentTime) < inNum);
}//end of pause function definition
