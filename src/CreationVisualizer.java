import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CreationVisualizer {
    private static Map<Integer, CreationDay> creationDays = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeCreationDays();
        promptUser();
    }

    private static void initializeCreationDays() {
        try {
            Gson gson = new Gson();
            List<CreationData> creationDataList = gson.fromJson(new FileReader("src/creation_data.json"), new TypeToken<List<CreationData>>() {}.getType());
            int dayNumber = 1;
            for (CreationData creationData : creationDataList) {
                creationDays.put(dayNumber, new CreationDay(creationData.getVerse(), creationData.getDescription(), creationData.getVisualElements()));
                dayNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void promptUser() {

        System.out.print("Enter the day number (1-7) to see the Creation account for that day: ");
        int dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            CreationDay day = creationDays.get(dayNumber);
            if (day != null) {
                day.displayDay();
            } else {
                System.out.println("Invalid day number.");
            }
        } else {
            System.out.println("Invalid day number.");
        }
    }
}