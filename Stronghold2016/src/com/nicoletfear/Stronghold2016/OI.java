package com.nicoletfear.Stronghold2016;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import com.nicoletfear.Stronghold2016.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	//instantiate buttons, sensors and joysticks here
	public Joystick left0;
    public Joystick right1;
    public static Joystick gameMech;
    public static Button aButton;
    public static Button bButton;
    public static Button yButton;
    public static Button rightBumper;
    public static Button leftBumper;
	public static DigitalInput limitSwitchTop;
	public static DigitalInput limitSwitchBottom;
	public static DigitalInput limitSwitchIntake;


    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	//construct buttons and joysticks here here
    	gameMech = new Joystick(2);
    	aButton = new JoystickButton(gameMech , com.nicoletfear.Stronghold2016.xbox.Buttons.A);
    	bButton = new JoystickButton(gameMech , com.nicoletfear.Stronghold2016.xbox.Buttons.B);
    	yButton = new JoystickButton(gameMech , com.nicoletfear.Stronghold2016.xbox.Buttons.Y);
    	rightBumper = new JoystickButton(gameMech , com.nicoletfear.Stronghold2016.xbox.Buttons.RightBump);
    	leftBumper = new JoystickButton(gameMech , com.nicoletfear.Stronghold2016.xbox.Buttons.LeftBump);
    	
    	//construct sensors here 
    	limitSwitchTop = new DigitalInput(RobotMap.limitSwitchTopPort);
		limitSwitchBottom = new DigitalInput(RobotMap.limitSwitchBottomPort);
		limitSwitchIntake = new DigitalInput(RobotMap.limitSwitchIntakePort);


		//tie buttons to commands here
    	aButton.whileHeld(new IntakeCommand());
    	bButton.whileHeld(new PassCommand());
    	yButton.whileHeld(new ShootCommand());
    	rightBumper.whileHeld(new ArmUp());
    	leftBumper.whileHeld(new ArmDown());
    	//runs commands when buttons pressed
    	
        right1 = new Joystick(1);
        
        left0 = new Joystick(0);
        
        /*
        SmartDashboard.putData("Moat", new AutonomousMoat());
        SmartDashboard.putData("Rock Wall", new AutonomousRockWall());
        SmartDashboard.putData("Rough Terrain", new AutonomousRockyTerrain());
        SmartDashboard.putData("Low Bar", new AutonomousLowBar());
        SmartDashboard.putData("Ramparts", new AutonomousRamparts());
        */
        
        /*Button A = new JoystickButton(gameMech, 1);
        The Everything is Awesome code
         1 is button A on xbox
         */
        

	    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
	public static void init(){
		
	}
    public Joystick getLeft() {
        return left0;
    }

    public Joystick getRight() {
        return right1;
    }
    
}

