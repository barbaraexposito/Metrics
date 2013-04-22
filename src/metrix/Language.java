package metrix;

public class Language {

    public static final Language JAVA = new Language("java");
    private String name;

    public Language(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
