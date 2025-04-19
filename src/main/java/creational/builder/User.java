package creational.builder;

/**
 * Patrón Builder
 * Propósito: Facilitar la creación de objetos complejos, proporcionando un enfoque paso a paso para configurar sus propiedades.
 */
public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public String getDetails() {
        return firstName + " " + lastName + ", " + age + " años, Email: " + email + ", Teléfono: " + phone;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String phone;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
