public class Tomato implements Vegetable{
double priceKg=4.50;
double alinanKg;


    @Override
    public void vegetableName() {
        System.out.println("pomidor");
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
