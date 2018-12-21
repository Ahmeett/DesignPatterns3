package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {
        EnemyTank tank = new EnemyTank();

        EnemyRobot robot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);

        //This is what does enemy robot do
        System.out.println("*** *** **** This is what enemy robot does **** *** ***");
        System.out.println("");
        
        robot.reactToHuman("Ahmet");
        robot.walkForward();
        robot.smashWithHands();
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");

        //This is what does tank do
        System.out.println("*** *** **** This is what enemy tank does **** *** ***");
        System.out.println("");
        
        tank.assignDriver("Mehmet");
        tank.driveForward();
        tank.fireWeapon();
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");

        //This is what robot do after using adapter
        System.out.println("*** *** **** This is what enemy robot does after using adapter **** *** ***");
        System.out.println("");
        
        robotAdapter.assignDriver("Ali");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
        
        System.out.println("------------------------------------------------------------------------------");

    }
}
