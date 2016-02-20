package org.first.team4533.robot.subsystems;

import org.first.team4533.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClimbSystem extends Subsystem {
    
	private static ClimbSystem INSTANCE;
    private Spark climbmotor;
    private static final double DEFAULT_CLIMB_STOP_VALUE = 0.0;
	private static final double DEFAULT_CLIMB_UP_VALUE = 0.75;
	private static final double DEFAULT_CLIMB_RELEASE_VALUE = -1.0;
	
	private ClimbSystem() {
		climbmotor = new Spark(RobotMap.MOTOR_CLIMB);
	}
	public static ClimbSystem getInstance() {
		return INSTANCE;
	}
	public static void initialize() {
		if (INSTANCE == null) {
			INSTANCE = new ClimbSystem();
		}
	}
	
	public void release() {
		climbmotor.set(DEFAULT_CLIMB_RELEASE_VALUE);
	}

	public void up() {
		climbmotor.set(DEFAULT_CLIMB_UP_VALUE);
	}

	public void stop() {
		climbmotor.set(DEFAULT_CLIMB_STOP_VALUE);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

