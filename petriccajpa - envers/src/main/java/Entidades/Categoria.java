package Entidades;
import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Entidades.*;
import lombok.*;
import org.hibernate.envers.Audited;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Audited


@Entity
@Table(name = "Categoria")
public class Categoria implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    @ManyToMany(mappedBy = "categoria")
    private List<Articulo> articulo =  new ArrayList<Articulo>();

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }
}
