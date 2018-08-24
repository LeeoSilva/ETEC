//Libraries
import java.awt.Toolkit;
import java.awt.GridLayout;
import java.util.Vector;
import java.awt.Font;
import java.awt.Color;
import java.io.File;
import javax.swing.JOptionPane;
//End Libraries

public class Exercicio2 extends Functions{

//Actual Program.
  public static void main (String args []){
    Input();

    tableTest(); //Verification for more Interviews.
    mans();//Mans Calculation.
    womans();//Womans Calculation.
    people();//People Calculation.

    userDesition();

    if(desition == userDecides[0]){
      ListIntervield();
    }else if(desition == userDecides[1]){
      ListMansCalc();
    }else if(desition == userDecides[2]){
      ListWomansCalc();
    }else if(desition == userDecides[3]){
      ListAllOverweight();
    }else if(desition == userDecides[4]){
      ListOrdenedByWeight();
    }else{
      System.exit(0);
    }
  }
}
