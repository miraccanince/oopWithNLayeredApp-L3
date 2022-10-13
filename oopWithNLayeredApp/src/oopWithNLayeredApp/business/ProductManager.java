package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JDBCProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;
import java.util.Locale;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }



    public void add(Product product) throws Exception {
           // business rules

        if (product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz...");
        }
        productDao.add(product);

        for (Logger logger: loggers){
            logger.log(product.getName());
        }

    }

}