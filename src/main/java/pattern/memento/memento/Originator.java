package pattern.memento.memento;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Originator.Momento saveState() {
        return new Momento(this.state);
    }

    public void restoreFromMomento(Momento momento) {
        this.state = momento.state;
    }

    public static class Momento {

        private String state;

        public Momento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
