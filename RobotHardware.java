package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotHardware {

    HardwareMap hwMap;

    public DcMotor forLeft = null;
    public DcMotor forRight = null;
    public DcMotor backRight = null;
    public DcMotor backLeft = null;

    public void Init(HardwareMap ahwMap){
        hwMap = ahwMap;

        forLeft = hwMap.get(DcMotor.class, "forLeft");
        forRight = hwMap.get(DcMotor.class, "forRight");
        backRight = hwMap.get(DcMotor.class, "backRight");
        backLeft = hwMap.get(DcMotor.class, "backLeft");

        forLeft.setDirection(DcMotor.Direction.REVERSE);
        forRight.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.REVERSE);

        forLeft.setPower(0);
        forRight.setPower(0);
        backRight.setPower(0);
        backLeft.setPower(0);

        forLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        forRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

}
