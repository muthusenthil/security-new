

package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.ProductModel;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{

	

	@Autowired(required=true)
	private SessionFactory session;
	
	@Override
   public void add(ProductModel productmodel ){
	   session.getCurrentSession().save(productmodel);
   }
	
	@Override
   public void edit(ProductModel productmodel){
       session.getCurrentSession().update(productmodel);
   }
   
	@Override
	public void delete(String getId){
		session.getCurrentSession().delete(getProductModel(getId));
	}
		@Override
		public ProductModel getProductModel(String getId){
			return (ProductModel)session.getCurrentSession().get(ProductModel.class,getId);
		}
		
		@Override
		public List getAllProductModel(){
			return session.getCurrentSession().createQuery("from product").list();
		}
		
		@Override
		public List getALLonear() {
			
			// TODO Auto-generated method stub
			return session.getCurrentSession().createQuery("from product where category='onear'").list();
			
		}

		@Override
		public List getALLoverear() {
			// TODO Auto-generated method stub
			return  session.getCurrentSession().createQuery("from product where category='overear'").list();
		}

		@Override
		public List getALLbluetooth() {
			// TODO Auto-generated method stub
			return  session.getCurrentSession().createQuery("from product where category='bluetooth'").list();
		}

		@Override
		public List getALLearbud() {
			// TODO Auto-generated method stub
			return  session.getCurrentSession().createQuery("from product where category='earbud'").list();
		}
		
}

/*package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.ProductDetails;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory session;
	
	@Override
	public void addProduct(ProductDetails productDetails) {
		 session.getCurrentSession().save(productDetails);

	}

	@Override
	public void updateProduct(ProductDetails productDetails) {
		 session.getCurrentSession().update(productDetails);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDetails> listProducts() {
		 
		return(List<ProductDetails>)
		session.getCurrentSession().createCriteria(ProductDetails.class).list();
	
	}

	@Override
	public ProductDetails getProductById(int productid) {
		System.out.println((ProductDetails)session.getCurrentSession().get(ProductDetails.class, productid ));
		
		return (ProductDetails)session.getCurrentSession().get(ProductDetails.class, productid );
	}

	@Override
	public void removeProduct(int productid) {
		session.getCurrentSession().delete(getProductById(productid));
		

	}

}*/


