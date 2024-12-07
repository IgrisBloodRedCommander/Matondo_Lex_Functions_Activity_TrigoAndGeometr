/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trigonometry;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TRIGONOMETRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean mainMenu = true;
      
        while (mainMenu) {
            String[] pickProb = {"Law of Cosines", "Geometry", "Solid Mensuration"};
            int pili = JOptionPane.showOptionDialog(
                    null,
                    "\nThe function of this program includes calculations in terms of\nLaw of Cosines, Geometry, and Solid Mensuration.\n\n",
                    "Different Functions",
                    JOptionPane.DEFAULT_OPTION, -1, null, pickProb, pickProb[0]);
            if (pili == -1) {
                JOptionPane.showMessageDialog(null, "Thank You For Using This Program");
                System.exit(0);
            }
            switch (pili) {
                case 0:

                    boolean again1 = true; //declared this boolean for users to be able to compute again that is inside a while loop. 
                    while (again1) {
                        String a = JOptionPane.showInputDialog(null, "Input the value of a: ", "Tirgonometric Function", JOptionPane.PLAIN_MESSAGE);
                        if (a == null) {
                            int piliBruh = JOptionPane.showConfirmDialog(null, "Do You Want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                            if (piliBruh == JOptionPane.YES_OPTION || piliBruh == JOptionPane.CLOSED_OPTION) {
                                JOptionPane.showMessageDialog(null, "Thank You For Using This Program");
                                System.exit(0);
                            }
                            continue; // Ask for input again
                        }
                        String b = JOptionPane.showInputDialog(null, "Input the value of b: ", "Tirgonometric Function", JOptionPane.PLAIN_MESSAGE);
                        if (b == null) {
                            int piliBruh = JOptionPane.showConfirmDialog(null, "Do You Want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                            if (piliBruh == JOptionPane.YES_OPTION || piliBruh == JOptionPane.CLOSED_OPTION) {
                                JOptionPane.showMessageDialog(null, "Thank You For Using This Program");
                                System.exit(0);
                            }
                            continue; // Ask for input again
                        }
                        String angleC = JOptionPane.showInputDialog(null, "Input the value of angle C: ", "Tirgonometric Function", JOptionPane.PLAIN_MESSAGE);

                        if (angleC == null) {
                            int piliBruh = JOptionPane.showConfirmDialog(null, "Do You Want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                            if (piliBruh == JOptionPane.YES_OPTION || piliBruh == JOptionPane.CLOSED_OPTION) {
                                JOptionPane.showMessageDialog(null, "Thank You For Using This Program");
                                System.exit(0);
                            }
                            continue; // Ask for input again
                        }

                        try {
                            int a2 = Integer.parseInt(a);
                            int b2 = Integer.parseInt(b);
                            int angleC2 = Integer.parseInt(angleC);
                            double angleCRadians = Math.toRadians(angleC2);
                            double ValueOfC = METHODS.calculateTriangleSide(a2, b2, angleCRadians);
                            double answerC = Math.sqrt(ValueOfC); //in this part, I turned the value of the C into radians and then i put it in the method. Next is that i then declared a variable answerC wherein it will show the square root as the final value of c.
                            String[] ans = {"Change Values", "Back To Menu"};
                            int pili1 = JOptionPane.showOptionDialog(
                                    null,
                                    "Value of a: " + a2 + "\nValue of b: " + b2 + "\nValue of Angle C: " + angleC2 + "\nThe Value of c is: " + answerC + "\n\n", //this part will show the answer, sir! hehe
                                    "Value of c",
                                    JOptionPane.DEFAULT_OPTION, -1, null, ans, ans[0]);

                            if (pili1 == 0) {
                                again1 = true;
                            } if (pili1 == 1) { // Go back to function menu
                                again1 = false;
                                mainMenu = true; 
                            } else if (pili1 == -1) { // close
                                JOptionPane.showMessageDialog(null, "Thank You For Using This Program");
                                System.exit(0);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric value for the radius.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } break;
                case 1:
                    boolean again = true; //declared this boolean for users to be able to compute again that is inside a while loop. 
                    while (again) {
                        String radius = JOptionPane.showInputDialog(null, "Input the value of Radius: ", "Geometry", JOptionPane.PLAIN_MESSAGE);
                        if (radius == null) {
                            int piliBruh = JOptionPane.showConfirmDialog(null, "Do You Want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                            if (piliBruh == JOptionPane.YES_OPTION || piliBruh == JOptionPane.CLOSED_OPTION) {
                                JOptionPane.showMessageDialog(null, "Thank You For Using This Program");
                                System.exit(0);
                            }
                            continue; // Ask for input again
                        }
                        String angle = JOptionPane.showInputDialog(null, "Input the value of the Angle: ", "Area of a Circle Segment", JOptionPane.PLAIN_MESSAGE);
                        if (angle == null) {
                            int piliBruh = JOptionPane.showConfirmDialog(null, "Do You Want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                            if (piliBruh == JOptionPane.YES_OPTION || piliBruh == JOptionPane.CLOSED_OPTION) {
                                JOptionPane.showMessageDialog(null, "Thank You For Using This Program");
                                System.exit(0);
                            }
                            continue; // Ask for input again
                        }

                        try {
                            int rad = Integer.parseInt(radius);
                            int ang = Integer.parseInt(angle);

                            double angle1 = Math.toRadians(ang);
                            double finalAns = METHODS.calculateGeometry(rad, angle1);

                            String[] ans = {"Change Values", "Back To Menu"};
                            int pili1 = JOptionPane.showOptionDialog(
                                    null,
                                    "Value of Radius: " + rad + "\nValue of the Angle: " + ang + "\nThe Value of Area of Circle  : " + finalAns + "\n\n", //this part will show the answer, sir! hehe
                                    "Area of Circle Segment",
                                    JOptionPane.DEFAULT_OPTION, -1, null, ans, ans[0]);

                            if (pili1 == 0) {
                                again = true;
                            } else if (pili1 == 1) { // Go back to function menu
                                again = false;
                            } else if (pili1 == -1) { // close
                                JOptionPane.showMessageDialog(null, "Thank You For Using This Program");
                                System.exit(0);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric value for the radius.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } break;
                case 2: 
                    boolean again2 = true; //declared this boolean for users to be able to compute again that is inside a while loop. 
                    while (again2) {
                        String radius = JOptionPane.showInputDialog(null, "Input the value of Radius: ", "Geometry", JOptionPane.PLAIN_MESSAGE);
                        if (radius == null) {
                            int piliBruh = JOptionPane.showConfirmDialog(null, "Do You Want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                            if (piliBruh == JOptionPane.YES_OPTION || piliBruh == JOptionPane.CLOSED_OPTION) {
                                JOptionPane.showMessageDialog(null, "Thank You For Using This Program");
                                System.exit(0);
                            }
                            continue; // Ask for input again
                        }
                        try {
                            int rad = Integer.parseInt(radius);
                      

                      
                            double volume = METHODS.calculateVolume(rad);
                            double area = METHODS.calculateArea(rad);

                            String[] ans = {"Change Values", "Back To Menu"};
                            int pili1 = JOptionPane.showOptionDialog(
                                    null,
                                    "Value of Radius: "+ rad + "\nThe Volume of the Sphere  : " + volume +"\nThe Area of the Sphere: "+area+ "\n\n", //this part will show the answer, sir! hehe
                                    "Area of Circle Segment",
                                    JOptionPane.DEFAULT_OPTION, -1, null, ans, ans[0]);

                            if (pili1 == 0) {
                                again2 = true;
                            } else if (pili1 == 1) { // Go back to function menu
                                again2 = false;
                            } else if (pili1 == -1) { // close
                                JOptionPane.showMessageDialog(null, "Thank You For Using This Program");
                                System.exit(0);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric value for the radius.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } break;
            } 

        }
    }
    
}
