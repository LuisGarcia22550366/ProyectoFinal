package dao;

import com.mycompany.tiendalogin.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> allUsers;

    public UserDAO() {
        allUsers = new ArrayList<>();
    }

    public int search(String user) {
        int n = -1;
        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).getUser().equals(user)) {
                n = i;
                break;
            }

        }
        return n;
    }

    public boolean insert(User user) {
        if (search(user.getUser()) == -1) {
            allUsers.add(user);
            return true;
        } else {
            return false;
        }
    }

    public boolean modify(User user) {
        if (search(user.getUser()) == -1) {
            User useraux = own(user.getUser());

            useraux.setPassword(user.getPassword());
            useraux.setName(user.getName());
            useraux.setLastNAme(user.getName());
            useraux.setMail(user.getMail());

            return true;
        } else {
            return false;
        }
    }

    public boolean delete(String user) {
        if (search(user) == -1) {
            allUsers.remove(search(user));
            return true;
        } else {
            return false;
        }
    }

    public User own(String user) {
        if (search(user) != -1) {
            return allUsers.get(search(user));
        } else {
            return null;
        }
    }

}
