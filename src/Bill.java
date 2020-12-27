public class Bill {
    private float newNumber;
    private float oldNumber;
    private Customer customer;

    public Bill() {
    }

    public Bill(float newNumber, float oldNumber, Customer customer) {
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
        float ELECTRICITY_PRICE = 750;
        var result = (getNewNumber() - getOldNumber()) * ELECTRICITY_PRICE;
        System.out.println("Total Amount You Pay: " + result);
    }
}
