package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.lib.Subsystem;

public class ExampleSubsystem extends Subsystem {
    private DcMotor exampleMotor;

    public ExampleSubsystem(TelemetryMode mode) { super(mode); }

    @Override
    public void init(HardwareMap hardwareMap) {
        exampleMotor = hardwareMap.get(DcMotor.class, "exampleMotor");
    }

    @Override
    public void run(Gamepad driver, Gamepad manipulator) {
        double power = driver.left_stick_y;

        exampleMotor.setPower(power);
    }

    @Override
    public void telemetry(Telemetry telemetry) {
        telemetry.addData("Example Motor Power", exampleMotor.getPower());
    }
}
