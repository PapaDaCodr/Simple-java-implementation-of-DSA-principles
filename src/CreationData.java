import java.util.List;

public class CreationData {
    private String verse;
    private String description;
    private List<String> visualElements;

    public CreationData(String verse, String description, List<String> visualElements) {
        this.verse = verse;
        this.description = description;
        this.visualElements = visualElements;
    }

    public String getVerse() {
        return verse;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getVisualElements() {
        return visualElements;
    }
}