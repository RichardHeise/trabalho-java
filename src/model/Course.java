import java.util.Vector;

import javax.security.auth.Subject;

public class Course {

    private String code;
    private String name;
    private Vector<Subject> subjects;

    public Course(String code, String name, Vector<Subject> subjects) {
        this.code = code;
        this.name = name;
        this.subjects = subjects;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Subject> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(Vector<Subject> subjects) {
        this.subjects = subjects;
    }

}