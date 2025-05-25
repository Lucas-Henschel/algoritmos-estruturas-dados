/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lucas
 */
public class NoArvoreBinaria<T> {
    private T info;
    private NoArvoreBinaria<T> left;
    private NoArvoreBinaria<T> right;

    public NoArvoreBinaria(T info) {
        this.info = info;
    }

    public NoArvoreBinaria(T info, NoArvoreBinaria<T> left, NoArvoreBinaria<T> right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvoreBinaria<T> getLeft() {
        return left;
    }

    public void setLeft(NoArvoreBinaria<T> left) {
        this.left = left;
    }

    public NoArvoreBinaria<T> getRight() {
        return right;
    }

    public void setRight(NoArvoreBinaria<T> right) {
        this.right = right;
    }
}
