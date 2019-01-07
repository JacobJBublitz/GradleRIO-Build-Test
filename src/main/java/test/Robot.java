package test;

import edu.wpi.first.wpilibj.TimedRobot;
import lib.MessageProvider;

public class Robot extends TimedRobot {
    @Override
    public void teleopInit() {
        System.out.println("Hello there!");

        MessageProvider provider = new MessageProvider();
        System.out.println(provider.getMessage());
    }
}
