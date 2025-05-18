/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author lhenschel
 */
public class ListaEncadeada<T> {
    private NoLista<T> primeiro;
    private NoLista<T> ultimo;

    public ListaEncadeada() {
        primeiro = null;
        ultimo = null;
    }

    public NoLista getPrimeiro() {
        return primeiro;
    }

    public NoLista<T> getUltimo() {
        return ultimo;
    }
    
    public void inserir(T value) {
        NoLista<T> no = new NoLista<>(value);
        
        if (estaVazia()) {
            this.primeiro = no;
        } else {
            this.ultimo.setProximo(no);
        }
        
        this.ultimo = no;
    }
    
    public boolean estaVazia() {
        return primeiro == null;
    }
    
    public NoLista<T> buscar(T info) {
        NoLista<T> current = primeiro;
        
        while (current != null) {
            if (current.getInfo().equals(info)) {
                return current;
            }
            
            current = current.getProximo();
        }
        
        return null;
    }
    
    public void exibir() {
        NoLista<T> current = primeiro;
        
        while (current != null) {
            System.out.println(current.getInfo() + " -> ");
            current = current.getProximo();
        }
        
        System.out.println("null");
    }
    
    public void retirar(T value) {
        NoLista<T> last = null;
        NoLista<T> current = primeiro;
        
        while (current != null && !current.getInfo().equals(value)) {
            last = current;
            current = current.getProximo();
        }
        
        if (current != null) {
            if (last == null) {
                primeiro = current.getProximo();
            } else {
                last.setProximo(current.getProximo());
            }
        }
    }
    
    public int obterComprimento() {
        int count = 0;
        NoLista<T> current = primeiro;
        
        while (current != null) {
            count++;
            current = current.getProximo();
        }
        
        return count;
    }
    
    public NoLista<T> obterNo(int index) {
        if (index < 0 || index >= obterComprimento()) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        
        int count = 0;
        NoLista<T> current = primeiro;
        
        while (count < index) {
            count++;
            current = current.getProximo();
        }
        
        return current;
    }
    
    public void inserirNoFinal(T value) {
        this.ultimo = new NoLista<>(value);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> current = primeiro;
        
        while (current != null) {
            sb.append(current.getInfo())
                .append(" -> ");
            
            current = current.getProximo();
        }
        
        sb.append("null");
        
        return sb.toString();
    }
}
