package pattern.facade.n3Facade;

public class BadRoom {

    private RoomFacade roomFacade = new RoomFacade();

    public void pressButton(String channel, String temperature) {
        roomFacade.pressButton(channel, temperature);
    }
}
