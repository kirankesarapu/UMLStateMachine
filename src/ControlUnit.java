/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kiran
 */
public class ControlUnit extends RoverMoment {
    
    enum Drill{
        Drill_interact_off, Drill_interact_on
    }
    public Drill drill;
    
    public ControlUnit(){
        
    }
    public void pressButtontwo(){
        this.cameraControl=cameraControl.idle_state;
    }
    public void button1For5Sec(){
        if(this.cameraControl==CameraControl.Colour_Camera || this.cameraControl==CameraControl.Camera_16){
            System.out.println("Activates the temporizer");
        }else{
            this.cameraControl=CameraControl.Colour_Camera;
            System.out.println("Interact with Colour Camera");
        }
    }
    public void button1For10Sec(){
        this.cameraControl=CameraControl.Camera_16;
        System.out.println("Interact with the 16MM Camera");
    }
    public void pressButton1(){
        if(this.cameraControl==CameraControl.Camera_16 || this.cameraControl==CameraControl.Colour_Camera){
            System.out.println("Takes Picture");
        }else if(this.cameraControl == CameraControl.drill){
            if(drill==Drill.Drill_interact_on){
                System.out.println("OFF");
                drill=Drill.Drill_interact_off;
            }else{
                System.out.println("ON");
                drill=Drill.Drill_interact_on;
            }
        }
}
public void button1PressedTwice(){
    this.drill=Drill.Drill_interact_on;
    this.cameraControl=CameraControl.drill;
}
}