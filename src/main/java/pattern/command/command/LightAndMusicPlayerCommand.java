package pattern.command.command;

public class LightAndMusicPlayerCommand implements Command {
    private Light light;
    private MusicPlayer musicPlayer;

    public LightAndMusicPlayerCommand(Light light, MusicPlayer musicPlayer) {
        this.light = light;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        light.swicthLight();
        musicPlayer.playMusic();
    }
}
