/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package init;

/**
 *
 * @author lucas
 */
public abstract class ListaAbstract<T> {
    private Object[] info;
    private int tamanho;

    public ListaAbstract() {
        this.tamanho = 0;
        this.info = new Object[10];
    }
    
    protected void redimensionar() {
        Object[] newInfo = new Object[info.length + 10];
        
        for (int i = 0; i < info.length; i++) {
            newInfo[i] = info[i];
        }
        
        info = newInfo;
    }

    public abstract void inserir(T value);
    
    public void exibir() {
        for (int i = 0; i < info.length; i++) {
            System.out.println("Posição = " + i + " - Valor: " + info[i]);
        }
    }
    
    public abstract int buscar(T valueToSearch);
    
    public void retirar(T value) {
        int indexValue = buscar(value);
        
        if (indexValue == -1) {
            return;
        }
        
        for (int i = indexValue; i < tamanho - 1; i++) {
            info[i] = info[i + 1];
        }
        
        tamanho--;
    }
    
    public void liberar() {
        tamanho = 0;
        info = (T[]) new Object[10];
    }
    
    public T obterElemento(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Posição não encontrada ou não está ocupada");
        }
        
        return (T) info[index];
    }
    
    public void inverter() {   
        for (int i = 0; i <= (tamanho / 2); i++) {  
            T startValue = obterElemento(i);
            T lastValue = obterElemento((tamanho - 1) - i);
            
            info[i] = lastValue;
            info[(tamanho - 1) - i] = startValue;
        }
    }
    
    public boolean estaVazia() {
        return tamanho == 0;
    }

    protected Object[] getInfo() {
        return info;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < info.length; i++) {
            if (tamanho - 1 == i) {
                sb.append(info[i]);
                break;
            }
            
            sb
                .append(info[i])
                .append(",");
        }
        
        return sb.toString();
    }
}
