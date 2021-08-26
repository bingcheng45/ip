package duke.task;

import duke.CommandList;

import java.time.LocalDate;

/**
 * duke.task.Task contains information about a task.
 */
public abstract class Task {
    private String value = null;
    private boolean done = false;
    private LocalDate time = null;
    public Task(String value){
        this.value = value;
        this.done = false;
    }

    public abstract LocalDate getTime();

    public abstract CommandList getType();

    public boolean isDone() {
        return done;
    }

    /**
     * Getting the information of the task.
     * @return Information of the task.
     */
    public String getValue() {
        return value;
    }

    /**
     * Mark task as done.
     */
    public void markDone() {
        this.done = true;
    }

    /**
     * Mark task as undone.
     */
    public void markUnDone() {
        this.done = false;
    }

    /**
     * Get the status icon for this task.
     * @return A string representing the state of the task.
     */
    public String getStatusIcon() {
        return this.done ? "X" : " ";
    }

    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + value;
    }

}