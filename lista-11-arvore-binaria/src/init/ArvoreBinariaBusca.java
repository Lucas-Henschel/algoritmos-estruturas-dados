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
public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T>{

    public void inserir(T info) {
        setRaiz(inserir(getRaiz(), info));
    }
    
    private NoArvoreBinaria<T> inserir(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return new NoArvoreBinaria<>(info);
        }
        
        int compare = info.compareTo(no.getInfo());
        
        if (compare < 0) {
            no.setLeft(inserir(no.getLeft(), info));
        } else if (compare > 0) {
            no.setRight(inserir(no.getRight(), info));
        }
        
        return no;
    }

    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(getRaiz(), info);
    }
    
    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return null;
        }
        
        int compare = info.compareTo(no.getInfo());
        
        if (compare == 0) {
            return no;
        } else if (compare < 0) {
            return buscar(no.getLeft(), info);
        } else {
            return buscar(no.getRight(), info);
        }
    }
    
    public void retirar(T info) {
        setRaiz(retirar(getRaiz(), info));
    }
    
    private NoArvoreBinaria<T> retirar(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return null;
        }
        
        int compare = info.compareTo(no.getInfo());
        
        if (compare < 0) {
            no.setLeft(retirar(no.getLeft(), info));
        } else if (compare > 0) {
            no.setRight(retirar(no.getRight(), info));
        } else {
            if (no.getLeft() == null && no.getRight() == null) {
                return null;
            } else if (no.getLeft() == null) {
                return no.getRight();
            } else if (no.getRight() == null) {
                return no.getLeft();
            } else {
                NoArvoreBinaria<T> sucessor = extrairSucessor(no.getRight());
                
                no.setInfo(sucessor.getInfo());
                no.setRight(retirar(no.getRight(), sucessor.getInfo()));
            }
        }
        
        return no;
    }
    
    private NoArvoreBinaria<T> extrairSucessor(NoArvoreBinaria<T> excluir) {
        NoArvoreBinaria<T> atual = excluir;
        NoArvoreBinaria<T> anterior = null;

        while (atual.getLeft() != null) {
            anterior = atual;
            atual = atual.getLeft();
        }

        if (anterior != null) {
            anterior.setLeft(atual.getRight());
        } else {
            excluir = atual.getRight();
        }

        atual.setLeft(null);
        atual.setRight(null);
        
        return atual;
    } 
}
