package product;

import java.util.ArrayList;

import frame.Biz;
import vo.ProductVO;

public class ProductBIZ extends Biz {
	
	public ProductBIZ() {
		dao = new ProductDAO();
	}
	
	@Override
	public void register(Object obj) {
		dao.insert(obj);

	}

	@Override
	public void modify(Object obj) {
		dao.update(obj);

	}

	@Override
	public void remove(Object obj) {
		dao.delete(obj);

	}

	@Override
	public Object get(Object obj) {
		Object result = dao.select(obj);
		return result;
	}

	@Override
	public ArrayList<Object> get() {
		ArrayList<Object> arr = dao.select();
		return arr;
	}

}
