package Design_principles.LSP;

public class test {
public static void main(String[] args) {
	//���ϴ���ԭ��
	
	//������������������ǳ����ε�һ�����ࣨע��������ȣ�
	//���ǣ��������������
	//�Գ��������ı�
	//�����С�ڿ����������ø߶�Ϊ���1
	
	//���������β�������������������Ϊ��ʹ���������ϴ���ԭ������Ҫ���ǹ���һ��������ı����࣬
//	�ѳ����κ������ι�ͬ����Ϊ�ŵ�����ı��������棬�ó����κ������ζ����������࣬�����OK��
	
	
	

}
public void resize(Rectangle r){
	while(r.getHeight()<=r.getWidth()){
		r.setHeight(r.getWidth()+1);
	}
}
}
