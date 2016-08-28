/*package com.controller;


	
	import javax.servlet.http.HttpSession;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.multipart.MultipartFile;
	import org.springframework.web.servlet.ModelAndView;

	import com.model.FileUtil;
	
import com.model.ProductModel;
import com.service.ProductService;
	
	@Controller
	public class UploadController {


	

		@Autowired
		ProductService productService;

		private String path = "G:\\Java programs\\eclipse\\JEE files\\jvsmartwatches\\src\\main\\webapp\\resources\\img\\";

		@ModelAttribute("smartproducts")
		public ProductModel getproduct() {
			return new ProductModel();
		}

		/*
		 * @ModelAttribute("command") public ProductDetails updatedproduct() {
		 * return new ProductDetails(); }
		 */

		
/*@RequestMapping("/product")

		public String listPersons(HttpSession session, ProductModel productDetails) {
			
			session.setAttribute("listProducts", productService.listProducts());
			session.setAttribute("listBrands", productService.listBrands());
			
			return "product";
		}

		@RequestMapping(value = "/product/add", method = RequestMethod.POST)
		public String addProduct(@ModelAttribute("smartproducts") ProductModel productDetails) {
			System.out.println("in add");

			MultipartFile file = productDetails.getImage();

			String ima = file.getOriginalFilename();
			FileUtil.upload(path, file, ima);
			productDetails.setImage_name(ima);

			/*
			 * String im=productDetails.getImage_name(); im=ima;
			 */
/*
			productService.addProduct(productDetails);

			return "redirect:/product";
		}

		@RequestMapping("/remove/{product_id}")
		public String removeProduct(@PathVariable("product_id") int product_id, Model model) {

			productService.removeProduct(product_id);
			model.addAttribute("listProducts", productService.listProducts());
			return "productList";
		}

		@RequestMapping("/edit/{product_id}")
		public ModelAndView editProduct(@PathVariable("product_id") int product_id) {
			ProductModel productDetails = productService.getProductById(product_id);
			return new ModelAndView("editproduct", "smartproducts", productDetails);

		}

		@RequestMapping("/viewall")
		public String viewall(ProductModel productDetails, Model model) {

			model.addAttribute("listProducts", productService.listProducts());
			return "productList";
		}

		@RequestMapping("/update")
		public String update(@ModelAttribute("smartproducts") ProductModel productDetails, Model model) {
			productService.updateProduct(productDetails);

			model.addAttribute("listProducts", productService.listProducts());
			return "productList";
		}
	}*/
	


