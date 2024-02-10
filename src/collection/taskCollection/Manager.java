package collection.taskCollection;

import java.util.*;

public class Manager {

    public static Map<String, User> userMap = new HashMap<>();


    public boolean addNewUser(User user) {

        if (userMap.containsKey(user.getLogin())) {

            System.out.println("Пользователь с таким логином " + user.getLogin() + "уже существует");

            return false;

        } else {

            userMap.put(user.getLogin(), user);
            System.out.println(user.getLogin() + " Вы успешно зарегестрироваллись");

            return true;
        }
    }

    public boolean loginEnter(String login, String password) {

        if (!userMap.containsKey(login)) {

            System.out.println("Нет такого пользователя " + login);
            return false;

        } else if (userMap.get(login).getPassword().equals(password)) {

            System.out.println("Вы успешно вошли " + login);
            return true;

        } else {

            System.out.println("Вы ввели неверный логин или пароль");
            return false;

        }
    }


    public boolean deleteUser (String login) {

        if (userMap.containsKey(login)) {

            userMap.remove(login);
            System.out.println("Пользователь " + login + " удален");
            return true;

        } else {

            System.out.println("Нет такого пользователя " + login);
            return false;

        }

    }

    public void getAllUser () {

        System.out.println(userMap.keySet());

    }

    public void getALLUser(String sortCriterion) {

        switch (sortCriterion) {
            case "login" :
                Map<String, User> sortedByLoginMap = new TreeMap<>(userMap);

                for (Map.Entry entry : sortedByLoginMap.entrySet()){

                    System.out.println(entry.getKey() + " : " + entry.getValue());

                }
                break;
            case "date" :
            UserDateComparator userDateComparator = new UserDateComparator();
                List<User> sortedByDateList = new ArrayList<>(userMap.values());
                sortedByDateList.sort(userDateComparator);
                for (User user : sortedByDateList) {
                    System.out.println(user);
                }
                break;
        }

    }

    boolean editUser(User user) {

        if (!userMap.containsKey(user.getLogin())) {
            System.out.println("Пользователь с логином " + user.getLogin() + " не существует");
            return false;
        } else {
            userMap.put(user.getLogin(), user);
            System.out.println("Пользователь с логином " + user.getLogin() + " обновлен");
            return true;
        }

    }

}




















