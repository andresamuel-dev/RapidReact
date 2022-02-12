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

    //speeds
    public static final double SHOOTER_TELEOP_SPEED = 1.0;
    public static final double TILT_UP_SPEED = 0.5;
    public static final double TILT_DOWN_SPEED = -0.5;

    //Buttons
    public static final int SHOOTER_TELEOP_BUTTON = 1;
    public static final int TILT_UP_BUTTON = 2;
    public static final int TILT_DOWN_BUTTON = 3;


    //Motor ports
    public static final int BOTTOM_LEFT_MOTOR = 0;
    public static final int BOTTOM_RIGHT_MOTOR = 0;
    public static final int TOP_RIGHT_MOTOR = 0;
    public static final int TOP_LEFT_MOTOR = 0;
    public static final int  TILT_MOTOR = 1;
    public static final int SHOOTER_MOTOR_RIGHT = 2;
    public static final int SHOOTER_MOTOR_LEFT = 3;

    //Sensor Ports
    public static final int TILT_SWITCH = 2;

    public static final double COVERED = 5;
    public static final int TRANSPORT_MOTOR = 7;
    public static final int TRANSPORT_SENSOR = 9;
    public static final double TRANSPORT_SPEED = 0.5;
    public static final int TRANSPORT_BUTTON = 7;

}
