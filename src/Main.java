import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        System.out.println("Time in millis:");

        int count = 1;
        while (count <= 5) {
            System.out.println(Calendar.getInstance().getTimeInMillis());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
        }

        System.out.println("Goodbye!");
    }
}
