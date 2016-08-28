package com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.model.ProductModel;
import com.service.ProductService;


@Controller
public class ProductController {
  @Autowired
	private ServletContext servletContext;
	@ModelAttribute("ob")
	public ProductModel construct(){
		return new ProductModel();
	}
	@Autowired(required=true)
	private ProductService productservice;
	
	@RequestMapping(value={"admin/next"})
	public String cat(Map<String, Object>map)
	{
		ProductModel productmodelResult = new ProductModel();
		 map.put("productmodel",productmodelResult);
		    map.put("productmodelList", productservice.getAllProductModel());
		return "prodnxtpage";
	}

@RequestMapping(value="/admin/Prodview")
	public String setupForm(){
		return "Prodview";
	}
	
	@RequestMapping(value={"/admin/productmodel.do","update/productmodel.do"}, method=RequestMethod.POST)
	public String doActions(@ModelAttribute("ob") ProductModel productmodel, BindingResult result, @RequestParam String action, Map<String, Object>map){
	    ProductModel productmodelResult = new ProductModel();
	    switch(action.toLowerCase()){
	    case "add":
	    	
	    MultipartFile file = productmodel.getFilename();

			if (!file.isEmpty()) {

				try {

					// Creating the directory to store file

					
					/*String rootPath = "D:/ Workspace/ SHOPPINGCART/MusicWorld/src/main/webapp/resources/";*/
					File rootPath=new File(servletContext.getRealPath("/"));
					File dir = new File(rootPath + File.separator + "resources/admin/upload");
					if (!dir.exists())
						dir.mkdirs();
					

					// Create the file on server
					File serverFile = new File(dir + File.separator + productmodel.getImgname() + ".jpg");
					System.out.println(serverFile);
					file.transferTo(serverFile);

				} catch (Exception e) {

				}

			}
	    
	    	productservice.add(productmodel);
	    	productmodelResult = productmodel;
	    	
	    	break;
	    	
	    case "edit":
	    	productservice.edit(productmodel);
	    	productmodelResult = productmodel;
	    	break;
	    	
	    case "delete":
	    	productservice.delete(productmodel.getId());
	    	productmodelResult = new ProductModel();
	    	break;
	    	
	    case "search":
	    	ProductModel searchedProductModel = productservice.getProductModel(productmodel.getId());
	    	productmodelResult = searchedProductModel!=null ? searchedProductModel : new ProductModel();
	    	break;
	    }
	    map.put("productmodel",productmodelResult);
	    map.put("productmodelList", productservice.getAllProductModel());
	    
		return "Prodview";
	}
}

/*package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.model.FileUtil;
import com.model.ProductDetails;

import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	private String path="C:\\New folder\\images";
	
	@ModelAttribute("musicplay")
	public ProductDetails getproduct() {
		return new ProductDetails();
	}

	@RequestMapping("/product")
	
		public String listPersons(Model model) {
			
			model.addAttribute("listProducts", productService.listProducts());
		return "product";
	}

	@RequestMapping(value = "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("musicplay") ProductDetails productDetails,Model model) {
        
        MultipartFile file= productDetails.getImage();
		
		FileUtil.upload(path, file, productDetails.getImage()+".jpg");
		
		
		if (productDetails.getProductid() == 0) {

			productService.addProduct(productDetails);
		} else {

			productService.updateProduct(productDetails);
		}
		
		
		
		return "redirect:/product";
	}

	@RequestMapping("/remove/{productid}")
	public String removeProduct(@PathVariable("productid") int productid) {

		productService.removeProduct(productid);
		return "redirect:/product";
	}

	@RequestMapping("/edit/{productid}")
	public String editProduct(@PathVariable("productid") int productid, Model model) {
		model.addAttribute("productDetails", productService.getProductById(productid));
		model.addAttribute("listProducts", productService.listProducts());
		return "product";
	}
	
	@RequestMapping("/list")
	public String viewall(Model model){
		model.addAttribute("listProducts", productService.listProducts());
		return "list";
		
	}
}*/




/*package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
	@Autowired
	 private ProductService productsService;
		
		
		
		@RequestMapping("/Prodview")
		public String setupForm(Map<String, Object>map){
			ProductModel productModel = new ProductModel();
			map.put("productModel", productModel);
			map.put("foodproductsList", foodproductsService.getAllFoodproducts());
			return "Prodview";
		}
		@RequestMapping(value={"viewall.do","edit/viewall.do"},method =RequestMethod.POST)
		public String doActions(@ModelAttribute Foodproducts foodproducts,BindingResult result,@RequestParam String action,Map<String, Object>map){
			Foodproducts foodproductsdelivery = new Foodproducts();
			switch(action.toLowerCase()){
			case "add":
				foodproductsService.add(foodproducts);
				foodproductsdelivery=foodproducts; 
				break;
			case "edit":
				foodproductsService.edit(foodproducts);
				foodproductsdelivery=foodproducts;
				break;
			case "delete":
				foodproductsService.delete(foodproducts.getProductId());
				foodproductsdelivery=new Foodproducts();
				break;
			case "search":	
			Foodproducts searchedFoodproducts=	foodproductsService.getFoodproducts(foodproducts.getProductId());
				foodproductsdelivery=searchedFoodproducts!=null ? searchedFoodproducts:new Foodproducts();
				break;
				}
			map.put("foodproducts", foodproductsdelivery);
			map.put("foodproductsList", foodproductsService.getAllFoodproducts());
			return "viewall";
			
			
}
}*/

