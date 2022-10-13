package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DataBaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JDBCProductDao;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1, "Iphone", 10000);


        Logger[] loggers = {new DataBaseLogger(), new FileLogger(), new MailLogger()};




        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers );
        productManager.add(product1);


    }
}