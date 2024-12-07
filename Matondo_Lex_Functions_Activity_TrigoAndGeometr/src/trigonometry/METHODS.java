/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trigonometry;

/**
 *
 * @author User
 */
public class METHODS {
    public static double calculateTriangleSide(double a, double b, double AngleC) { return
           
 Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(AngleC); 
    }
    
    public static double calculateGeometry(double radius, double angle) { return
       Math.pow(radius, 2) / 2 * (angle - Math.sin(angle));
    }
    public static double calculateVolume(double radius) { return
     1.333333333333333*Math.PI*Math.pow(radius, 3);
    }
     public static double calculateArea(double radius) { return
       4*Math.PI*Math.pow(radius, 2);
    }
}
