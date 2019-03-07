/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.lib.controllers.SpectrumAndNotButton;
import frc.lib.controllers.SpectrumAxisButton;
import frc.lib.controllers.SpectrumIOButton;
import frc.lib.controllers.SpectrumOrButton;
import frc.lib.controllers.SpectrumTwoButton;
import frc.lib.controllers.SpectrumXboxController;
import frc.lib.controllers.SpectrumAxisButton.ThresholdType;
import frc.lib.controllers.SpectrumXboxController.XboxAxis;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static SpectrumXboxController driverController;
  public static SpectrumXboxController operatorController;
  public static SpectrumAxisButton leftTriggerButton;
  public static SpectrumAxisButton rightTriggerButton;
  //public static SpectrumAxisButton rightTriggerCanelIntake;
  public static SpectrumAxisButton leftStickIn;
  public static SpectrumAxisButton leftStickCargoShip;

  public OI() {
		driverController = new SpectrumXboxController(0, .17, .05);
    operatorController = new SpectrumXboxController(1, .15, .15);

    //Driver Buttons
    //A button is aim with camera inside drive() command

    //Operator Buttons

    //Cargo and Hatch Controls


    //Elevator Controls


  }

  public boolean isOperatorButtonPushed(){
    if (operatorController.aButton.get() 
        || operatorController.bButton.get() 
        || operatorController.xButton.get()
        || operatorController.yButton.get()
        || operatorController.rightBumper.get()
        || operatorController.leftBumper.get()
        || operatorController.startButton.get()
        || operatorController.selectButton.get()){
          return true;
        }
    else{
      return false;
    }
  }

  public boolean isDriverButtonPushed(){
    if (driverController.aButton.get() 
        || driverController.bButton.get() 
        || driverController.xButton.get()
        || driverController.yButton.get()
        || driverController.rightBumper.get()
        || driverController.leftBumper.get()
        || driverController.startButton.get()
        || driverController.selectButton.get()){
          return true;
        }
    else{
      return false;
    }
  }

  /*
   * Example Buttons
   * 
    //Left Trigger sets the speed of the punch either wheeled outtake, soft punch, full punch in OperatorPuncher() command
		operatorController.rightBumper.toggleWhenPressed(new OperatorEject());

		//Left Bumper reverses these positions in SetArmPos command
		operatorController.aButton.whileHeld(new SetArmPos(Arm.Position.FwdIntake));
		operatorController.xButton.whileHeld(new SetArmPos(Arm.Position.FwdScore));
   */

  

}
