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
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }
    
    public boolean estaVazia() {
        return raiz == null;
    }
    
    public boolean pertence(T info) {
        return pertence(raiz, info);
    }
    
    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return false;
        } else {
            return (no.getInfo().equals(info)) || 
                pertence(no.getLeft(), info) || 
                pertence(no.getRight(), info);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(arvorePre(raiz));
        
        return sb.toString();
    }
    
    private String arvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>";
        } else {
            StringBuilder sb = new StringBuilder();
            
            sb.append("<");
            sb.append(no.getInfo());  
            sb.append(arvorePre(no.getLeft()));
            sb.append(arvorePre(no.getRight()));
            sb.append(">");
            
            return sb.toString();
        }
    }
    
    public int contarNos() {
        int count = 0;
        
        count += contarNos(raiz);
        
        return count;
    }
    
    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        } else {
            int countLeft = contarNos(no.getLeft());
            int countRight = contarNos(no.getRight());
            
            return 1 + countLeft + countRight;
        }
    }
}
