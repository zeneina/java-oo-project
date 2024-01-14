package HomeWork.chapter11.Model;
public class User {
    private Long id;
    private String firstname;
    private String lastname;

    public User() {
        this.id = null;
        this.firstname = null;
        this.lastname = null;
    }

    public User(Long id, String firstname, String lastname) {
        // initialize the fields with the given parameters
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // declare the getters and setters for all the fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}