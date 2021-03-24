package gn.net.eti.tonnerrev2.portailweb.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "td_reclamation")
@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * @création 24/03/2021
 * @projet portailweb
 * @auteur mohamed.bangoura
 * @package gn.net.eti.tonnerrev2.portailweb.backend.entities
 */

public class Reclamation {
    @Id
    private Long idReclamation;
    private String numeroReclamation;
    private String motifReclamation;
    private String infoComplementaires;
    private String pieceJointe;
    private Date   dateCreation;
    private Date   dateSuppression;


}
