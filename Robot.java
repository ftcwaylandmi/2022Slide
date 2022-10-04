package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {

    RobotHardware robotHardware = new RobotHardware();

    public void InitHardware(HardwareMap ahw){
        robotHardware.Init(ahw);
    }

    public void Slide(double p){
        robotHardware.forLeft.setPower(-p);
        robotHardware.forRight.setPower(p);
        robotHardware.backRight.setPower(-p);
        robotHardware.backLeft.setPower(p);
    }

    public void DriveButton(int type){
        int p = 1;
        if(type == 1){ // Left
            robotHardware.forLeft.setPower(-p);
            robotHardware.forRight.setPower(p);
            robotHardware.backRight.setPower(-p);
            robotHardware.backLeft.setPower(p);
        }else if(type == 2){ // Right
            robotHardware.forLeft.setPower(p);
            robotHardware.forRight.setPower(-p);
            robotHardware.backRight.setPower(p);
            robotHardware.backLeft.setPower(-p);
        }else if(type == 3){ // Forward
            robotHardware.forLeft.setPower(p);
            robotHardware.forRight.setPower(p);
            robotHardware.backRight.setPower(p);
            robotHardware.backLeft.setPower(p);
        }else if(type == 4){ // Reverse
            robotHardware.forLeft.setPower(-p);
            robotHardware.forRight.setPower(-p);
            robotHardware.backRight.setPower(-p);
            robotHardware.backLeft.setPower(-p);
        }
    }

    public void DriveLeft(double p){
        robotHardware.forLeft.setPower(p);
        robotHardware.backLeft.setPower(p);
    }

    public void DriveRight(double p){
        robotHardware.forRight.setPower(p);
        robotHardware.backRight.setPower(p);
    }

}
