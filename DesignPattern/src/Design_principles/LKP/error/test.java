package Design_principles.LKP.error;

import Design_principles.LKP.error.GroupLeader;
import Design_principles.LKP.error.Teacher;

public class test {
	public static void main(String[] args) {
//		�����ط���Law of Demeter���ֽ�������֪��ԭ��Least Knowledge Principle ��дLKP����
//		����˵һ������Ӧ�������������о������ٵ��˽�,����İ����˵����Ӣ�ļ�дΪ: LoD.
		
		//error
		Teacher teacher=new Teacher();
		
		GroupLeader groupLeader=new GroupLeader();
		
		teacher.commond(groupLeader);
		
}
}