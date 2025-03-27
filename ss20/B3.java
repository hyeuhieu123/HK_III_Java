package ss20;

import java.util.List;
import java.util.Optional;

class User {
        private String name;
        private Optional<String> phoneNumber;

     public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = Optional.ofNullable(phoneNumber);
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", phoneNumber=" + phoneNumber.orElse("ko co") + "]";
    }

  
    
}


public class B3 {
    public static void main(String[] args) {
            Optional<String>  demo = Optional.of(null);
            demo.get();
        
            List<User> users = List.of(

            new User("Quý", "0987654321"),

            new User("Lan", null),

            new User("Minh", "0933222111"),

            new User("Huyền", null)

        );
        users.stream().forEach(e->System.out.println(e));
    }
}
