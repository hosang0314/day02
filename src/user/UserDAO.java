/**
 * 
 */
package user;

import java.util.ArrayList;

import frame.Dao;
import vo.UserVO;

/**
 * @author student
 *
 */
public class UserDAO implements Dao {


	@Override
	public void insert(Object obj) {
		UserVO user = (UserVO)obj;
		System.out.println(user+" Inserted...");

	}


	@Override
	public void delete(Object obj) {
		String id = (String)obj;
		System.out.println(id+" Deleted...");

	}


	@Override
	public void update(Object obj) {
		UserVO user = (UserVO)obj;
		System.out.println(user+" Updated...");

	}


	@Override
	public Object select(Object obj) {
		String id = (String)obj;
		System.out.println(id+" Selected...");
		UserVO user = new UserVO("id01", "pwd01", "�̸���");
		return user;
	}


	@Override
	public ArrayList<Object> select() {
		ArrayList<Object> list = new ArrayList<>();
		System.out.println("Selected All..");
		list.add(new UserVO("id01", "pwd01", "�̸���"));
		list.add(new UserVO("id02", "pwd02", "�踻��"));
		list.add(new UserVO("id03", "pwd03", "������"));
		list.add(new UserVO("id04", "pwd04", "Ȳ����"));
		list.add(new UserVO("id05", "pwd05", "����"));
		return list;
	}
	
}
