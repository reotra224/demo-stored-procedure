package gn.net.eti.tonnerrev2.portailweb.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @création 24/03/2021
 * @projet portailweb
 * @auteur mohamed.bangoura
 * @package gn.net.eti.tonnerrev2.portailweb.backend.entities
 */

@Entity(name = "td_procuration")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Procuration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroProcuration;
    private String nomMandataire;
    private String prenomMandataire;
    private String numeroPieceIndentite;
    private Date   dateDelivrance;
    private Date   dateValidite;
    private String telephoneMandataire;
    private String emailMandataire;
    private String modeReceptionNotification;
    private Date   dateProcuration;
    private Date   dateSuppression;

}
