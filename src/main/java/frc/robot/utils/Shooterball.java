// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.utils;

import edu.wpi.first.wpilibj2.command.Command;
//import frc.robot.Constants.Intakeconstants;
import frc.robot.subsystems.Intake;

public class Shooterball extends Command {
  /** Creates a new Shooterball. */
 // Intake intake;
  public Shooterball(Intake i) {
   // intake = i;
    //addRequirements(intake);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //intake.Shooter(Intakeconstants.shooterspeed);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //intake.Shooter(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
