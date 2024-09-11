package Entidades;
import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
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
@Table(name = "Domicilio")
public class Domicilio implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombreCalle")
    private String  nombreCalle;

    @Column(name = "numero")
    private int numero;

    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;

    public Domicilio(String nombreCalle, int numero) {
        this.nombreCalle = nombreCalle;
        this.numero = numero;
    }
}
