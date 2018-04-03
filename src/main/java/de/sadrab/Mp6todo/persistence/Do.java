package de.sadrab.Mp6todo.persistence;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Do {

    @Id
    private String id;

    private String task;

    private Boolean done;

    public Do() {
    }

    public Do(String task, Boolean done) {
        this.task = task;
        this.done = done;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Do[" +
                "Id:'" + id + '\'' +
                ", task:'" + task + '\'' +
                ", is done:" + done +
                ']';
    }
}
