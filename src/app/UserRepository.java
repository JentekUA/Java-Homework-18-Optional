package app;

import java.util.List;
import java.util.Optional;

public class UserRepository {
    private final List<User> users = List.of(
            new User(1, "Abbot Claris", "aclaris0@arstechnica.com"),
            new User(2, "Edsel Semiras", "esemiras1@wufoo.com"),
            new User(3, "Milt Bust", "mbust2@hatena.ne.jp"),
            new User(4, "Bryna Fussell", "bfussell3@slate.com"),
            new User(5, "Mata Stockney", "mstockney4@ibm.com"),
            new User(6, "Ardelle Danelet", "adanelet5@plala.or.jp"),
            new User(7, "Vittorio Melbourn", "vmelbourn6@amazon.co.uk"),
            new User(8, "Merry Ayrs", "mayrs7@cnet.com"),
            new User(9, "Lily Retchless", "lretchless8@free.fr"),
            new User(10, "Addison Trainer", "atrainer9@e-recht24.de")
    );

   public Optional<User> findUserById(int id) {
       return users.stream().filter(user -> user.getId() == id).findFirst();
   }

   public Optional<User> findUserByName(String name) {
       return users.stream().filter(user -> user.getName().equals(name)).findFirst();
   }

   public Optional<User> findUserByEmail(String email) {
       return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
   }

    public Optional<List<User>> findAllUsers() {
        return Optional.of(users);
    }
}
