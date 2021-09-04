public class Fans {
private String Name;
private TwitterAccount t = new TwitterAccount();

public Fans(String name) {
super();
Name = name;

}

public void update()
{

System.out.println("Hey " +Name+ ", BTS Uploaded a new Song.");
}

public void FollowBeautyPage(TwitterAccount TA) {
t = TA;
}
}