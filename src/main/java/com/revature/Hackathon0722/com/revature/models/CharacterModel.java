package com.revature.Hackathon0722.com.revature.models;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.awt.*;

@Component
@Entity
@Table(name = "Characters")
@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterModel {
    @Id
    @Column(name = "CharacterId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Who owns me?

    // private String owner;

    //WHOOOOOO ARE YOU? OOO OOO! OOO OOO!
    @Column
    private String name;
    @Column
    private int strength;
    @Column
    private int dexterity;
    @Column
    private int intelligence;
    @Column
    private int wisdom;
    @Column
    private int numOfToes;
    @Column
    private int luck;

    //Spectrum
    @Column
    private String eyeColor;

    //Spectrums
    @Column
    private String gender;
    @Column
    private String race;

    //Big and long!
    @Column
    private String description;

}
