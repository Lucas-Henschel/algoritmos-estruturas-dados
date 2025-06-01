/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.init;

import src.model.NoMapa;

/**
 *
 * @author lucas
 */
public class MapaDispersao<T> {
    private ListaEncadeada<T>[] info;

    public MapaDispersao(int tamanho) {
        this.info = new ListaEncadeada[tamanho];
    }
    
    private int calcularHash(int chave) {
        return chave % info.length;
    }
    
    public void inserir(int chave, T value) {
        int indice = calcularHash(chave);
        
        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }
        
        NoMapa<T> noMapa = new NoMapa<>(chave, value);
        info[indice].inserir(noMapa);
    }
    
    public void remover(int chave) {
        int pos = calcularHash(chave);
        
        info[pos].retirar(chave);
    }
    
    public T buscar(int chave){
        int indice = calcularHash(chave);
        
        if (info[indice] != null) {
            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);
            
            NoMapa<T> no = info[indice].buscar(chave);
            
            if (no != null) {
                return no.getInfo();
            }
        }
        
        return null;
    }
}
