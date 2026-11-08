package UI;

//Version 1.0 Solo contiene la pantalla principal y los botones
//Se necesitan trabajar el area de precio, nombre de cliente y orden actual
//Tambien se deben implementar los otros menus


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class app extends Application{

    @Override 
        public void start(Stage principal){
            //Botones que se van a utilizar para el menu principal
            Button Platillos = new Button("Platillos");
            Platillos.setPrefSize(200, 80);
            Button Bebidas = new Button("Bebidas");
            Bebidas.setPrefSize(200, 80);
            Button Postres = new Button("Postres");
            Postres.setPrefSize(200, 80);
            Button Cobrar = new Button("Cobrar");
            Cobrar.setPrefSize(200, 80);
            Button ComandasSC = new Button("Comandas sin Cobrar");
            ComandasSC.setPrefSize(200, 80);
            //Gridpane es lo optimo para agregar los botones.
            GridPane pane = new GridPane();

            //Posicion (En pixeles) entre columnas
            pane.setHgap(10);
            //Posicion entre filas
            pane.setVgap(10);
            //Tamaño de las columnas, se espera un layout tipo matriz 3x3
            //Crearlas es mas eficiente con un for
            //Tambien permite crear el tamaño de las filas
            for (int i = 0; i < 3; i++) {
                ColumnConstraints columna = new ColumnConstraints();
                columna.setPercentWidth(33);
                RowConstraints fila = new RowConstraints();
                fila.setPercentHeight(33);
                pane.getColumnConstraints().addAll(columna);
                pane.getRowConstraints().add(fila);
                
            }
            //Se añaden al gridpane, se necesita getColumnConstraints para usar addAll y lo mismo con rows
            //Para formatear se utiliza add del pane, no de constraints
            //El primer numero es columna, el segundo fila, empieza en 0
            //--Primer columna--


            //--Segunda columna--
            pane.add(ComandasSC, 1, 0);
            pane.add(Cobrar, 1, 1);

            //--Tercera columna--
            pane.add(Platillos,2,0);
            pane.add(Bebidas,2,1);
            pane.add(Postres,2,2);
            
            //La escena donde se muestra el fondo blanco y los botones.
            //700x700 es el tamaño de la ventana.
            Scene fondo = new Scene(pane, 700, 700);
            //Titulo de la ventana, por ahora menu, se puede cambiar mas adelante.
            principal.setTitle("Menú");


            //Se deben quedar al final ya que causan la ejecucion
            principal.setScene(fondo);
            principal.show();
        }
        
        public static void main(String[] args) {
            launch(args);
        }
}
