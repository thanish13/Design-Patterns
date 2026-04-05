package org.t13.app.state;

public class Player {

    private State state;

    public Player(State state) {
        this.state = state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public  State getState() {
        return state;
    }

    public void runState() {
        state.run();
    }

}
