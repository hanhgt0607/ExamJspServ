package exam.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.Calendar;

@Entity
public class employee {
    @Id
    private long id;

    public long getId() {
        return id;
    }

    public employee() {
        this.id = Calendar.getInstance().getTimeInMillis();
    }

    public void setId(long id) {
        this.id = id;
    }

    private String fullName;
    private String birthday;
    private String address;
    private String position;
    private String department;



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
