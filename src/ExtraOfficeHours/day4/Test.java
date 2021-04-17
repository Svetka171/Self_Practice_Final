package ExtraOfficeHours.day4;

public class Test {
    public static void main(String[] args) {
        FacebookUser user1 = new FacebookUser("Sveta", "007");
        FacebookUser user2 = new FacebookUser("kevin", "087", "Kevin Tomish", 17, 50);

        System.out.println(user2);

        System.out.println(user1.url);

        user1.sendFriendRequest(user2);

        System.out.println(user2.getNumberOfFriends());





    }
}
