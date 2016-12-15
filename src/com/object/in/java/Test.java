package com.object.in.java;

/**
 * Created by Khanh Tran on 12/15/2016.
 */
public class Test {
    public static void main(String[] args) {
        // write your code here
        ColorObject redColor = new ColorObject("red");
        ColorObject greenColor = new ColorObject("green");

        System.out.println("Color before : ");
        System.out.println("Red Object " + redColor.getColor());
        System.out.println("Green Object " + greenColor.getColor());
        System.out.println(" ");

        swapColor(redColor, greenColor);

        System.out.println("Color after : ");
        System.out.println("Red Object " + redColor.getColor());
        System.out.println("Green Object " + greenColor.getColor());
        System.out.println(" ");

        swapColorAttribute(redColor, greenColor);
    }

     /*
    * RESULT : Color of redColor and Green Color not change :
    *
    * When pass object to the function, we not pass by ref
    *
    *
    *
    * */

    private static void swapColor(ColorObject redColor, ColorObject greenColor){
        ColorObject templateColor = redColor;
        redColor = greenColor;
        greenColor = templateColor;

        System.out.println("Color after swap two object : ");
        System.out.println("Red Object " + redColor.getColor());
        System.out.println("Green Object " + greenColor.getColor());
        System.out.println("Template Object " + templateColor.getColor());
        System.out.println(" ");
    }

    /*
    * RESULT : Color of redColor and Green Color is same:
    *
    *
    *
    *
    * */

    private static void swapColorAttribute(ColorObject redColor, ColorObject greenColor){
        ColorObject c = redColor;
        redColor.setColor(greenColor.getColor());
        greenColor.setColor(c.getColor());

        System.out.println("Color after change attribute: ");
        System.out.println("Red Object " + redColor.getColor());
        System.out.println("Green Object " + greenColor.getColor());
        System.out.println(" ");
    }

}
