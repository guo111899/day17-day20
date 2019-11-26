package cn.itcast.hotel;

public class FuWuYuan extends Employee implements VIP{
	//空参数构造方法
	public FuWuYuan() {
		super();
		
	}
   //满参数构造方法
	public FuWuYuan(String name, String id) {
		super(name, id);
		
	}
	
	
	public void work(){
		System.out.println("服务员在上菜");
	}
	


	public void services(){
		System.out.println("服务员给顾客倒酒");
	}
}
