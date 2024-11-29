import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_details")  // Specifies the table name in the database
public class UserDetails {

    @PrimaryKey(autoGenerate = true)  // Marks 'id' as the primary key and it will auto-generate values
    private int id;

    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private int age;

    // Constructors
    public UserDetails(String name, int age, String dob, String address) {
        // Default constructor
    }

    public UserDetails(String username, String email, String password, String phoneNumber, int age) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Additional methods for debugging and convenience
    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
