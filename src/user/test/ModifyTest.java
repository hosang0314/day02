package user.test;

import frame.Biz;
import user.UserBIZ;
import vo.UserVO;

public class ModifyTest {

	public static void main(String[] args) {
		Biz biz = new UserBIZ();
		UserVO user2 = new UserVO("id02", "pwd02", "±è¸»¼÷");
		biz.modify(user2);
		

	}

}
