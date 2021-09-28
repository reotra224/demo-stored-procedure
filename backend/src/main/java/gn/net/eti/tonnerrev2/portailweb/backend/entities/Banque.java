package gn.net.eti.tonnerrev2.portailweb.backend.entities;

/**
 * @création 24/03/2021
 * @projet portailweb
 * @auteur mohamed.bangoura
 * @package gn.net.eti.tonnerrev2.portailweb.backend.entities
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @création 24/03/2021
 * @projet portailweb
 * @auteur mohamed.bangoura
 * @package gn.net.eti.tonnerrev2.portailweb.backend.entities
 */


@Entity(name = "td_banque")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeBanque;
    private String libelle;
}
