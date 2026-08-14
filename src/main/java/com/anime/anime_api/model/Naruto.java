package com.anime.anime_api.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("NARUTO")
public class Naruto extends Ninja{

    private boolean modoKurama = false;

    public void ativarModoKurama() {
        this.modoKurama = true;
        this.setNivel("Kage");
    }

    public void desativarModoKurama() {
        this.modoKurama = false;
        this.setNivel("Genin");
    }


    @Override
    public String usarTecnica(String alvo) {
        if (modoKurama) {
            return getNome() + " ativou o Chakra da Kurama e lançou um Super Rasengan contra " + alvo;
        } else {
            return super.usarTecnica(alvo);
        }
    }


}
 