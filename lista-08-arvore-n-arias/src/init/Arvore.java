/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package init;

import model.NoArvore;

/**
 *
 * @author lucas
 */
public class Arvore<T> {
    private NoArvore<T> raiz;

    public Arvore() {
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }
    
    public boolean pertence(T info) {
        if (raiz == null) {
            return false;
        } else {
            return pertence(raiz, info);
        }
    }
    
    private boolean pertence(NoArvore<T> no, T info) {
        if (no.getInfo().equals(info)) {
            return true;
        } else {
            NoArvore<T> p = no.getPrimeiro();
            
            while (p != null) {
                if (pertence(p, info)) {
                    return true;
                }
                
                p = p.getProximo();
            }
            
            return false;
        }
    }
    
    @Override
    public String toString() {
        if (raiz == null) {
            return "";
        } else {
            return obterRepresentacaoTextual(raiz);
        }
    }
    
    private String obterRepresentacaoTextual(NoArvore<T> no) {
        String s = "<";
        
        s = s + no.getInfo();
        
        NoArvore<T> p = no.getPrimeiro();
        
        while (p != null) {
            s = s + obterRepresentacaoTextual(p);
            p = p.getProximo();
        }
        
        s = s + ">";
        
        return s;
    }
    
    public int contarNos() {
        int count = 0;
        
        count += contarNos(raiz);
        
        return count;
    }
    
    private int contarNos(NoArvore<T> no) {
        if (no == null) {
            return 0;
        } else {
            int countLeft = contarNos(no.getPrimeiro());
            int countRight = contarNos(no.getProximo());
            
            return 1 + countLeft + countRight;
        }
    }
}
