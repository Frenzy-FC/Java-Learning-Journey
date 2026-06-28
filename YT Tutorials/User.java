public class User {
    String username;
    String email;
    String password;

    User(){
        this.username = "Gay";
        this.email = "Not Provided";
        this.password = "Not Provided";
    }
    User(String username){
        this.username = username;
        this.email = "Not Provided";
        this.password = "Not Provided";
    }
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.password = "Not Provided";
    }
    User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
