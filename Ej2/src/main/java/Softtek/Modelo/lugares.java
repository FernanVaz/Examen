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
@Table(name="lugares")
public class lugares {
    @Id
    @Column(name = "id_lugar")
    private Integer id_lugar;

    @Column(length = 60)
    private String nombre;
}
