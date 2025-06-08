/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package init;

import model.NoArvoreBinaria;

/**
 *
 * @author lucas
 */
public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {
    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(getRaiz(), info);
    }
    
    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (pertence(no, info)) {
            return no;
        }
        
        return null;
    }
    
    @Override
    public void setRaiz(NoArvoreBinaria<T> raiz) {
        super.setRaiz(raiz);
    }
}
