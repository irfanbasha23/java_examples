package designpatterns.structural;

interface MediaPlayer {
    public void play(String format,String file);
}

class LegacyMediaPlayer implements MediaPlayer {
    @Override
    public void play(String format, String file) {
        System.out.println("format and file"+format+","+file);
    }
}

interface AdvancedMediaPlayer {
    public void playVlc(String file);
}

class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String file) {
        System.out.println("start playing");
    }
}

public class AdapterPattern implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public AdapterPattern(String type) {
        if("vlc".equalsIgnoreCase(type)) {
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String format, String file) {
        if("vlc".equalsIgnoreCase(format)) {
            advancedMediaPlayer.playVlc(file);
        }
    }
}
