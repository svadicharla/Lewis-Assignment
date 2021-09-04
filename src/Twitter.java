public class Twitter {
public static void main(String args[])

{
TwitterAccount BTSAccount = new TwitterAccount();

Fans F1 = new Fans("Sharath");
Fans F2 = new Fans("Karthik");

BTSAccount.Register(F1);
BTSAccount.Register(F2);


BTSAccount.unRegister(F1);


F1.FollowBeautyPage(BTSAccount);
F2.FollowBeautyPage(BTSAccount);

BTSAccount.upload("BTS New song - Permission To Dance");

}
}