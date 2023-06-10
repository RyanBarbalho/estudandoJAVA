package entities;

public class Comment {
    private String text;

    public Comment() {
    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String comment) {
        this.text = comment;
    }

    @Override
    public String toString() {
        return "text=" + getText();
    }

}
