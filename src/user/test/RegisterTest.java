package user.test;

import frame.Biz;
import user.UserBIZ;
import vo.UserVO;

public class RegisterTest {

	public static void main(String[] args) {
		Biz biz = new UserBIZ();
		UserVO user = new UserVO("id01", "pwd01", "ÀÌ¸»¼÷");
		biz.register(user);
		
	}

}
