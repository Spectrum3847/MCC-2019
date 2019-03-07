package frc.robot;

import edu.wpi.first.wpilibj.PowerDistributionPanel;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class HW {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	//Use ecplise refacotr tool to rename values for your specific robot
	
	public static int CANconfigTimeOut = 0;
	//OI
	public static OI oi;

	/*
	public static final Gamepad Driver_Gamepad = new Gamepad("Driver", HW.USBPORT_0);
    public static final Gamepad Operator_Gamepad = new Gamepad("Operator", HW.USBPORT_1);
	*/
	//PDP Panel
	public static PowerDistributionPanel PDP = new PowerDistributionPanel();
	
	//Minimum battery voltage before recommending change
	public static final int MIN_BATTERY_VOLTAGE = 12;
	
    /**PDP Slots**/

	public static final int LEFT_DRIVE_FRONT_PDP = 10;
	public static final int LEFT_DRIVE_MIDDLE_PDP = 11;
	public static final int LEFT_DRIVE_REAR_PDP = 12;
	public static final int RIGHT_DRIVE_FRONT_PDP = 20;
	public static final int RIGHT_DRIVE_MIDDLE_PDP = 21;
	public static final int RIGHT_DRIVE_REAR_PDP = 22;
	
	public static final int ELEVATOR_SRX_PDP= 30;
	public static final int ELEVATOR_SPX_PDP = 31;
	public static final int CLIMBER_SRX_PDP= 40;
	public static final int CLIMBER_SPX_PDP = 41;
	
	public static final int CARGO_TOP_PDP = 50;
	public static final int CARGO_BOTTOM_PDP = 51;

	/**MOTOR ASSIGNMENTS**/
    public static final int LEFT_DRIVE_FRONT = 10;
    public static final int LEFT_DRIVE_MIDDLE = 11;
    public static final int LEFT_DRIVE_REAR = 12;
    public static final int RIGHT_DRIVE_FRONT = 20;
    public static final int RIGHT_DRIVE_MIDDLE = 21;
    public static final int RIGHT_DRIVE_REAR = 22;
    
    public static final int ELEVATOR_SRX  = 30;
    public static final int ELEVATOR_SPX = 31;
    public static final int CLIMBER_SRX   = 40;
    public static final int CLIMBER_SPX  = 41;
    
    public static final int CARGO_TOP = 50;
    public static final int CARGO_BOTTOM = 51;
    
    /**DIGITAL SENSOR ALLOCATIONS**/
    public static final int CARGO_SESNOR = 0;
    public static final int CLIMBER_SENSOR = 1; 
    public static final int DIGITAL_IO_2 = 2;
    public static final int DIGITAL_IO_3 = 3;
    public static final int DIGITAL_IO_4 = 4; 
    public static final int DIGITAL_IO_5 = 5;
    public static final int DIGITAL_IO_6 = 6; 
    public static final int DIGITAL_IO_7 = 7; 
    public static final int DIGITAL_IO_8 = 8;
    public static final int DIGITAL_IO_9 = 9;  
    
    /**Pneumatics**/
    public static final int CLIMBER_SOL = 0;
    public static final int HATCH_EJECT_SOL = 11;
    public static final int HATCH_HOLD_SOL = 10;
    public static final int CARGO_INTAKE_SOL = 9;
    public static final int CARGO_TILT_SOL = 8;
    
    /**ANALOG SENSOR ALLOCATIONS**/
    public static final int PRESSURE_TRANSDUCER = 0;
    public static final int ANALOG_IN_1 = 1;
    public static final int ANALOG_IN_2 = 2;
    public static final int ANALOG_IN_3 = 3;
    
    /**RELAY ALLOCATIONS**/
    public static final int RELAY_ZERO = 0;
    public static final int RELAY_ONE = 1;
    public static final int RELAY_TWO = 2;
    public static final int RELAY_THREE = 3;

    /**JOYSTICKS/GAMEPAD ASSIGNMENTS**/
    public static final int USBPORT_0 = 0;
    public static final int USBPORT_1 = 1;
    public static final int USBPORT_2 = 2;
    public static final int USBPORT_3 = 3;
    public static final int USBPORT_4 = 4;
    public static final int DSControllerPort = 5;
}
