import java.util.List;

public class CreationDay {
    private String verse;
    private final String description;
    private List<String> visualElements;

    public CreationDay(String verse, String description, List<String> visualElements) {
        this.verse = verse;
        this.description = description;
        this.visualElements = visualElements;
    }

    public void displayDay() {
        System.out.println(verse);
        System.out.println(description);
        for (String element : visualElements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}