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

@Entity(name = "td_client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroClient;
    private String nomClient;
    private String prenomClient;
    private String adresseClient;
    private String email;
    private String telephone;
    private String telephone1;
    private String login;
    private String password;
    private Boolean flagActif;
    private Boolean passwordGenerate;
    private String codeVerification;
    private String adresseFacturation;
    private String modeReception;
    private Boolean flagNotification;
    private Date dateCreation;
    private Date dateDerniereModification;



}
