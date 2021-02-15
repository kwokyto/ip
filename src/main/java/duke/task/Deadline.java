package duke.task;

public class Deadline extends Task {
    
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        return "[DL]" + super.toString() + " (by: " + by + ")";
    }

    public String getBy() {
        return by;
    }
}