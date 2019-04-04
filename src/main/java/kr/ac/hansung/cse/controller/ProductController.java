package kr.ac.hansung.cse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.cse.model.Product;
import kr.ac.hansung.cse.service.ProductService;

@Controller // 이 클래스에 빈을 자동으로 관리
public class ProductController { // controller -> service -> dao

	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public String getProducts(Model model) {
		List<Product> products = productService.getProducts();
		model.addAttribute("products", products);

		return "products"; // view의 로지컬 이름(logical name)

	}

	@RequestMapping(value = "/products/viewProduct/{productId}", method = RequestMethod.GET)
	public String viewProduct(@PathVariable int productId, Model model) {
		Product product = productService.getProductById(productId); // product를 하나 읽어서
		model.addAttribute("product", product); // model에 읽어오고
		
		return "viewProduct";
	}

}
