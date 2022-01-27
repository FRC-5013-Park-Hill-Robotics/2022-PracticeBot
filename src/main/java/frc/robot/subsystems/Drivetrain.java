package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DrivetrainConstants;

public class Drivetrain extends SubsystemBase{
   
    private CANSparkMax frontLeftMotor = new CANSparkMax(DrivetrainConstants.FRONT_LEFT_MOTOR_ID, MotorType.kBrushless);
    private CANSparkMax frontRightMotor = new CANSparkMax(DrivetrainConstants.FRONT_RIGHT_MOTOR_ID, MotorType.kBrushless);
    private CANSparkMax backLeftMotor = new CANSparkMax(DrivetrainConstants.BACK_LEFT_MOTOR_ID, MotorType.kBrushless);
    private CANSparkMax backRightMotor = new CANSparkMax(DrivetrainConstants.BACK_RIGHT_MOTOR_ID, MotorType.kBrushless);
    private MotorControllerGroup leftGroup = new MotorControllerGroup(new MotorController[] {frontLeftMotor,backLeftMotor});
    private MotorControllerGroup rightGroup = new MotorControllerGroup(new MotorController[] {frontRightMotor,backRightMotor});

    private final DifferentialDrive m_drive = new DifferentialDrive(leftGroup, rightGroup);

    public Drivetrain(){
        super();
    }
    
    public void arcadeDrive(double speed, double rotation){
         m_drive.arcadeDrive(speed, rotation);
         rightGroup.setInverted(true);
    }
}
