import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        while (true) {
            Date date = new Date();
            System.out.print("\r" + formatter.format(date));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Clock stopped.");
            }
        }
    }
}
