package Design_principles.ISP;

public class test {
	public static void main(String[] args) {
		IOrderForPortal orderForPortal = Order.getOrderForPortal();
		IOrderForOtherSys orderForOtherSys = Order.getOrderForOtherSys();
		IOrderForAdmin orderForAdmin = Order.getOrderForAdmin();
		System.out.println("Portal门户调用方法:" + orderForPortal.getOrder());
		System.out
				.println("OtherSys外部系统调用方法:" + orderForOtherSys.insertOrder());
		System.out.println("Admin管理后台调用方法:" + orderForAdmin.getOrder() + ";"
				+ orderForAdmin.insertOrder() + ";"
				+ orderForAdmin.updateOrder() + ";"
				+ orderForAdmin.deleteOrder());
	}

}
