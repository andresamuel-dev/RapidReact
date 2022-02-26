package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.commands.auto.TimedShooter;
import frc.robot.commands.auto.TimedTransport;

public class ShooterTransport extends ParallelCommandGroup{
    public ShooterTransport(){
        addCommands(new TimedShooter(1, .5), new TimedTransport(1));
    }
}