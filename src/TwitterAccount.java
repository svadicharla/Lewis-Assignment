import java.util.ArrayList;
import java.util.List;

public class TwitterAccount {


	private List<Fans> f = new ArrayList<>();
	String AccountName;
   
public void Register(Fans newFan)

{f.add(newFan); }

public void unRegister(Fans deleteFan) {
int FanIndex=f.indexOf(deleteFan);
System.out.println("Fan unfollowed you!");
f.remove(deleteFan); }


public void notifyFans()
{ for(Fans fn : f) {fn.update();
}
}


public void upload(String AccountName) {
this.AccountName = AccountName;
notifyFans();
}

}