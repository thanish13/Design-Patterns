package org.t13.app.state;

public class Main {

    static void main() {

        Player player = new Player(new PlayState());

        player.runState();

        player.changeState(new PauseState());

        player.runState();
    }
}
