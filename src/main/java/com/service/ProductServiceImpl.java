
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.model.ProductModel;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	
	@Autowired(required=true)
	private ProductDao productdao;
	@Transactional
	public void add(ProductModel productmodel){
		productdao.add(productmodel);
	}
	
	@Transactional
	public void edit(ProductModel productmodel){
		productdao.edit(productmodel);
	}
	
	@Transactional
	public void delete(String getId){
		productdao.delete(getId);
	}
	
	@Transactional
	public ProductModel getProductModel(String getId){
		return productdao.getProductModel(getId);
	}
	
	@Transactional
	public List getAllProductModel(){
		return productdao.getAllProductModel();
	}
	
	@Override
	public List getALLonear() {
		// TODO Auto-generated method stub
		return productdao.getALLonear();
	}

	@Override
	public List getALLoverear() {
		// TODO Auto-generated method stub
		return productdao.getALLoverear();
	}

	@Override
	public List getALLbluetooth() {
		// TODO Auto-generated method stub
		return productdao.getALLbluetooth();
	}

	@Override
	public List getALLearbud() {
		// TODO Auto-generated method stub
		return productdao.getALLearbud();
	}
}

/*package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.model.ProductDetails;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired ProductDao productDao;
	
	@Transactional
	public void addProduct(ProductDetails productDetails) {
		productDao.addProduct(productDetails);

	}

	@Transactional
	public void updateProduct(ProductDetails productDetails) {
		
		productDao.updateProduct(productDetails);

	}

	@Transactional
	public List<ProductDetails> listProducts() {
		
		return productDao.listProducts();
	}

	@Transactional
	public ProductDetails getProductById(int productid) {
		System.out.println(productDao.getProductById(productid));
		return productDao.getProductById(productid);
	}

	@Transactional
	public void removeProduct(int productid) {
		productDao.removeProduct(productid);

	}

}*/

