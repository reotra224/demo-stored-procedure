package gn.net.eti.tonnerrev2.portailweb.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @création 24/03/2021
 * @projet portailweb
 * @auteur mohamed.bangoura
 * @package gn.net.eti.tonnerrev2.portailweb.backend.entities
 */
@Entity(name = "td_document")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    @Id
    private Long idDocument;
    private String  numeroDocument;
    private String  titreDocument;
    private String  nomFichier;
    private Boolean flag_publier;
    private Date    dateCreation;
    private Boolean flag_Statut;
}
