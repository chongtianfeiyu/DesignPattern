package Design_principles.LKP.success;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		// 迪米特法则（Law of Demeter）又叫作最少知道原则（Least Knowledge Principle 简写LKP），
		// 就是说一个对象应当对其他对象有尽可能少的了解,不和陌生人说话。英文简写为: LoD.

		//success
		Teacher teacher = new Teacher();
		List<Girl> listGirls = new ArrayList<Girl>();

		for (int i = 0; i < 20; i++) {
			listGirls.add(new Girl());
		}

		GroupLeader groupLeader = new GroupLeader(listGirls);
		teacher.commond(groupLeader);

	}
}