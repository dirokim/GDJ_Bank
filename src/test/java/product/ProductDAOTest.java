package product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;
import com.winter.app.product.ProductDAO;
import com.winter.app.product.ProductDTO;

public class ProductDAOTest extends MyTest {
	
	@Autowired
	private ProductDAO productDAO;
	
	
	
//	@Test
//	public void getAddTest() throws Exception {
//		ProductDTO productDTO = new ProductDTO();
//		
//		for(int i=0;i<90;i++) {
//		productDTO.setProductName("Test"+i);
//		productDTO.setProductContents("Test"+i);
//		productDTO.setProductRate(1.11+i);
//		productDTO.setProductJumsu(1.1);
//		int result = productDAO.add(productDTO);
//		if(i%10==0) {
//			Thread.sleep(500);
//		}
//		
//		}
//		System.out.println("100개 입력 완료");
//		
//	}
	
//	@Test
//	public void listTest() throws Exception {
//		
//	 List<ProductDTO>ar = productDAO.list();
//	  assertEquals(10,ar.size());
//	}
//	
//	@Test
//	public void deleteTest() throws Exception {
//		ProductDTO productDTO = new ProductDTO();
//		productDTO.setProductNum(21L);
//	 int result = productDAO.delete(productDTO);
//		assertEquals(1, result);
//	}
//	@Test
//	public void detailTest() throws Exception {
//		ProductDTO productDTO = new ProductDTO();
//		productDTO.setProductNum(1L);
//		productDAO.delete(productDTO);
//		assertNotNull(productDTO);
//	}
//	@Test
//	public void updateTest() throws Exception {
//		ProductDTO productDTO = new ProductDTO();
//		productDTO.setProductName("Test");
//		productDTO.setProductContents("Test");
//		productDTO.setProductRate(2.1);
//		productDTO.setProductJumsu(3.1);
//		int result= productDAO.update(productDTO);
//		assertEquals(1, result);
//	}
}
