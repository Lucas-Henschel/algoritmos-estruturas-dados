/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package init;

/**
 *
 * @author lucas
 */
public class ListaEstatica<T> extends ListaAbstract<T> {
    private Object[] info = getInfo();
    
    @Override
    public void inserir(T value) {
        if (getTamanho() == info.length) {
            redimensionar();
            info = getInfo();
        }
        
        info[getTamanho()] = value;
        setTamanho(getTamanho() + 1);
    }
    
    @Override
    public int buscar(T valueToSearch) {        
        for (int i = 0; i < getTamanho(); i++) {
            if (info[i].equals(valueToSearch)) {
                return i;
            }
        }
        
        return -1;
    }
}
