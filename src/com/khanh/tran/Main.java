package com.khanh.tran;


import com.object.in.java.ColorObject;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ColorObject redColor = new ColorObject("red");
        ColorObject greenColor = new ColorObject("green");

        System.out.println("Color before : ");
        System.out.println("Red Object " + redColor.getColor());
        System.out.println("Green Object " + greenColor.getColor());

        swapColor(redColor, greenColor);

        System.out.println("Color after : ");
        System.out.println("Red Object " + redColor.getColor());
        System.out.println("Green Object " + greenColor.getColor());

        swapColorAttribute(redColor, greenColor);

        System.out.println("Color after change attribute: ");
        System.out.println("Red Object " + redColor.getColor());
        System.out.println("Green Object " + greenColor.getColor());
    }

     /*
    * RESULT : Color of redColor and Green Color not change :
    *
    *
    *
    *
    * */

    private static void swapColor(ColorObject a, ColorObject b){
        ColorObject c = a;
        a = b;
        b = c;
    }


    private static void swapColorAttribute(ColorObject a, ColorObject b){
        ColorObject c = a;
        a.setColor(b.getColor());
        b.setColor(c.getColor());
    }
}
