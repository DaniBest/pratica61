/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.dainf.if62c.pratica;

import java.util.HashMap;

/**
 *
 * @author DANIEL
 */
public class Time {
    
    private HashMap jogadores = new HashMap<>();
    /*
    public Time() {
        jogadores = new HashMap<>();
    }*/
    
    public void addJogador(String posicao, Jogador jogador) {
        jogadores.put(posicao, jogador);
    }
    
    public HashMap getJogadores() {
        return jogadores;
    }
    
}
