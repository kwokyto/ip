package duke.task;

public class Event extends Task {
    
    protected String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[EV]" + super.toString() + " (at: " + at + ")";
    }

    public String getAt() {
        return at;
    }
}