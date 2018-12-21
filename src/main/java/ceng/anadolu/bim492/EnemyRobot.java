package ceng.anadolu.bim492;

import java.util.Random;

public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy 'robot' gives " + attackDamage + " damages by using its hands");

    }

    public void walkForward() {

        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy 'robot' is walking forward to us " + movement + " spaces");

    }

    public void reactToHuman(String driverName) {

        System.out.println("Enemy 'robot' saw the " + driverName);

    }

}
