/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.academik.telus.almacencrudwebapp.controller;

import edu.academik.telus.almacencrudwebapp.entidad.Proveedor;
import edu.academik.telus.almacencrudwebapp.service.ProveedorService;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CrudController {
    ProveedorService proser;

    @GetMapping("/proveedor")
    public String get(Model model) {        
    model.addAttribute("proveedor", new Proveedor());
    return "crear";
    }    
        
    @PostMapping("/proveedor/crear")
    public String create(Model model, 
         /** @Valid**/  @ModelAttribute("proveedor") Proveedor proveedor/**, BindingResult bindingResult**/) {

//        if (!bindingResult.hasErrors()) {
        boolean agregado = ProveedorService.agregarProveedor(proveedor);
        if (agregado) {
            model.addAttribute("proveedor", new Proveedor());
            model.addAttribute("mensaje", "Proveedor agregado satisfactoriamente");
        } else {
            model.addAttribute("mensaje", "¡¡Proveedor ya existe!!");
        }
        return "crear";
    }
            
//}      
    
    @GetMapping("/proveedor/codigo/{codigo}")
    public String getByCodigo(Model model, @PathVariable("codigo") String codigo) {        
        var proveedor = ProveedorService.buscarProveedor(codigo);                
        model.addAttribute("proveedor", proveedor);

        return "modificar";
    }
    
     
    @PostMapping("/proveedor/modificar")
    public String edit(Model model, @ModelAttribute("proveedor") Proveedor proveedor) {       
        model.addAttribute("proveedor", new Proveedor());

        Proveedor pro=new Proveedor();
        pro.setNombreComercial("nombreComercial");
        pro.setContacto("contacto");
        pro.setDireccion("direccion");
        pro.setEmail("email");
        pro.setPais("pais");
        
        System.out.println("registro editado satisfatoriamente");        
//                RequestDispatcher requestDispatcher= request.getRequestDispatcher("/index.jsp");
//              requestDispatcher.forward(request,response);
        return "modificar";
    }    

    
    
    
    
    @GetMapping("/proveedor/eliminar/{codigo}")
    public String getDelete(Model model, @PathVariable("codigo") String codigo) {        
        
        var proveedor = ProveedorService.buscarProveedor(codigo);                
        proveedor.setEliminado(true);
        return "redirect:/index";
    }
}
