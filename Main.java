import java.util.Optional;

interface UserService {
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }
    
    Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService {
    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }
    
    public String getWelcomeMessage(String name) {
        Optional<String> userName = getUser(name);
        return userName.map(s -> "Welcome, " + s + "!").orElseGet(this::getWelcomeMessage);
    }
}

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        
        // Test cases
        System.out.println(userService.getWelcomeMessage(null));    // Output: Welcome, Guest!
        System.out.println(userService.getWelcomeMessage("John"));  // Output: Welcome, John!
    }
}
