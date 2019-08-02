/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RPL
 */
class Ch3Circle {
    public static void main(String[] args)  {
        final double PI = 3.14159;
        double radius, area, circumference;
        radius = 2.35;
       //compute the are and circumference
        area             = PI * radius * radius;
        circumference    = 2.0 * PI * radius;
        
        System.out.println("Given Radius:   "+radius);
        System.out.println("Area:   "+ area);
        System.out.println("Circumference: "+ circumference);
        
    }
}
