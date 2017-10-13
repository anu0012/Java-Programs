import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Main {
  public static void main(String args[]) throws Throwable {
    InputStream in = Main.class.getResourceAsStream(args[0]);
    AudioStream as = new AudioStream(in);
    AudioPlayer.player.start(as);
    Thread.sleep(5000);
  }
}