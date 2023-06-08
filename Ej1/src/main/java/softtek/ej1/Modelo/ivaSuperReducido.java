package softtek.ej1.Modelo;

import org.springframework.stereotype.Component;

@Component("reducido")
public class ivaSuperReducido implements Impuesto{


    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*0.04;
    }
}
