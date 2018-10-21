package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="AutonomousMode2018", group="Iterative Opmode")
public class AutonomousMode2018 extends OpMode {

    public DcMotor lifter = null;

    double liftTime = 1.5;

    public void drivetrain(){
        double leftYaxis = gamepad1.left_stick_y;
        telemetry.addData("Left Y",leftYaxis);

        double leftXaxis = gamepad1.left_stick_x;
        telemetry.addData("Left X",leftXaxis);


        double rightYaxis = gamepad1.right_stick_y;
        telemetry.addData("right Y",rightYaxis);

        double rightXaxis = gamepad1.right_stick_x;
        telemetry.addData("right X",rightXaxis);



    }


    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        lifter = hardwareMap.get(DcMotor.class, "lifter");


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
        lifter.setPower(0);

        ElapsedTime eTime  = new ElapsedTime();

        eTime.reset();
        //is eTime counting?? check this

       while(eTime.time()<liftTime)
        {

            lifter.setPower(-.3);
        }
        lifter.setPower(0);







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