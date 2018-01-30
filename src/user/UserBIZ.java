package user;

import java.util.ArrayList;

import frame.Biz;

public class UserBIZ extends Biz {
	
	public UserBIZ() {
		dao = new UserDAO();
	}
	
	@Override
	public void register(Object obj) {
		start();
		dao.insert(obj);
		end();
	}

	@Override
	public void modify(Object obj) {
		start();
		dao.update(obj);
		end();

	}

	@Override
	public void remove(Object obj) {
		start();
		dao.delete(obj);
		end();
	}

	@Override
	public Object get(Object obj) {
		start();
		Object result = dao.select(obj);
		end();
		return result;
	}

	@Override
	public ArrayList<Object> get() {
		start();
		ArrayList<Object> arr = dao.select();
		end();
		return arr;
	}

}
