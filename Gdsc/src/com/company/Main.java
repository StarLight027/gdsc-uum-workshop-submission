package com.company;

public class Main {

    public static void main(String[] args) {

        String [] name = {"Nur","Mursyidah","Binti","Shahul","Hameed"};

        for (int i = 0; i<= name.length - 1; i++) {
            System.out.println(name[i]);
        }

        int myAge = 15, theirAge = 20;

            if (myAge > theirAge)
                System.out.println("I am older");

            else if (myAge < theirAge)
                System.out.println("I am younger");
    }
}
