package Softtek.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="visitas")
public class visitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "f_visita")
    private LocalDate date;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "matricula", referencedColumnName = "matricula")
    private autobuses matricula;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dni",referencedColumnName ="dni" )
    private conductores dni;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_ lugar",referencedColumnName = "id_lugar")
    private lugares lugar;
}