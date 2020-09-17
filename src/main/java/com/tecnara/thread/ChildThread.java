package com.tecnara.thread;

public class ChildThread extends Thread{

    @Override
    public void run(){
        System.out.println("Ejecutando el hilo con el id: " + this.getId());
    }
}
