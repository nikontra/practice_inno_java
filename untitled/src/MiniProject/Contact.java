package MiniProject;

public class Contact {
    private String name;
    private String value;

    public Contact(String name, String value) {
        this.name = name;
        this.value = value;
    }
    public Contact() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
