public class Wiki extends ServiceCommunicator {
    public Wiki(String search) {
        super(String.format("https://en.wikipedia.org/w/api.php?action=query&list=search&srsearch=%s&format=json", search));
    }

    @Override
    public String get() {
        return super.get();
    }
}
