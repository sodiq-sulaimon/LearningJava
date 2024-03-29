/*
Program to demonstrate how to declare constant variable
with 'final' keyword */
public class ConstantTest{
    public static void main(String[] args){
        final double PI = 3.14159265359;
        PI = 3.14 // generates compiler error because PI cannot be assigned a new value
    }
}