package cn.itcast.hotel;

public class ChuShi extends Employee implements VIP{
	
	public ChuShi(){}
	
	
	public ChuShi(String name,String id){
		super(name,id);
	}

	public void work(){
		System.out.println("��ʦ�ڳ���");
	}
	public void services(){
		System.out.println("��ʦ���˼���");
	}
}
