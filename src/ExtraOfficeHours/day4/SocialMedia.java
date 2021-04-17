package ExtraOfficeHours.day4;

public abstract class SocialMedia {
    /*
    * Create abstract class for Scial Media that has following futures
        -Direct Messaging(String userName String msg)
        -Post(String body)
        -Notification(int time)
     * The social media will also have the following fields:
         - Personal URL(String)
         - Account length(int)
         - Platform(Static String)

     */
    protected String url;
    protected int accountLength;
    protected static String platform;


    public abstract void directMsg(String userName, String msg);
    public abstract void post(String body);
    public abstract void notification(int time);


}
