package softtek.ej1;

import softtek.ej1.Modelo.Factura;
import softtek.ej1.Modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import softtek.ej1.Modelo.ivaSuperReducido;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ej1Application implements CommandLineRunner {
    @Autowired
    Factura F;

    public static void main(String[] args) {
        SpringApplication.run(Ej1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        List<Producto> products = new ArrayList<>();
        products.add(new Producto("A",1.11));
        products.add(new Producto("B",2.22));
        products.add(new Producto("C",3.33));


        F.setProductos(products);
        F.CalcularTotalFactura();
        F.setImpuesto(new ivaSuperReducido());
        F.CalcularTotalFactura();
    }
}
