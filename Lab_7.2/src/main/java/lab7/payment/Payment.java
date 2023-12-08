package lab7.payment;

public interface Payment {
    void setPrice(double price);
    boolean getIsFullyPayed();
    void pay(double price);
}
