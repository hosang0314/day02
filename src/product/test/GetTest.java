package product.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import product.ProductBIZ;
import vo.ProductVO;

class GetTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	Biz biz;
	
	@Test
	void testGetObject() {
		biz = new ProductBIZ();
		ProductVO result = (ProductVO) biz.get(10);
		System.out.println(result);
	}

	@Test
	void testGet() {
		biz = new ProductBIZ();
		ArrayList<Object> arr = biz.get();
		for(Object obj:arr) {
			ProductVO result = (ProductVO) obj;
			System.out.println(result);
		}
	}

}
