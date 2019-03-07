package frc.robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.commands.RumbleOff;

public class Disabled {
    
    public static void init() {
        Command a = new RumbleOff();
        a.start();
        Scheduler.getInstance().removeAll();
        a.close();
        Robot.vision.teleopInit();
    }

    //Periodic method called roughly once every 20ms
    public static void periodic() {
        Scheduler.getInstance().run();
    }
}
