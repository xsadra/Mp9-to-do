package de.sadrab.Mp6todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Do {

    @Id
    private String Id;

    private String task;

    private Boolean done;

    public Do() {
    }

    public Do(String task) {
        this.task = task;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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
                "Id:'" + Id + '\'' +
                ", task:'" + task + '\'' +
                ", is done:" + done +
                ']';
    }
}
