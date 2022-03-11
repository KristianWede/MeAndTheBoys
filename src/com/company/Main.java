package com.company;
import java.io.IOException;
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
        Runtime runtime = Runtime.getRuntime();
        try
        {
            System.out.println("Shutting down the PC after 5 seconds.");
            runtime.exec("shutdown -s -t 5");
        }
        catch(IOException e)
        {
            System.out.println("Exception: " +e);
        }




        System.out.println("Hejsa og velkommen til troll cave1!!!1");
    }

}
