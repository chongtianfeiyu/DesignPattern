package Design_principles.ISP;

public class test {
	public static void main(String[] args) {
		IOrderForPortal orderForPortal = Order.getOrderForPortal();
		IOrderForOtherSys orderForOtherSys = Order.getOrderForOtherSys();
		IOrderForAdmin orderForAdmin = Order.getOrderForAdmin();
		System.out.println("Portal�Ż����÷���:" + orderForPortal.getOrder());
		System.out
				.println("OtherSys�ⲿϵͳ���÷���:" + orderForOtherSys.insertOrder());
		System.out.println("Admin�����̨���÷���:" + orderForAdmin.getOrder() + ";"
				+ orderForAdmin.insertOrder() + ";"
				+ orderForAdmin.updateOrder() + ";"
				+ orderForAdmin.deleteOrder());
	}

}
