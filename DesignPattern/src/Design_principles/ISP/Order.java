package Design_principles.ISP;

public class Order implements IOrderForPortal,IOrderForOtherSys,IOrderForAdmin{
    private Order(){
    //--什么都不干,就是为了不让直接 new,防止客户端直接New,然后访问它不需要的方法.
    }
    //返回给Portal
    public static IOrderForPortal getOrderForPortal(){
    return (IOrderForPortal)new Order();
    }
    //返回给OtherSys
    public static IOrderForOtherSys getOrderForOtherSys(){
        return (IOrderForOtherSys)new Order();
    }
    //返回给Admin
    public static IOrderForAdmin getOrderForAdmin(){
        return (IOrderForAdmin)new Order();
    }
    //--下面是接口方法的实现.只是返回了一个String用于演示
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
