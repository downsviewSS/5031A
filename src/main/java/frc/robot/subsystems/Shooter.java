// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.subsystems;

// import com.revrobotics.CANSparkMax;
// import com.revrobotics.CANSparkMaxLowLevel.MotorType;
// import frc.robot.Constants.Intakeconstants;

// import edu.wpi.first.wpilibj2.command.SubsystemBase;

// public class Shooter extends SubsystemBase {
  
//   /** Creates  va new Shooter. */
//   private final CANSparkMax frontintakeCanSparkMax;
//   private final CANSparkMax backintakeCanSparkKMax;

//   public Shooter() {
//   frontintakeCanSparkMax = new CANSparkMax(Intakeconstants.intakeCanSparkMax, MotorType.kBrushed);
//   backintakeCanSparkKMax = new CANSparkMax(Intakeconstants.intake2CanSparkMax, MotorType.kBrushed);
// }
  
//   public void periodic() {
//     // This method will be called once per scheduler run
//   }
//   public void shootball(double speed){
//     frontintakeCanSparkMax.set(speed);
//     backintakeCanSparkKMax.set(speed);
//   }
//   public void stop(){
//     frontintakeCanSparkMax.set(0);
//     backintakeCanSparkKMax.set(0);

//   }
// }
