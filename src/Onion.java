public class Onion implements Vegetable{


    double priceKg=2.50;
    double alinanKg;


    @Override
    public void vegetableName() {
        System.out.println("sogan");
    }

    @Override
    public void receivedKg(double alinanKg) {
        this.alinanKg=alinanKg;
    }

    @Override
    public double price() {
        return priceKg*alinanKg;
    }
}
