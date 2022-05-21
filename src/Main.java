import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        SimpleFileReader reader = new SimpleFileReader();

//        System.out.println("Hello\nWorld!");

        String content = reader.readFileContentsOrNull("resources/m.202101.csv");
        String[] lines = content.split("\n"); // [строка1, строка2, ...]
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            String[] parts = line.split(",");
            String itemName = parts[0];
            boolean isExpense = Boolean.parseBoolean(parts[1]); // "true" -> true
            int quantity = Integer.parseInt(parts[2]);
            int sumOfOne = Integer.parseInt(parts[3]);

            MonthlyReportRecord record = new MonthlyReportRecord(itemName, isExpense, quantity, sumOfOne);
            monthlyRecord.add(record);
        }
    }

}

