/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.HashMap;

/**
 *
 * @author DANIEL
 */
public class Time {
    
    private HashMap<String, Jogador> jogadores;
    
    public Time() {
        jogadores = new HashMap<String, Jogador>();
    }
    
    public void addJogador(String posicao, Jogador jogador) {
        jogadores.put(posicao, jogador);
    }
    
    public HashMap<String, Jogador> getJogadores() {
        return jogadores;
    }
    
}
