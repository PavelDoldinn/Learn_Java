package сomparableComparator;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("Pavel", 37));
        userList.add(new User("Viktor", 25));
        userList.add(new User("Tor", 5));
        userList.add(new User("Lena", 40));
        userList.add(new User("Alena", 80));
        System.out.println(userList);

        UserNameComparator userNameComparator = new UserNameComparator();
        userList.sort(userNameComparator);
        System.out.println(userList);

        UserAgeComparator userAgeComparator = new UserAgeComparator();
        userList.sort(userAgeComparator);
        System.out.println(userList);

        userList.add(new User("Lena", 18));
        userList.add(new User("Lena", 35));
        userList.add(new User("Lena", 20));

        userList.sort(userNameComparator.thenComparing(userAgeComparator));
        System.out.println(userList);
    }

}
