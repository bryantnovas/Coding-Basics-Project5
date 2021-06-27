public class Television extends ServiceCommunicator {
    public Television(String show) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + show);
    }

    @Override
    public String get() {
        return super.get();
    }
}
