package Design_principles.LSP;

public class test {
public static void main(String[] args) {
	//里氏代换原则
	
	//从字面上理解正方形是长方形的一个子类（注：长宽相等）
	//但是：如有下面的需求
	//对长方形做改变
	//如果高小于宽，则重新设置高度为宽加1
	
	//所以正方形不满足这样的需求，所以为了使其满足里氏代换原则，则需要我们构造一个抽象的四边形类，
//	把长方形和正方形共同的行为放到这个四边形类里面，让长方形和正方形都是它的子类，问题就OK了
	
	
	

}
public void resize(Rectangle r){
	while(r.getHeight()<=r.getWidth()){
		r.setHeight(r.getWidth()+1);
	}
}
}
