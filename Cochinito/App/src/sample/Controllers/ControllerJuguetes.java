package sample.Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import sample.Modelos.Producto;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

public class ControllerJuguetes implements Initializable {
    @FXML ImageView lblCerrar, lblRegresar;
    @FXML JFXButton btnMaxStil, btnBarbie, btnCarros, btnCasa, btnAvion, btnComprar;

    Main m=new Main();
    LinkedList<Producto> productos=new LinkedList<>();
    int cantidad=1, pos=0;
    boolean existe=false;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblCerrar.setOnMouseClicked(event ->{
            System.exit(0);
        });

        lblRegresar.setOnMouseClicked(event -> {
            ControllerTiendita controllerTiendita=new ControllerTiendita();
            m.abrirEscena1(event,"tiendita.fxml",controllerTiendita,"Ahorro Virtual");
        });

        btnMaxStil.setOnAction(event -> {
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Max Steel")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Max Steel",150,1, 150));
            else {
                cantidad++;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnAvion.setOnAction(event -> {
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Helicoptero")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Helicoptero",500,1, 500));
            else {
                cantidad++;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnBarbie.setOnAction(event -> {
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Barbie")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Barbie",150,1, 150));
            else {
                cantidad++;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnCarros.setOnAction(event -> {
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Carrito")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Carrito",50,1, 50));
            else {
                cantidad++;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnCasa.setOnAction(event -> {
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Casa Barbie")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Casa Barbie",300,1, 300));
            else {
                cantidad++;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });
    }
}
