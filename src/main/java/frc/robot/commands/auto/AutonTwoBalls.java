package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonTwoBalls extends SequentialCommandGroup{
    public AutonTwoBalls(){
        addCommands(new BallVision(0, 0.4, 0.5), new TargetVision(0, true), new Wait(0.4), new ForwardTimer(0.3, -0.4), new TargetVision(0, true), new Wait(1));
    
    }
}