package creational.builder;

public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder("John", "Doe")
                .age(35)
                .email("john@example.com")
                .phone("123456789")
                .build();

        System.out.println(user.getDetails());
    }
}
