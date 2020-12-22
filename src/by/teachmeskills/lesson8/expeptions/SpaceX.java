package by.teachmeskills.lesson8.expeptions;

import java.util.Random;

/**
 * @author Dzmitry Fursevich
 */
public class SpaceX implements IStart {
    @Override
    public void checkSystem() {
        Random r = new Random();
        if (r.nextInt(100) == 50) {
            throw new RuntimeException("System check failure");
        }
    }
}
