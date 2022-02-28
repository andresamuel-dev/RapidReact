package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class MoveElevator extends CommandBase{

    private double speed;
    private double limit = 0;

    public MoveElevator(double speed){
        addRequirements(RobotContainer.getElevator());
        this.speed = speed;
    }
    @Override
    public void initialize(){
        
    }

    @Override 
    public void execute(){
        
        if(speed > 0)
        {
            if(RobotContainer.getElevator().getDistance() >= limit)
            {
                RobotContainer.getElevator().stop();
            } else {
                RobotContainer.getElevator().move(speed);
            }

        } else if (speed <= 0) {
            if (RobotContainer.getElevator().getElevatorLimit()) {
                RobotContainer.getElevator().stop();
            } else {
                RobotContainer.getElevator().move(speed);
            }
        }
    }    


    @Override
    public boolean isFinished(){
        if(speed < 0)
        {
            return !RobotContainer.getJoy().getRawButton(Constants.ELEVATOR_UP_BUTTON);
        }
        else
        {
            return (RobotContainer.getElevator().getDistance() >= limit || !RobotContainer.getJoy().getRawButton(Constants.ELEVATOR_DOWN_BUTTON));
        }    
    }

    @Override
    public void end(boolean interrupted){
        RobotContainer.getElevator().stop();
    }
}
