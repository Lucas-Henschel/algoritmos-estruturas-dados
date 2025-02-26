/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package init;

/**
 *
 * @author lhenschel
 */
public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica(int[] info, int tamanho) {
        this.info = info;
        this.tamanho = tamanho;
    }
    
    private void redimensionar() {
        int[] newInfo = new int[info.length + 10];
        
        for (int i = 0; i < info.length; i++) {
            newInfo[i] = info[i];
        }
        
        info = newInfo;
    }

    public void inserir(int value) {
        if (tamanho == info.length) {
            redimensionar();
        }
        
        info[tamanho] = value;
        tamanho++;
    }
    
    public void exibir() {
        for (int i = 0; i < info.length; i++) {
            System.out.println("Posição = " + i + " - Valor: " + info[i]);
        }
    }
    
    public int buscar(int valueToSearch) {
        int index = -1;
        
        for (int i = 0; i < info.length; i++) {
            if (valueToSearch == info[i]) {
                index = i;
            }
        }
        
        return index;
    }
    
    public void retirar(int value) {
        int indexValue = buscar(value);
        
        for (int i = 0; i < info.length; i++) {
            if (buscar(info[i]) >= indexValue) {
                info[i - 1] = info[i];
            }
        }
        
        tamanho--;
    }
    
    public void liberar() {
        tamanho = 0;
        info = new int[10];
    }
    
    public int obterElemento(int index) {
        int value = -1;
        
        for (int i = 0; i < info.length; i++) {
            if (i == index) {
                value = info[i];
            }
        }
        
        if (value == -1 || value == 0) {
            throw new IndexOutOfBoundsException("Posição não encontrada ou não está ocupada");
        }
        
        return value;
    }
    
    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
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
