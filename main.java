import UI.app;

/*
Autores:
Luis Alberto Dominguez Tejeda
Andres Enrique Jaime de la Rosa

Version: 1.1
Cambios aplicados(Poner lo mismo en el commit):
Cambio de nombre de main a Main, se añadio el main del UI para que pueda correr 
 */
public class Main{

    public static void main(String[] args){
        //Se debe de importar y correr en main
        //El UI no se puede correr en el main de la app
        System.out.println("Hola");
        app.main(args);
    }
}
