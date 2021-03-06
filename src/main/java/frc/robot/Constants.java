// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DrivetrainConstants{
        public static final int FRONT_LEFT_MOTOR_ID = 2;
        public static final int BACK_LEFT_MOTOR_ID = 1;
        public static final int BACK_RIGHT_MOTOR_ID = 3;
        public static final int FRONT_RIGHT_MOTOR_ID= 4;
    }
    public static final class DriverControllerConstants{
        //=====================Controller Constants=====================
        public static final double DEADBAND_VALUE = .01;
        public static final int XBOX_ID = 0;
        public static final int OPERATOR_CONTROLLER = 1;
        public static final int Y_LJOY_ID = 1;
        public static final int TRIGGER_AXIS = 3; //negative values are right and positive values are left
        public static final int X_RJOY_ID = 4;
    }
    public static final class ClimberConstants{
        public static final int LEFT_MOTOR = 5;
        public static final int RIGHT_MOTOR = 6;
    }
}
