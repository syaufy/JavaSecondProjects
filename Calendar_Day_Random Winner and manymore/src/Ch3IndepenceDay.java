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
class Ch3IndepenceDay {
    public static void main (String[] args) {
        GregorianCalendar indepenceDay
                =new GregorianCalendar(1945, Calendar.AUGUST,17);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println("Hari Kemerdekaan adalah hari "
        + sdf.format(indepenceDay.getTime()));
    }
    
}
