
package org.joelguzaro.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.joelguzaro.sistema.Principal;


public class MenuPrincipalController implements Initializable {
    private Principal escenarioPrincipal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void ventanaMedicos(){
        escenarioPrincipal.ventanaMedicos();
    }
    
    public void ventanaPerfil(){
        escenarioPrincipal.ventanaPerfil();
    }
    
    public void ventanaCargos(){
        escenarioPrincipal.ventanaCargos();
    }
    
    public void ventanaTelefonoMedico(){
        escenarioPrincipal.ventanaTelefonoMedico();
    }
    
    public void ventanaPacientes(){
        escenarioPrincipal.ventanaPacientes();
    }
    
    public void ventanaTelefonosPacientes(){
        escenarioPrincipal.ventanaTelefonosPacientes();
    }
    
    public void ventanaEspecialidades(){
        escenarioPrincipal.ventanaEspecialidades();
    }
    
    public void ventanaAreas(){
        escenarioPrincipal.ventanaAreas();
    }
}
