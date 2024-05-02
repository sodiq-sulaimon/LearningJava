public interface Groomable {
    public void groom();

    /* default method. Applies to classes implementing the interface automatically without recompiling them.
    Can be overridden. Interface methods are public unless otherwise stated*/
    default void pay() {
        System.out.println("Are you paying with card or Apple pay?");
    }

    /* static interface method. requires interface name to be called by classes
    implementing the interface (e.g Groomable.calculateTip()). Cannot be overridden. */
    static String calculateTip(double price, double percentage) {
        double rawTip = price * (percentage / 100);
        return String.format("$%,.2f", rawTip);
    }
}