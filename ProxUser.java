package org.jintaidaili;

public class ProxUser implements IuserDao{
	
	//第一种实例
	private IuserDao target;
	public ProxUser(IuserDao iuserDao) {
		// TODO Auto-generated constructor stub
		this.target = iuserDao;
	}	
	public ProxUser() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void save() {
	//第二种实例
//		UserDaoImpl daoImpl = new UserDaoImpl();
		// TODO Auto-generated method stub
		System.out.println("事务");
		target.save();
//		daoImpl.save();
		System.out.println("控制");
	}
}
