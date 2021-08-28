package pattern.command.command;

public class MusicPlayerCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.playMusic();
    }
}
