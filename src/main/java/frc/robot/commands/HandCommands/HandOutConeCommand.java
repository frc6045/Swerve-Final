package frc.robot.commands.HandCommands;

import frc.robot.subsystems.HandSubsystem;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class HandOutConeCommand extends CommandBase {
    private HandSubsystem s_Hand;

    private Timer m_timer = new Timer();

    public HandOutConeCommand(HandSubsystem s_Hand) {
        this.s_Hand = s_Hand;
        addRequirements(s_Hand);


    }

    @Override
    public void initialize() {
        m_timer.start();
        m_timer.reset();
    }


    @Override
    public void execute() {
      //if (m_timer.get() <= 1)
        s_Hand.RunHandsOutCone();


        /* Drive */

    }

    public void end(boolean interrupted) {
        // when command ends, stop motors here
        s_Hand.Stop();

    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
