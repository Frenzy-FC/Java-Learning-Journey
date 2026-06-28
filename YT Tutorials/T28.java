public class T28 {
    public static void main(String[] args){
        // Overloaded Constructors: Logic & Functions

        User user = new User();
        User user1 = new User("Frenz123");
        User user2 = new User("Frenz123", "Frenz@gmail.com");
        User user3 = new User("Frenz123", "Frenz@gmail.com", "123");

        System.out.println(user.username);
        System.out.println(user.email);
        System.out.println(user.password);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.password);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.password);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.password);
    }
}
