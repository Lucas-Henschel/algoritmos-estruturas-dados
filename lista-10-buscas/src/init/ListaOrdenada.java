/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package init;

/**
 *
 * @author lucas
 */
public class ListaOrdenada<T extends Comparable<T>> extends ListaAbstract<T> {
    private Object[] info = getInfo();

    @Override
    public void inserir(T value) {
        if (getTamanho() == info.length) {
            redimensionar();
            info = getInfo();
        }
        
        int i = 0;

        while (i < getTamanho() && value.compareTo((T) info[i]) > 0) {
            i++;
        }
        
        for (int j = getTamanho(); j > i; j--) {
            info[j] = info[j - 1];
        }
        
        info[i] = value;
        setTamanho(getTamanho() + 1);
    }

    @Override
    public int buscar(T valueToSearch) {
        int inicio = 0;
        int fim = getTamanho() - 1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            T valorMeio = (T) info[meio];

            int comparacao = valueToSearch.compareTo(valorMeio);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao > 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        return -1;
    }
}
