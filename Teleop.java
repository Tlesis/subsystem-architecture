package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.lib.Subsystems.TelemetryMode;
import org.firstinspires.ftc.teamcode.subsystems.ExampleSubsystem;

@TeleOp
public class Teleop extends OpMode {
    private Subsystems subsystems = new Subsystems();

    // TODO: instantiate subsystems here
    private ExampleSubsystem example = new ExampleSubsystem(TelemetryMode.SILENT);

    @Override
    public void init() {
        // TODO: add subsystems here
        subsystems.add(example);

        subsystems.init(hardwareMap);
    }

    @Override
    public void loop() {
        subsystems.run(gamepad1, gamepad2);
        subsystems.telemetry(telemetry);
    }
}
