package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

//
    public static void main(String[] args) {


    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static String BookDetails() {
        String BookTitle = getInput("Enter the title of the book");
        String ISBN = getInput("Enter the ISBN of the book");
        String Author = getInput("Enter the author of the book");
        String Genre = getInput("Enter the genre of the book");
        return (BookTitle + "%" + ISBN + "%" + Author + "%" + Genre);
    }

    public static void DetailsSplitting(){

        String[]  = .get(i).split("%");


    }

//Need to finish off splitting the details off
//Store the books by title and then allow the user to see the details of the book based on its title
//create a counter to keep track of the amount of stored books

}
