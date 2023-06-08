package softtek.ej1.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Factura {
    @Autowired
    @Qualifier("general")

    private Impuesto impuesto;
    private List<Producto> productos;

    public double CalcularTotalFactura(){
        double resultado = 0;
        for (Producto p : productos){
            resultado += impuesto.calcularImpuesto(p)+p.getPrecio();
            System.out.println("el objeto " + p.getNombre()+" tiene un valor de: "+(p.getPrecio()+impuesto.calcularImpuesto(p)));
        }
        System.out.println("El valor total de todo es: " + resultado);
        return resultado;
    }
}
