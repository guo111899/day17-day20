package cn.itcast.hotel;

public class JingLi extends Employee {
	
	public JingLi(){}
	

	public JingLi(String name,String id,double money){
		super(name, id);
		this.money = money;
	}
	

	private double money;
	
	
	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	//重写抽象方法
	public void work(){
		System.out.println("管理,谁出错我罚谁");
	}
}
