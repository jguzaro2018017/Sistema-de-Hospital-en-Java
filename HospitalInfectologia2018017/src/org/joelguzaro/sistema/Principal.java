/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joelguzaro.sistema;

import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;
import org.joelguzaro.controller.AreaController;
import org.joelguzaro.controller.CargosController;
import org.joelguzaro.controller.EspecialidadController;
import org.joelguzaro.controller.MedicoController;
import org.joelguzaro.controller.MenuPrincipalController;
import org.joelguzaro.controller.PacienteController;
import org.joelguzaro.controller.PerfilController;
import org.joelguzaro.controller.TelefonoMedicoController;
import org.joelguzaro.controller.TelefonoPacienteController;

/**
 *
 * @author programacion
 */
public class Principal extends Application {
    private final String PAQUETE_VISTA = "/org/joelguzaro/view/";
    private Stage escenarioPrincipal;
    private Scene escena;
    @Override
    public void start(Stage escenarioPrincipal) {
        this.escenarioPrincipal= escenarioPrincipal;
        escenarioPrincipal.setTitle("Hospital de Infectologia");
        menuPrincipal();
        escenarioPrincipal.getIcons().add(new Image("/org/joelguzaro/images/logo.png"));
        escenarioPrincipal.show();
    }
    
    public void menuPrincipal(){
        try{
            MenuPrincipalController menuPrincipal = (MenuPrincipalController)cambiarEscena("MenuPrincipalView.fxml",798,530);
            menuPrincipal.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void ventanaMedicos(){
        try{
            MedicoController medicoController = (MedicoController)cambiarEscena("MedicoView.fxml",867,714);
            medicoController.setEscenarioPrincipal(this);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaPerfil(){
        try{

            PerfilController perfilController = (PerfilController)cambiarEscena("ProfileView.fxml",600,400);
            perfilController.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaCargos(){
        try{
            CargosController carController = (CargosController)cambiarEscena("CargosView.fxml",499,399);
            carController.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        
    public void ventanaTelefonoMedico(){
        try{
            TelefonoMedicoController telMedicoController = (TelefonoMedicoController)cambiarEscena("TelefonoMedicoView.fxml",972,719);
            telMedicoController.setEscenarioPrincipal(this);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaPacientes(){
        try{
            PacienteController pacienteController = (PacienteController)cambiarEscena("PacienteView.fxml",1123,706);
            pacienteController.setEscenarioPrincipal(this);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaTelefonosPacientes(){
        try{
            TelefonoPacienteController telPacienteController = (TelefonoPacienteController)cambiarEscena("TelefonoPacienteView.fxml",746,540);
            telPacienteController.setEscenarioPrincipal(this);
        }catch (Exception e){
            e.printStackTrace();
        }    
    }
    
    public void ventanaEspecialidades(){
        try{
            EspecialidadController especialidadController  = (EspecialidadController)cambiarEscena("EspecialidadView.fxml",600,469);
            especialidadController.setEscenarioPrincipal(this);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaAreas(){
        try{
            AreaController areaController = (AreaController)cambiarEscena("AreaView.fxml",600,436);
            areaController.setEscenarioPrincipal(this);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public Initializable cambiarEscena(String fxml, int ancho, int alto) throws Exception{
        Initializable resultado = null;
        FXMLLoader cargadorFXML = new FXMLLoader();
        InputStream archivo = Principal.class.getResourceAsStream(PAQUETE_VISTA + fxml);
        cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory());
        cargadorFXML.setLocation(Principal.class.getResource(PAQUETE_VISTA + fxml));
        escena = new Scene((AnchorPane)cargadorFXML.load(archivo),ancho,alto);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        resultado = (Initializable)cargadorFXML.getController();
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
