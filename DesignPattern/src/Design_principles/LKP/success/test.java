package Design_principles.LKP.success;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		// �����ط���Law of Demeter���ֽ�������֪��ԭ��Least Knowledge Principle ��дLKP����
		// ����˵һ������Ӧ�������������о������ٵ��˽�,����İ����˵����Ӣ�ļ�дΪ: LoD.

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