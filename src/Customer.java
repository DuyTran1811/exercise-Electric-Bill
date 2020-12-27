public class Customer {
    private String fullName;
    private String apartmentNumber;
    private String meterNumber;

    public Customer() {
    }

    public Customer(String fullName, String apartmentNumber, String meterNumber) {
        this.fullName = fullName;
        this.apartmentNumber = apartmentNumber;
        this.meterNumber = meterNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getMeterNumber() {
        return meterNumber;
    }
}
