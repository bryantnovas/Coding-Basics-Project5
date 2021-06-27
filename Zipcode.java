public class Zipcode extends ServiceCommunicator{
    public Zipcode(int zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);
    }

    @Override
    public String get() {
        return super.get();
    }

}
