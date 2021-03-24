package gn.net.eti.tonnerrev2.portailweb.backend.entities;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @création 18/03/2021
 * @projet portailweb
 * @auteur mohamed.bangoura
 * @package gn.net.eti.tonnerrev2.portailweb.backend.entities
 */

@Entity
@Data
public class Formulaire {
    @Id
    @GeneratedValue
    private Long id;


}
