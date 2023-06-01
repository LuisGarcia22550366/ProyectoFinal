package logic;

import com.mycompany.tiendalogin.User;
import dao.UserDAO;

public class UserLogic {

    private static UserDAO userDAO = new UserDAO();

    public static boolean autentify(String user, String password) {
        if (own(user) != null) {
            User userConsult = own(user);
            if (userConsult.getUser().equals(user) && userConsult.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;

        }
    }

    public static boolean insert(User user) {
        return userDAO.insert(user);
    }

    public static boolean modify(User user) {
        return userDAO.modify(user);

    }

    public static boolean delete(String user) {
        return userDAO.delete(user);

    }

    public static User own(String user) {
        return userDAO.own(user);

    }
}
