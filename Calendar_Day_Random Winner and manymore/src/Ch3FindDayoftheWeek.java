/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RPL
 */
import java.util.*;
import java.text.*;

class Ch3FindDayoftheWeek {
    public static void main(String[] args){
        int year,month,day;
        GregorianCalendar cal;
        SimpleDateFormat sdf;
        
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("Line Separator"));
        
        System.out.print("Year (yyyy):");
        year = scanner.nextInt();
        
        System.out.print("Month (1-12):");
        month = scanner.nextInt();
        
        System.out.print("Day (1-31):");
        day = scanner.nextInt();
        
        cal = new GregorianCalendar ( year ,month,day);
        sdf = new SimpleDateFormat ("EEEE");
        
        
        System.out.println("");
        System.out.println("Hari Di minggu:" + sdf.format(cal.getTime()));
    }
    }
    
