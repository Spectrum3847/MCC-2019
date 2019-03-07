package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.lib.drivers.PressureTransducer;
import frc.robot.Robot;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Pneumatics extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
    public PressureTransducer pressure;
    public Compressor compressor;
    public Compressor intakeSW;

	public Pneumatics() {
        pressure = new PressureTransducer(0);
        compressor = new Compressor(0);
        intakeSW = new Compressor(1);
    }
    
	public void periodic() {
        //Turn compressor off if the Smartdashboard check box is checked
        if (SmartDashboard.getBoolean("Compressor ENABLE", true)) {
			Robot.pneumatics.compressor.start();
		} else {
			Robot.pneumatics.compressor.stop();
		}
    }
    
    public boolean getIntakeSW(){
        return intakeSW.getPressureSwitchValue();
    }

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	//Add the dashboard values for this subsystem
	public void dashboard() {
		SmartDashboard.putNumber("Pressure", pressure.getPressure());
	}
	
	/*Modify this method to return false if there is a problem with the subsystem
	  Based on 254-2017 Code
	*/
	public boolean checkSystem() {
        //Write something to check that the pressure transducer isn't unplugged
        //Write something to check that the PCMs don't have faults
		return true;
		
		/** Example checkSystem from 254's 2017 Robot
		 System.out.println("Testing HOPPER.--------------------------------------");
        final double kCurrentThres = 0.5;

        mMasterTalon.changeControlMode(CANTalon.TalonControlMode.Voltage);
        mSlaveTalon.changeControlMode(CANTalon.TalonControlMode.Voltage);

        mMasterTalon.set(0.0);
        mSlaveTalon.set(0.0);

        mMasterTalon.set(-6.0f);
        Timer.delay(4.0);
        final double currentMaster = mMasterTalon.getOutputCurrent();
        mMasterTalon.set(0.0);

        Timer.delay(2.0);

        mSlaveTalon.set(6.0f);
        Timer.delay(4.0);
        final double currentSlave = mSlaveTalon.getOutputCurrent();
        mSlaveTalon.set(0.0);

        mMasterTalon.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
        mSlaveTalon.changeControlMode(CANTalon.TalonControlMode.PercentVbus);

        System.out.println("Hopper Master Current: " + currentMaster + " Slave current: " + currentSlave);

        boolean failure = false;

        if (currentMaster < kCurrentThres) {
            failure = true;
            System.out.println("!!!!!!!!!!!!!!!!! Hopper Master Current Low !!!!!!!!!!!!!!!!!");
        }

        if (currentSlave < kCurrentThres) {
            failure = true;
            System.out.println("!!!!!!!!!!!!!!!! Hooper Slave Current Low !!!!!!!!!!!!!!!!!!!");
        }

        if (!Util.allCloseTo(Arrays.asList(currentMaster, currentSlave), currentMaster, 5.0)) {
            failure = true;
            System.out.println("!!!!!!!!!!!!!!!! Hopper Currents Different !!!!!!!!!!!!!!!!!");
        }

        return !failure;
		 */
	}
}
