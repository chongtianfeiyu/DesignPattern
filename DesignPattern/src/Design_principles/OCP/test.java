package Design_principles.OCP;

public class test {
	  public static void main(String []a)   
	    {   
//		  ��ѭ����ԭ����Ƴ���ģ�����������Ҫ������[1] 
//				  ��1��������չ�ǿ��ŵģ�Open for extension��������ζ��ģ�����Ϊ�ǿ�����չ�ġ���Ӧ�õ�����ı�ʱ�����ǿ��Զ�ģ�������չ��ʹ�����������Щ�ı������Ϊ��Ҳ����˵�����ǿ��Ըı�ģ��Ĺ��ܡ�
//				  ��2�������޸��ǹرյģ�Closed for modification������ģ����Ϊ������չʱ�����ظĶ�ģ���Դ������߶����ƴ��롣ģ��Ķ����ƿ�ִ�а汾�������ǿ����ӵĿ⡢DLL����.EXE�ļ���������Ķ���
	        Fruit tempApple;   
	        gardenerBase appleGarden = AppleGardener.getGardener();   
	        tempApple = appleGarden.getFruit();   
	  
	        Fruit tempPear;   
	        gardenerBase pearGarden = PearGardener.getGardener();   
	        tempPear = pearGarden.getFruit();   
	    }   
}
