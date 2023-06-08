package Softtek.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "autobuses")
public class autobuses {
    @Id
    @Column(length =7)
    private String matricula;

    @Column(name="a_fabricante")
    private Integer aFabricante;

    @OneToMany(mappedBy = "matricula", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<visitas> visitas;
}
