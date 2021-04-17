package ExtraOfficeHours.day4;

import java.util.ArrayList;

public class FacebookUser extends SocialMedia{

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> allPosts;
    static {
        platform = "Facebook";
    }

    //three types of constructor
    public FacebookUser(String username, String password){
        if (password.contains(username)) {
            System.out.println("Invalid password, contains username will set default one");
            this.password = "password";
        }else{
            this.password = password;
        }
        this.username = username;
        this.url = "facebook.com/" + this.username;
        this.accountLength =0;
        allPosts = new ArrayList<>();

    }

    public FacebookUser (String username, String password, String fullName) {
        this(username, password);

        boolean isValidName = true;


        for(int i=0; i < fullName.length(); i++) {

            if(fullName.charAt(i) == ' ') continue;

            if(!Character.isLetter(fullName.charAt(i))) {
                isValidName = false;
                break;
            }

        }

        if(isValidName) {
            this.fullName = fullName;
        } else {
            System.out.println("Invalid name");
            this.fullName = "no name";
        }

    }

    public FacebookUser(String username, String password, String fullName ,int age,  int numberOfFriends){
        this(username,password,fullName);
        if(age<0){
            System.out.println("Invalid age");
        }else{
            this.age = age;
        }
        if(numberOfFriends<0){
            System.out.println("Invalid friends");
        }else{
            this.numberOfFriends = numberOfFriends;
        }
    }

    public boolean sendFriendRequest(FacebookUser otherUser){
        boolean valid = false;
        if(this.numberOfFriends>5000){
            System.out.println("U have reached max number ");
        }else if(otherUser.numberOfFriends>5000){
            System.out.println(otherUser.fullName + " Have reached max number of friends");
        } else{
            System.out.println("Friend request send to " + otherUser.fullName);
            this.numberOfFriends++;
            otherUser.numberOfFriends++;
            valid = true;
        }
        return valid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }

    @Override
    public void directMsg(String userName, String msg) {
        System.out.println(msg + " send to: " + userName);
    }

    @Override
    public void post(String body) {
        allPosts.add(new Post(body));
    }

    @Override
    public void notification(int time) {
        //8am-5pm
        if(time >=8 && time<=17){
            System.out.println("Notification");
        }else{
            System.out.println("Sleep mode");
        }
    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                '}';
    }
}
