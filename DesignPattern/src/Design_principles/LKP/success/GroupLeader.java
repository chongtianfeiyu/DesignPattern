package Design_principles.LKP.success;

import java.util.List;

public class GroupLeader {
	private List<Girl> listGirls;
	   public GroupLeader(List<Girl> _listGirls) {
	        this.listGirls = _listGirls;
 }
	
	public int countGirls() {
		// TODO Auto-generated method stub
			return listGirls.size();
	}

}
