package Design_principles.LKP.error;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	   public void commond(GroupLeader groupLeader) {
		           List<Girl> listGirls = new ArrayList<Girl>();

		           for (int i = 0; i < 20; i++) {
	          listGirls.add(new Girl());
		          }
		   
		          groupLeader.countGirls(listGirls);
		     }

}
