package Dates.App;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class CDateFormatter {

    public static void main(String[] args) {

        LocalDateTime localDateTime  = LocalDateTime.now();
        Calendar calendar = Calendar.getInstance();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = localDateTime.format(dateTimeFormatter);
        JOptionPane.showMessageDialog(null, "" + calendar.getTime());
    }
}