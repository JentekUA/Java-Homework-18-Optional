package app;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        var repository = new UserRepository();
        Consumer<User> ifPresent = System.out::println;
        Runnable notFound = () -> System.out.println("User was not found.");

        //By id
        repository.findUserById(1).ifPresentOrElse(ifPresent, notFound);
        repository.findUserById(11).ifPresentOrElse(ifPresent, notFound);

        //By email
        repository.findUserByEmail("bfussell3@slate.com").ifPresentOrElse(ifPresent, notFound);
        repository.findUserByEmail("test@test.com").ifPresentOrElse(ifPresent, notFound);

        //Add users
        repository.findAllUsers()
                .ifPresentOrElse(users -> System.out.println("Found " + users.size() + " users"),
                        () -> System.out.println("No users found."));
    }
}