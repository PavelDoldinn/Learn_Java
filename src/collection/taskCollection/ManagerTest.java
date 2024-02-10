package collection.taskCollection;

import java.time.LocalDate;

public class ManagerTest {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.addNewUser(new User( "Misha", "123qw", LocalDate.of(2020, 10, 10)));
        manager.addNewUser(new User("Pavel", "37p", LocalDate.now()));
        manager.addNewUser(new User("Lena", "qwe", LocalDate.of(2021, 10, 10)));
        manager.addNewUser(new User("Ira", "zxcv", LocalDate.of(2023, 1, 1)));
        System.out.println("------------------------------");

        manager.loginEnter("Misha", "123");
        System.out.println("-----------------------------");

        //manager.deleteUser("Misha.");
        //System.out.println("--------------------------------");

        manager.getAllUser();
        System.out.println("----------------------------------");

        manager.getALLUser("date");
        System.out.println("----------------------------");

        manager.getALLUser("login");
        System.out.println("-----------------------------------");

        manager.editUser(new User("Misha", "1111", LocalDate.now()));



    }

}
