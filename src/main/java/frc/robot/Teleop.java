package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Scheduler;


/**
 * The Driver Control period of the competition
 */
public class Teleop {
	
    public static void init() {
        Scheduler.getInstance().removeAll();
        Robot.vision.teleopInit();
        //Do things if connected to FMS only, so when telop starts during a match but not during testing
        if (DriverStation.getInstance().isFMSAttached()){
        }
    }

    public static void periodic() {
        Scheduler.getInstance().run();

    }

    public static void cancel() {
        Scheduler.getInstance().removeAll();
    }
}
