import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var listBill = new ArrayList<Bill>();
        var choice = 0;
        do {
            System.out.println("1: Add Bill");
            System.out.println("2: Display");
            System.out.println("3: Pay Bill Electricity");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    var addBill = ceartBill(input);
                    listBill.add(addBill);
                    System.out.println("=/=/=/=/=/=/=/=/");
                    System.out.println("Them Thanh Cong =");
                    System.out.println("=/=/=/=/=/=/=/=/");
                    break;
                case 2:
                    if (listBill.size() > 0) {
                        showBill(listBill);
                    } else {
                        System.out.println("Danh Sach Rong");
                    }
                    break;
                case 3:
                    if (listBill.size() > 0) {
                        System.out.println("Enter Meter Number");
                        var meterNumber = input.nextLine();
                        getBill(listBill, meterNumber);
                    }else {
                        System.out.println("Danh Sach Rong");
                    }
            }
        } while (choice != 0);
    }

    private static void getBill(ArrayList<Bill> listBill, String meterNumber) {
        for (var index : listBill) {
            if (index.getCustomer().getMeterNumber().equals(meterNumber)) {
                index.electricityBill();
            }
        }
    }

    private static void showBill(ArrayList<Bill> listBill) {
        System.out.printf("%-13s%-13s%-13s%-13s%-13s\n", "Chủ Hộ", "Số Nhà", "Mã Công Tơ", "Số Mới", "Số Cũ");
        for (Bill index : listBill) {
            System.out.printf("%-13s%-13s%-13s%-13s%-13s\n",
                    index.getCustomer().getFullName(), index.getCustomer().getApartmentNumber(),
                    index.getCustomer().getMeterNumber(),
                    index.getNewNumber(), index.getOldNumber());
        }
    }

    private static Bill ceartBill(Scanner input) {
        System.out.println("Enter Name");
        var name = input.nextLine();
        System.out.println("Enter apartment Number");
        var apartment = input.nextLine();
        System.out.println("Enter meter Number");
        var mater = input.nextLine();
        System.out.println("Enter new Number");
        var newNumber = Float.parseFloat(input.nextLine());
        System.out.println("Enter old Number");
        var oldNumber = Float.parseFloat(input.nextLine());
        Customer customer = new Customer(name, apartment, mater);
        return new Bill(newNumber, oldNumber, customer);
    }
}
