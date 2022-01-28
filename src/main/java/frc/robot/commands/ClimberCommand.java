// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.LogitechController;
import frc.robot.Constants.DriverControllerConstants;
import frc.robot.subsystems.Climber;

public class ClimberCommand extends CommandBase {
  private LogitechController m_controller;
  private Climber m_climber;
  /** Creates a new ClimberCommand. */
  public ClimberCommand(Climber climber, LogitechController controller) {
    super();
    addRequirements(climber);
    m_controller= controller;
    m_climber = climber;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_climber.extendLeft(MathUtil.applyDeadband(m_controller.getLeftY(), DriverControllerConstants.DEADBAND_VALUE));
    m_climber.extendRight(MathUtil.applyDeadband(m_controller.getRightY(), DriverControllerConstants.DEADBAND_VALUE));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
