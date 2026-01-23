import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestLocale {
    public static void main(String[] args) {
        System.out.println("Default locale: " + Locale.getDefault());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 ahh:mm:ss", Locale.getDefault());
        System.out.println("Formatted date: " + sdf.format(new Date()));
        
        Locale.setDefault(Locale.ENGLISH);
        System.out.println("After setting to ENGLISH: " + Locale.getDefault());
        sdf = new SimpleDateFormat("yyyy年MM月dd日 ahh:mm:ss", Locale.getDefault());
        System.out.println("Formatted date: " + sdf.format(new Date()));
    }
}
