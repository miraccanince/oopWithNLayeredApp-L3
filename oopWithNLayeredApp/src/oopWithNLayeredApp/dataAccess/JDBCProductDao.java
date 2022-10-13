package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JDBCProductDao implements ProductDao {
            public void add(Product product) {
                System.out.println("JDBC ile veri tabanına eklendi");

            }

}
