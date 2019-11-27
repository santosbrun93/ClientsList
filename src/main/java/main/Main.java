package main;

import javafx.application.Application;
import javafx.stage.Stage;
import model.Cliente;
import rn.ClienteRN;
import visual.*;
import dao.*;
import connection.*;
import controller.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Cliente cliente = new Cliente();

    ClienteRN rn = new ClienteRN();

    ConnectionFactory con = new ConnectionFactory();

    ClienteDAO dao = new ClienteDAO();



    @Override
    public void start(Stage primaryStage) {

        MenuPrincipal home = new MenuPrincipal();

    }
}
