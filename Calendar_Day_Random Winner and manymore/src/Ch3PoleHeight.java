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
class Ch3PoleHeight {
    
    public static void main ( String[]args) {
        double height;      // ukuran dari pole0
        double distance;    // jarak antara satu poin ke poin lain
        double alpha;       // angle measured at point
        double beta;        // angle measured at point
        double alphaRad;    // angle alpha in radians
        double betaRad;     //angle beta in radians
        
        Scanner scanner =   new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        
        //Get Three input Values
        System.out.print("Angle alpha (in degrees):");
        alpha = scanner.nextDouble();
        System.out.print("Angle beta (in degrees):");
        beta = scanner.nextDouble();
        System.out.print("Distance between points A and B (ft):");
        distance = scanner.nextDouble();
        
        //compute the height of the tower
        alphaRad = Math.toRadians(alpha);
        betaRad = Math.toRadians(beta);
        
        height = ( distance * Math.sin(alphaRad) * Math.sin(betaRad))
                /
                Math.sqrt(Math.sin(alphaRad + betaRad)*
                        Math.sin(alphaRad-betaRad)  );
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("lnln Estimating the height of the pole"
                +"\n\n"
                +"angle at point A (deg):   "+df.format(alpha)  +"\n"
                +"angle at point B (deg):   "+df.format(beta)  +"\n"
                +"Distance between A dan B (ft):   "+df.format(distance)  +"\n"
                +"Estimated Height(ft):   "+df.format(height));
    }
}
                     
  