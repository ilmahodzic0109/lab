/* Create a program that asks the user for a password.
If the password is right, a secret message is shown to the user.
 */

/*package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true)
        {
            System.out.println("Type the password: ");
            String word= input.nextLine();
            if (word.equals("carrot")) {
                System.out.println("Right!");
                System.out.println("The secret is jryy qbar");
                break;
            }
        }
    }
}


/* Create a program that asks the user for three numbers and then prints
their sum. Use the following structure in your program:

 */


/*
public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int sum=0;
        int read;
        for(int i=1;i<=3;i++)
        {
            System.out.println("Type "+ i + " number: ");
            read=reader.nextInt();
            sum+=read;
        }
        System.out.println("Sum: " + sum);
    }
}

/* Create a program that reads numbers from the user and prints their sum.
The program should stop asking for numbers when the user enters the number 0.
The program should be structured like this:


 */


/*
public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int sum=0;
        while (true)
        {
            int read=Integer.parseInt(reader.nextLine());
            if(read==0)
            {
                break;
            }
            sum+=read;
            System.out.println("Sum now "+ sum);
        }
        System.out.println("Sum in the end "+ sum);
    }
}



/* Create a program that asks the user for the first number and the
last number and then prints all numbers between those two. Use a while loop.
If the first number is greater than the last number, the program prints nothing:
 */


/*
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("First number: ");
        int first_number= input.nextInt();
        System.out.println("Last number: ");
        int last_number= input.nextInt();
        int i = first_number;
        while(first_number<=last_number)
        {
            System.out.println(first_number);
            first_number++;
        }
    }
}

/* Create a program that calculates the sum of 20+21+22+...+2n, where n
is a number entered by the user. The notation 2i means raising the number 2 to
the power of i, for example 24 = 2*2*2*2 = 16. In Java we cannot
write ab directly, but instead we can calculate the power with the command
Math.pow(number, power). Note that the command returns a number of double t
ype (i.e. floating point number). A double can be converted into the int
type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3).
This assigns the value of 23 to variable result.
 */
/*
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number ");
        int number=input.nextInt();
        int sum=0;
        for (int i=0;i<=number;i++)
        {
            sum+= (int)Math.pow(2,i);
        }
        System.out.println("The sum is "+ sum);
    }
}

/* Create a method printText that prints the following string of
characters: "In the beginning there were the swamp, the hoe and Java." and a line break
 */
/*
public class Main {
    public static void main(String[] args) {
        System.out.println(printText());
    }
    public static String printText()
    {
        return "In the beginning there were the swamp, the hoe and Java.";
    }
}

/* Develop the program by adding the following feature: the main program should ask the user
how many times the text should be printed (meaning how many times the method is called).
 */
/*
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many times should the text be printed? ");
        int number= input.nextInt();
        printText(number);
    }
    public static void printText(int number)
    {
        for(int i=1;i<=number;i++)
        {
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
        }
    }
}

/* Create a method printStars that prints the given amount of stars and a line break.
 Create the method in the following body:
 */
/*
public class Main {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
    public static void printStars(int amount)
    {
        for (int i=1;i<=amount;i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}

/* Create a method called drawStarsPiramid that will accept the number of rows as
a parameter and print a half piramid shape where the number of rows will be dictated by the sent parameter.
 */
/*
public class Main {
    public static void main(String[] args) {
        drawStarsPiramid(6);
    }
    public static void drawStarsPiramid(int number)
    {
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* Create a method called drawStarsPiramid that will accept the number of rows as
a parameter and print a half piramid shape where the number of rows will be dictated by the sent parameter.
 */
/*
public class Main {
    public static void main(String[] args) {
        drawStarsPiramid(6);
    }
    public static void drawStarsPiramid(int number)
    {
        for(int i=number;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/* Modify the previously created starts piramid in a way that now you are not printing
the starts but in each row numbers from 1 to the current row count.
 */
/*
public class Main {
    public static void main(String[] args) {
        drawStarsPiramid(6);
    }
    public static void drawStarsPiramid(int number)
    {
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//last task- game

public class Main {
    public static void main(String[] args) {
        drawNumber();
    }

    public static void drawNumber() {
        Scanner input = new Scanner(System.in);
        int guess = -1;
        int counter = 0;
        int number = 68;
        while (true) {
            System.out.println("Guess the number: ");
            guess = input.nextInt();
            if (guess > number) {
                counter += 1;
                System.out.println("The number is lesser, guesses made: " + counter);
            } else if (guess < number) {
                counter += 1;
                System.out.println("The number is greater, guesses made: " + counter);
            } else {
                counter++;
                System.out.println("Congratulations, your guess is correct. Guesses made: " + counter);
                break;
            }

        }
    }
}*/