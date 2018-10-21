package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="omniWheelCode", group="Iterative Opmode")
public class omniWheelCode extends OpMode {

    public DcMotor motorFrontRight = null;
    public DcMotor motorFrontLeft = null;
    public DcMotor motorBackRight = null;
    public DcMotor motorBackLeft = null;


    public void drivetrain(){
        double leftYaxis = gamepad1.left_stick_y;
        telemetry.addData("Left Y",leftYaxis);

        double leftXaxis = gamepad1.left_stick_x;
        telemetry.addData("Left X",leftXaxis);


        double rightYaxis = gamepad1.right_stick_y;
        telemetry.addData("right Y",rightYaxis);

        double rightXaxis = gamepad1.right_stick_x;
        telemetry.addData("right X",rightXaxis);


        motorFrontLeft.setPower(leftYaxis);
        motorFrontRight.setPower(leftXaxis*-1);
        motorBackLeft.setPower(rightXaxis);
        motorBackRight.setPower(rightYaxis*-1);

    }


    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        motorFrontRight = hardwareMap.get(DcMotor.class, "motorFrontRight");
        motorFrontLeft = hardwareMap.get(DcMotor.class,"motorFrontLeft");
        motorBackRight = hardwareMap.get(DcMotor.class,"motorBackRight");
        motorBackLeft = hardwareMap.get(DcMotor.class,"motorBackLeft");

        telemetry.addData("Status", "Initialized");
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start(){

    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        //Control Drivetrain
        drivetrain();
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {

    }
}

