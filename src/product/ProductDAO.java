package product;

import java.util.ArrayList;

import frame.Dao;
import vo.ProductVO;
import vo.UserVO;

public class ProductDAO implements Dao {

	@Override
	public void insert(Object obj) {
		ProductVO product = (ProductVO) obj;
		System.out.println(product+" inserted...");
	}

	@Override
	public void delete(Object obj) {
		String id = (String) obj;
		System.out.println(id+" deleted...");
	}

	@Override
	public void update(Object obj) {
		ProductVO product = (ProductVO) obj;
		System.out.println(product+" updated...");
	}

	@Override
	public Object select(Object obj) {
		int id = (int) obj;
		System.out.println(id+" Selected...");
		ProductVO product = new ProductVO(10, "pname", 1000);
		return product;
	}

	@Override
	public ArrayList<Object> select() {
		ArrayList<Object> list = new ArrayList<>();
		System.out.println("Selected All..");
		list.add(new ProductVO(10, "n1", 100));
		list.add(new ProductVO(20, "n2", 200));
		list.add(new ProductVO(30, "n3", 300));
		list.add(new ProductVO(40, "n4", 400));
		list.add(new ProductVO(50, "n5", 500));
		return list;
	}

}
