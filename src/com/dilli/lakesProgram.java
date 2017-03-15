package com.dilli;

/*
this program uses the previously user-defined methods
from a different class and processes the data
 */
public class lakesProgram {
    public static void main(String[] args) {
        //creates lakes object
        lakes Cedar = new lakes("Cedar");
        //adds time to the object
        Cedar.addTime(45.15);
        Cedar.addTime(43.32);
        //creates lakes object
        lakes Harriet = new lakes("Harriet");
        //adds time to the object
        Harriet.addTime(49.34);
        Harriet.addTime(44.43);
        Harriet.addTime(46.22);
        //creates lakes object
        lakes Como = new lakes("Como");
        //adds time to the object
        Como.addTime(32.11);
        Como.addTime(28.14);
        System.out.println();
        //prints lakes running information.
        System.out.println("Here are the names of lakes with" +
                "\nminimum distance run around:");
        System.out.println();
        Cedar.writeRunningInfo();
        Harriet.writeRunningInfo();
        Como.writeRunningInfo();
    }
}
