package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name = "TeleOpSlide", group = "11846")
public class TeleOpSlide extends OpMode {

    Robot robot = new Robot();

    @Override
    public void init(){ robot.InitHardware(hardwareMap); }

    @Override
    public void loop(){

        robot.Slide(-gamepad1.left_stick_x);

        if(gamepad1.x){
            robot.DriveButton(1);
        }else if(gamepad1.y){
            robot.DriveButton(3);
        }else if(gamepad1.b){
            robot.DriveButton(2);
        }else if(gamepad1.a){
            robot.DriveButton(4);
        }

        robot.DriveLeft(-gamepad1.left_stick_y);
        robot.DriveRight(-gamepad1.right_stick_y);

    }

}
