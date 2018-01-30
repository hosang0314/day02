package user.test;

import frame.Biz;
import user.UserBIZ;
import vo.UserVO;

public class RemoveTest {

	public static void main(String[] args) {
		Biz biz = new UserBIZ();
		
		String user3 = "id01";
		biz.remove(user3);

	}

}
