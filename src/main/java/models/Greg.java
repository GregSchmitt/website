package models;

import javax.persistence.*;


@Entity
@Table(name = "greg")
public class Greg {

    //FIELDS with ANNOTATIONS to create db tables---->---->---->---->---->---->
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String email;

    //CONSTRUCTOR---->---->---->---->---->---->---->---->---->---->---->---->
    private Greg(long id, String first_name, String last_name, String email) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    //GETTERS & SETTERS---->---->---->---->---->---->---->---->---->---->---->
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
