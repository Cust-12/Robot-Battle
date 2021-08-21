public class Interface {
    public static void main(String[] args){
        RobotCreator robotCreation=new RobotCreator();
        for(int i=0;i<1;i++) {
            Robot firstRobot = robotCreation.makeRobot((int) (Math.random() * 4));
            Robot secondRobot = robotCreation.makeRobot((int) (Math.random() * 4));
            firstRobot.attack(secondRobot);
            secondRobot.attack(firstRobot);
        }
    }
}
