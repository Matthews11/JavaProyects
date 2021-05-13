/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Poo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */
public class Enormales {
    private String Nombre,Nombre2,Nombre3,Nombre4,Nombre5,Nombre6,Nombre7,Nombre8;
    private int DUI,DUI2,DUI3,DUI4,DUI5,DUI6,DUI7,DUI8;
    private int NIT,NIT2,NIT3,NIT4,NIT5,NIT6,NIT7,NIT8;
    private int SueldoBase,SueldoBase2,SueldoBase3,SueldoBase4,SueldoBase5,SueldoBase6,SueldoBase7,SueldoBase8;
    private int SueldoLiquido,SueldoLiquido2,SueldoLiquido3,SueldoLiquido4,SueldoLiquido5,SueldoLiquido6,SueldoLiquido7,SueldoLiquido8;
    private String TipoEmpleado,TipoEmpleado2,TipoEmpleado3,TipoEmpleado4,TipoEmpleado5,TipoEmpleado6,TipoEmpleado7,TipoEmpleado8;
    private int horas,horas2,horas3,horas4,horas5,horas6,horas7,horas8;
    private String fecha,fecha2,fecha3,fecha4,fecha5,fecha6,fecha7,fecha8 ;
    
     
    ArrayList<String> lista = new ArrayList<>();
    
    public void ingresar3()
    {
        Nombre="OSCAR";
        String a =  String.valueOf(DUI=2344342-2);
         lista.add(a);
        NIT=1234324-7;
        horas=20;
        SueldoBase=500;
        SueldoLiquido=400;
        TipoEmpleado="Gerente";
        fecha ="02/03/2021";
        
        Nombre2="Alexander";
        DUI2=2565643-8;
        NIT2=5676755-45;
        horas2=12;
        SueldoBase2=400;
        SueldoLiquido2=200;
        TipoEmpleado2="gefe";
        fecha ="22/04/2021";
        
         Nombre3="jared";
        DUI3=8764788-0;
        NIT3=156898-56;
        horas3=2;
        SueldoBase3=1000;
        SueldoLiquido3=500;
        fecha ="23/07/2020";
        TipoEmpleado3="Concerje ";
        
        
         Nombre4="Mathews";
        DUI4=1656968-8;
        NIT4=8796555-2;
        horas4=5;
        SueldoBase4=600;
        SueldoLiquido4=500;
        TipoEmpleado4="administrador";
        fecha ="3/09/2020";
        
         Nombre5="mateo";
        DUI5=3674285-3;
        NIT5=7541782-9;
        horas5=50;
        SueldoBase5=800;
        SueldoLiquido5=700;
        TipoEmpleado5="Electricista";
        fecha ="23/04/2020";
        
        
         Nombre6="Alejandra";
        DUI6=9876561-5;
        NIT6=987632-7;
        horas6=20;
        SueldoBase6=500;
        SueldoLiquido6=400;
        TipoEmpleado6="Gerente";
        fecha ="11/04/2020";
        
         Nombre7="irvin";
        DUI7=8748645-7;
        NIT7=6549888-7;
        horas7=40;
        SueldoBase7=800;
        SueldoLiquido7=600;
        TipoEmpleado7="secretario";
        fecha ="2/12/2020";
        
         Nombre="juan";
        DUI=6874554-7;
        NIT=3545499-9;
        horas=90;
        SueldoBase=2000;
        SueldoLiquido=1000;
        TipoEmpleado="Vigilante";
        fecha ="1/01/2021";
        
       
        mostrar();
            
            
         
    
    }
    
    public void mostrar ()
    {
        
             
           JOptionPane.showMessageDialog(null, "Los Datos del Libros son");
           for (int i=0; i < lista.size(); i++){
            
            if (i == 0 ){
           JOptionPane.showMessageDialog(null, " Nombre: "+lista.get(i));
       
            }
            
            if (i == 1)
            {
            JOptionPane.showMessageDialog(null, "DUI :"+lista.get(i));
            }
            
            if (i == 2 ){
           JOptionPane.showMessageDialog(null, "NIT:"+lista.get(i));
       
            }
            
            if (i == 3)
            {
            JOptionPane.showMessageDialog(null, "Horas:"+lista.get(i));
            }
            
            if (i == 4 ){
           JOptionPane.showMessageDialog(null, "Sueldo Base : "+lista.get(i));
       
            }   
            
             if (i == 5 ){
           JOptionPane.showMessageDialog(null, "Sueldo liquido : "+lista.get(i));
       
            }   
             
              if (i == 6 ){
           JOptionPane.showMessageDialog(null, "Tipo : "+lista.get(i));
       
            }   
              
              if (i == 7 ){
           JOptionPane.showMessageDialog(null, "Fecha: "+lista.get(i));
       
            }   
       }
       }
    
     
       }
       
  
    
     
 