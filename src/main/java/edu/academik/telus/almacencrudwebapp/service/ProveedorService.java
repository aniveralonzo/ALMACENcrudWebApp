/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.academik.telus.almacencrudwebapp.service;

import edu.academik.telus.almacencrudwebapp.entidad.Proveedor;
import java.util.ArrayList;
import java.util.List;

public class ProveedorService {

    public static List<Proveedor> proveedorList = new ArrayList<>();

    public static boolean agregarProveedor(Proveedor proveedor) {
        
        boolean existe = proveedorList.stream().anyMatch(p -> p.equals(proveedor));

        if (!existe) {
            proveedorList.add(proveedor);
        }

        return !existe;

    }

    public static Proveedor buscarProveedor(String codigo) {
        /*
        for (Proveedor p : proveedorList){
            if (p.getCodigo().equalsIgnoreCase(codigo)){
                return p;
            }
        }
        return null;*/
        
        return proveedorList.stream()
                .filter(p -> p.getCodigo().equalsIgnoreCase(codigo))
                .findFirst()
                .orElse(null);
    }
}