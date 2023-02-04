package user;

public interface FunctionsOfUser {

    static void showInfo(User user) {
        System.out.println("Name: " + user.getName()
                + "\nLastname: " + user.getLastName()
                + "\nBalance: " + user.getBalance()
                + "\nCustomerID: " + User.customerID);
    }
}
