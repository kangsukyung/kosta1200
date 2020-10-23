package kosta1200.todayroom.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta1200.todayroom.dao.ProductDAO;
import kosta1200.todayroom.vo.ImageUtil;
import kosta1200.todayroom.vo.ProductVO;

public class ProductService {
	private static ProductService service = new ProductService();
	private static ProductDAO dao;
	
	public static ProductService getInstance() {
		dao = ProductDAO.getInstance();
		return service;
	}
	
	public int insertProduct(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		
		//파일업로드(경로, 파일크기, 인코딩, 파일이름이중복됐을때정책)
		String uploadPath = request.getRealPath("upload"); //upload이 폴더의 경로를 알려준다
		System.out.println(uploadPath);
		
		int size = 20 * 1024 * 1024; //20MB
				
			MultipartRequest multi =
					new MultipartRequest(request, uploadPath, size, 
							"utf-8", new DefaultFileRenamePolicy());
		
		ProductVO productVO = new ProductVO();
		productVO.setProduct_name(multi.getParameter("product_name"));
		productVO.setProduct_price(Integer.parseInt(multi.getParameter("product_price")));
		productVO.setProduct_lcategory(multi.getParameter("product_lcategory"));
		productVO.setProduct_scategory(multi.getParameter("product_scategory"));
		productVO.setProduct_fname(multi.getParameter("product_fname"));
		
		
		System.out.println("product_fname:   "+multi.getFilesystemName("product_fname"));
		
		//파일업로드 DB(파일이름저장)
				if(multi.getFilesystemName("product_fname") != null) {
					String product_fname = (String)multi.getFilesystemName("product_fname");
					productVO.setProduct_fname(product_fname);
				
					//썸네일 이미지(gif, jpg, png) => aa.gif, aa.jpg, aa.png
					String pattern = product_fname.substring(product_fname.indexOf(".")+1); //.이후에 있는 문자들 .은빼고 확장자명(jpg,png등 을 보겠단 것
					System.out.println("pattern : " + pattern);
					String head = product_fname.substring(0, product_fname.indexOf(".")); //파일명(aa)
					System.out.println("head : " + head);
					
					//원본File객체 생성(폴더랑 파일 이름 다 필요)
					String imagePath = uploadPath + "\\" + product_fname;
					File src = new File(imagePath);
					System.out.println("src" + src);
					
					//섬네일 File객체 파일명에서 "_small.jpg" 이런식으로 되게 
					String thumPath = uploadPath + "\\" + head + "_small." + pattern;
					File dest = new File(thumPath);
					System.out.println("thumPath" + thumPath);
					
					if(pattern.equals("gif") || pattern.equals("jpg") || pattern.equals("png")) {
						ImageUtil.resize(src, dest, 100, ImageUtil.RATIO); //썸네일이미지생성
					}			
				}
		
		return dao.insertProduct(productVO);
	
	}//end insertProduct
	
	public List<ProductVO> listProductService() throws Exception{
		List<ProductVO> list = dao.listProduct();
		
		return list;
	}//end listBoardService
	
	public ProductVO detailProductService(int product_seq)throws Exception{
		return dao.detailProduct(product_seq);
	}
	
	/*
	 * public int updateProductervice(ProductVO productVO) throws Exception{ return
	 * dao. }
	 */
	
	
	
	
	
	
	

}
