package com.company;
import java.util.*;
import java.lang.*;

class GfG
{}
public class Main {

    public void denDanskeMetode(){
        System.out.println("klik her for at tjene 100 tusindvis af dollars");
    }

    public void Ratata(){
        System.out.println("An' da ting goes ....");
    }

    public void Uwuing(){
        System.out.println("UwU, mr shrek");
    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.Ratata();
        obj.Ratata();
        obj.Uwuing();
        obj.denDanskeMetode();

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 5)
            {
                System.out.println("exit...");

                // Terminate JVM
                System.exit(0);
            }
            else
                System.out.println("arr["+i+"] = " +
                    arr[i]);
        }
        System.out.println("End of Program");

        System.out.println("Hejsa og velkommen til troll cave1!!!1");
    }

}
