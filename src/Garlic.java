public class Garlic implements Vegetable {
    double priceKg=3.50;
    double alinanKg;


    @Override
    public void vegetableName() {
        System.out.println("sarimsaq");
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
