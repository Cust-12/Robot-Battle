public class RobotCreator {
    public Robot makeRobot(int random){
        switch(random){
            case 0:
                return new DoubleBlades();
            case 1:
                return new MumbyBot();
            case 2:
                return new CharmSniper();
            default:
                return new KhanWarrior();
        }
    }
}