package pattern.facade;

import pattern.facade.n1Before.LivingRoom;
import pattern.facade.n3Facade.BadRoom;

public class FacadeMain {

    public static void main() {
        LivingRoom livingRoom = new LivingRoom();
        livingRoom.pressButton("5", "22");

        BadRoom badRoom = new BadRoom();
        badRoom.pressButton("10", "15");
    }
}
