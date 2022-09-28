public class CafeJava {

    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly...";
        String readyMessage = ", your order is ready!";
        String displayTotalMessage = ", your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 6.2;
        double lattePrice = 3.4;
        double cappuccinoPrice = 5.0;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;


        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + "!"); // Displays "Welcome to Cafe Java, Cindhuri!"
        // ** Your customer interaction print statements will go here ** //

        //cindhuri
        if (isReadyOrder1){
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        //Noah
        if (isReadyOrder4){
            System.out.println(customer4 + readyMessage);
            System.out.println(customer4 + displayTotalMessage + String.format("%.2f", cappuccinoPrice)+ ".");
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        //Sam
        System.out.println(customer2 + displayTotalMessage + String.format("%.2f", 2 * lattePrice) + ".");
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        //Jimmy
        double newTotal = lattePrice - dripPrice;
        if (newTotal > 0) {
            System.out.println(customer3 + displayTotalMessage + String.format("%.2f", newTotal) + ".");
        } else {
            System.out.println("Sorry, " + customer3 + ", we owe you $" + String.format("%.2f", Math.abs(newTotal)) + "!");
        }
    }


}
