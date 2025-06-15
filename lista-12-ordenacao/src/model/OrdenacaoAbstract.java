/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lucas
 */
public abstract class OrdenacaoAbstract<T extends Comparable<T>> {
    private T[] info;

    public T[] getInfo() {
        return info;
    }

    public void setInfo(T[] info) {
        this.info = info;
    }
    
    public void trocar(int pos1, int pos2) {
        T temp = info[pos1];
        
        info[pos1] = info[pos2];
        info[pos2] = temp;
    }
    
    public abstract void ordenar();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("[");
        
        for (int i = 0; i < info.length; i++) {
            if (info[i] != null) {
                if (i == info.length - 1) {
                    sb
                        .append(info[i]);
                } else {
                    sb
                        .append(info[i])
                        .append(",");
                }
            } else {
                break;
            }
        }
        
        sb.append("]");
        
        return sb.toString();
    }
}
