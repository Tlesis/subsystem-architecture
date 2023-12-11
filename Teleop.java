package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.lib.Subsystems.TelemetryMode;
import org.firstinspires.ftc.teamcode.subsystems.DriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.IntakeSubsystem;

@TeleOp
public class Teleop extends OpMode {
    private Subsystems subsystems = new Subsystems();

    private DriveSubsystem drive = new DriveSubsystem(TelemetryMode.PRINT);
    private IntakeSubsystem intake = new IntakeSubsystem(TelemetryMode.SILENT);

    @Override
    public void init() {
        subsystems.add(drive);
        subsystems.add(intake);

        subsystems.init(hardwareMap);
    }

    @Override
    public void loop() {
        subsystems.run(gamepad1, gamepad2);
        subsystems.telemetry(telemetry);
    }
}
