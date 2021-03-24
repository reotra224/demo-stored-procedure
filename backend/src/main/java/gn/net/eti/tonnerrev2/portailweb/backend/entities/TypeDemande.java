package gn.net.eti.tonnerrev2.portailweb.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @création 24/03/2021
 * @projet portailweb
 * @auteur mohamed.bangoura
 * @package gn.net.eti.tonnerrev2.portailweb.backend.entities
 */

@Entity(name = "tc_type_demande")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeDemande {
    @Id
    private Long codeTypeDemande;
    private String libelleTypeDemande;

}
