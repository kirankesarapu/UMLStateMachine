/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kiran
 */
public class Main {
    public static void main(String[]args ){
        ControlUnit unit =new ControlUnit();
        
        unit.leftPedalMoreThan3Seconds();
        unit.leftPedalPressedOnce();
        unit.reachedMaxSpeed();
        unit.rightPedalPressedOnce();
        unit.rightPedalMoreThan3Seconds();
        
        unit.pressButton1();
        unit.pressButtontwo();
        unit.button1For5Sec();
        unit.button1For10Sec();
                
    }
    
}
