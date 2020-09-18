package com.tecnara.thread;

public class ChildThread extends Thread{


    int segundos;

    public ChildThread(int segundos){

        this.segundos =  segundos;

    }

    @Override
    public void run(){

        System.out.println("Ejecutando el hilo" + this.getName()+" con el id: " + this.getId());

        try {
            this.join(segundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
