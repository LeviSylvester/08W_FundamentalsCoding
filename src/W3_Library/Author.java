package W3_Library;

public class Author {
    private String name;
    private String email;
    private String gender;
    private String tel;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getTel() {
        return tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    Author() {
    }

    Author(String name, String email, String gender, String tel) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.tel = tel;
    }

    @Override
    public String toString() {
        String myAuthor = name + " (" + email + ", " + gender + ", " + tel + ")";
//        return name + " (" + email + ", " + gender + ", " + tel + ")";
//        return name;
        return myAuthor;
    }
}