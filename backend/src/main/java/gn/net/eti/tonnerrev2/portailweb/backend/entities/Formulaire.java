package gn.net.eti.tonnerrev2.portailweb.backend.entities;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @création 18/03/2021
 * @projet portailweb
 * @auteur mohamed.bangoura
 * @package gn.net.eti.tonnerrev2.portailweb.backend.entities
 */

@Entity(name = "td_formulaire")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formulaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  numeroFormulaire;
    private String  libelleFormulaire;
    private String  nomFichier;
    private Boolean flagPublier;
    private String  statut;
    private Date    dateCreation;




}
