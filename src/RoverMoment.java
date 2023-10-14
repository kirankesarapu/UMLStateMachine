/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kiran
 */
public class RoverMoment {
    
    Position position;
    CameraControl cameraControl;
    
    private enum Position{
        buggy_accelerate_forward , buggy_accelerate_back, constant_speed, deaccelerate, at_rest
    }
    enum CameraControl{
        Colour_Camera , Camera_16 , idle_state ,drill,
    }
    public RoverMoment(){
        position = Position.at_rest;
    }
    
    public void leftPedalMoreThan3Seconds(){
        position = position.buggy_accelerate_back;
        System.out.println("buggy accelerates back");
    }
    
    public void leftPedalPressedOnce(){
        position = position.buggy_accelerate_forward;
        System.out.println("buggy Accelerates forward");
    }
    
    public void rightPedalMoreThan3Seconds(){
        position = position.constant_speed;
        System.out.println("Constant Speed");
    }
    public void reachedMaxSpeed(){
        position = position.constant_speed;
        System.out.println("Constant Speed");
    }
    public void rightPedalPressedOnce(){
        position = position.deaccelerate;
        System.out.println("buggy De-Accelerate");
    }
    public Position getposition(){
        return position; 
    }
}
