package Design_principles.ISP;

public class Order implements IOrderForPortal,IOrderForOtherSys,IOrderForAdmin{
    private Order(){
    //--ʲô������,����Ϊ�˲���ֱ�� new,��ֹ�ͻ���ֱ��New,Ȼ�����������Ҫ�ķ���.
    }
    //���ظ�Portal
    public static IOrderForPortal getOrderForPortal(){
    return (IOrderForPortal)new Order();
    }
    //���ظ�OtherSys
    public static IOrderForOtherSys getOrderForOtherSys(){
        return (IOrderForOtherSys)new Order();
    }
    //���ظ�Admin
    public static IOrderForAdmin getOrderForAdmin(){
        return (IOrderForAdmin)new Order();
    }
    //--�����ǽӿڷ�����ʵ��.ֻ�Ƿ�����һ��String������ʾ
    public String getOrder(){
        return "implemented getOrder";
    }
    public String insertOrder(){
        return "implementedinsertOrder";
    }
    public String updateOrder(){
        return "implementedupdateOrder";
    }
    public String deleteOrder(){
        return "implementeddeleteOrder";
    }
}
