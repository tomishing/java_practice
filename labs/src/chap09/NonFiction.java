package chap09;

public class NonFiction extends Book{


    public NonFiction(String title) {
        super(title);
        setPrice(); // Call setPrice() to initialize the price
    }

    @Override
    public void setPrice() {
        this.price = 37.99;
    }
}
