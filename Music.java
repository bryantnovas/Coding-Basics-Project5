public class Music extends ServiceCommunicator{
    public Music(String song) {
        super(String.format("https://itunes.apple.com/search?term=%s&limit=1", song));
    }

    @Override
    public String get() {
        return super.get();
    }
}
