import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Task {
    private String task;
    private boolean isDone;
    public Task(String task, boolean isDone) {
        this.task = task;
        this.isDone = isDone;
    }

    public String getDisplayDateTime(LocalDateTime dateTime) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm");
        return dateTime.format(format);
    }

    public String getSaveDateTime(LocalDateTime dateTime) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HHmm");
        return dateTime.format(format);
    }
    public String getDoneIcon() {
        return isDone ? "X" : " ";
    }
    public void setDone() {
        this.isDone = true;
    }

    public void setUndone() {
        this.isDone = false;
    }

    public String toSaveFormat() {
        return String.format("%s|%s", getDoneIcon(), task);
    }

    @Override
    public String toString() {
        return String.format("[%s]%s", getDoneIcon(), task);
    }
}
