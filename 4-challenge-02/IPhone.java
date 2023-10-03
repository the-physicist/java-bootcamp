// Interface for Music Player
public interface MusicPlayer {
    void play();
    void pause();
    void selectSong(String song);
}

// Interface for Phone
public interface Phone {
    void call(String number);
    void answer();
    void startVoiceMail();
}

// Interface for Internet Browser
public interface InternetBrowser {
    void displayPage(String url);
    void addNewTab(String url);
    void refreshPage();
}

// Class for iPhone
public class IPhone implements MusicPlayer, Phone, InternetBrowser {
    // Music Player
    @Override
    public void play() {}

    @Override
    public void pause() {}

    @Override
    public void selectSong(String song) {}

    // Phone
    @Override
    public void call(String number) {}

    @Override
    public void answer() {}

    @Override
    public void startVoiceMail() {}

    // Internet Browser
    @Override
    public void displayPage(String url) {}

    @Override
    public void addNewTab(String url) {}

    @Override
    public void refreshPage() {}
}
