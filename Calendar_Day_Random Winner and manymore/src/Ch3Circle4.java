/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RPL
 */
import java.text.*;
import java.util.*;
    class Ch3Circle4 {
        public static void main(String[] args) {
    final double PI = 3.14159;
    final String TAB = "\t";
    final String NEWLINE = "\n";
    double radius, area, circumference;
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.000");
    System.out.println("Enter radius: ");
    radius = scanner.nextDouble( );
//compute the area and circumference
    area = PI * radius * radius;
    circumference = 2.0 * PI * radius;
//Display the results
System.out.println(
    "Given Radius: " + TAB + df.format(radius) + NEWLINE +
    "Area: " + TAB + df.format(area) + NEWLINE +
    "Circumference: " + TAB + df.format(circumference));
}
}
