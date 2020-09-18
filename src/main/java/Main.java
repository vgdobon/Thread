import com.tecnara.thread.ChildThread;


//    Thread de clase pública
//    extiende
//    Implementos de objetos Runnable
//    Un hilo es un hilo de ejecución en un programa. La máquina virtual Java permite que una aplicación tenga varios subprocesos de ejecución ejecutándose al mismo tiempo.
//    Cada hilo tiene una prioridad. Los subprocesos con mayor prioridad se ejecutan con preferencia a los subprocesos con menor prioridad.
//    Cada subproceso también puede estar marcado o no como un demonio.
//    Cuando el código que se ejecuta en algún subproceso crea un nuevo Threadobjeto, el nuevo subproceso tiene su prioridad establecida inicialmente igual a la prioridad del subproceso de creación, y es un subproceso de demonio si y solo si el subproceso de creación es un demonio.
//
//    Cuando se inicia una máquina virtual Java, suele haber un único hilo que no es demonio (que normalmente llama al método denominado mainde alguna clase designada).
//    La máquina virtual de Java continúa ejecutando subprocesos hasta que ocurre cualquiera de las siguientes situaciones:
//
//    Se ha llamado al exitmétodo de clase Runtimey el administrador de seguridad ha permitido que se lleve a cabo la operación de salida.
//    Todos los subprocesos que no son subprocesos daemon han muerto, ya sea al regresar de la llamada al runmétodo o al lanzar una excepción que se propaga más allá del run método.
//    Hay dos formas de crear un nuevo hilo de ejecución. Uno es declarar una clase como una subclase de Thread. Esta subclase debe anular el runmétodo de clase Thread.
//    Luego, se puede asignar e iniciar una instancia de la subclase.


public class Main {
    public static void main(String[] args) {
        ChildThread child1 = new ChildThread(1000);
        ChildThread child2 = new ChildThread(10000);
        ChildThread child3 = new ChildThread(5000);


        child1.start();
        System.out.println("Lanzado child1.start()");

        child2.start();
        System.out.println("Lanzado child2.start()");

        child3.start();
        System.out.println("Lanzado child3.start()");

        try {
            child2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Termina el Main");
    }
}
