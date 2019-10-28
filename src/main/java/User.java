import java.util.Date;

/**
 * @author Ehtiram Etibarovich Abdullayev on 27.10.2019
 * @project painting
 */
public class User extends BasicUser {
    private String email;
    private Date birth_date;
    private BasicUser addedBy;
    private BasicUser updatedBy;
    private Date addedTime;
    private Date updatedTime;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public BasicUser getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(BasicUser addedBy) {
        this.addedBy = addedBy;
    }

    public BasicUser getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(BasicUser updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

}
