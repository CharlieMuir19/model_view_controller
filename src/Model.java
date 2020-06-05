//The Model receives commands and data from the Controller.
// It stores these data and updates the View.
// The View lets to present data provided by the Model to the user.
// The Controller accepts inputs from the user and converts it to commands for the Model or the View.

public class Model {
    private String firstname;
    private String lastname;
    public Model(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
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