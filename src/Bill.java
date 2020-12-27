public class Bill {
    private int newNumber;
    private int oldNumber;
    private Customer customer;
    private final int ELECTRICITY_PRICE = 750;

    public Bill() {
    }

    public Bill(int newNumber, int oldNumber, Customer customer) {
        this.newNumber = newNumber;
        this.oldNumber = oldNumber;
        this.customer = customer;
    }

    public float getNewNumber() {
        return newNumber;
    }

    public float getOldNumber() {
        return oldNumber;
    }

    public Customer getCustomer() {
        return customer;
    }


    public void electricityBill() {
        var result = (oldNumber - newNumber) * ELECTRICITY_PRICE;
        System.out.println("Total Amount You Pay: " + result + "VND");
    }
}
