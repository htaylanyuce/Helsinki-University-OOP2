package farmsimulator;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
BulkTank tank = new BulkTank();
Farm tila = new Farm("pekka", new Barn( tank ));
tila.installMilkingRobot( new MilkingRobot() );
tila.addCow( new Cow("Lehmä 1") );
tila.addCow( new Cow("Lehmä 2") );
tila.addCow( new Cow("Lehmä 3") );
tila.addCow( new Cow("Lehmä 4") );
tila.addCow( new Cow("Lehmä 5") );
tila.liveHour();
tila.manageCows();
tank.getVolume();
        System.out.println(tila);

    }
}
