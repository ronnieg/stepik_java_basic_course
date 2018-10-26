//package Objects_Classes_Packages.task01;
//
//public class Main {
//
//    private static void moveRobot(Robot robot, int toX, int toY) {
//
//        int tX = robot.getX();
//        int tY = robot.getY();
//
//        System.out.println("Начальная позиция " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
//
//
//        if (tX >= toX) {
//            while (robot.getDirection() != Direction.LEFT) {
//                robot.turnLeft();
//            }
//            while (tX != toX) {
//                robot.stepForward();
//                System.out.println("tX >= toX " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
//                tX--;
//            }
//        } else {
//            while (robot.getDirection() != Direction.RIGHT) {
//                robot.turnRight();
//            }
//            while (tX != toX) {
//                robot.stepForward();
//                System.out.println("tX <= toX " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
//                tX++;
//            }
//        }
//
//        if (tY >= toY) {
//            while (robot.getDirection() != Direction.DOWN) {
//                robot.turnLeft();
//            }
//            while (tY != toY) {
//                robot.stepForward();
//                System.out.println("tY >= toY " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
//                tY--;
//            }
//
//        } else {
//            while (robot.getDirection() != Direction.UP) {
//                robot.turnRight();
//            }
//            while (tY != toY) {
//                robot.stepForward();
//                System.out.println("tY <= toY " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
//                tY++;
//            }
//
//        }
//    }
//
//
//}
