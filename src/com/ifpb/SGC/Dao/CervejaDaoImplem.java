/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Cerveja;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramil
 */
public class CervejaDaoImplem implements CervejaDao{
    public Set<Cerveja> listaDeCervejas;
    private File arquivo;

    public CervejaDaoImplem() throws IOException {
        listaDeCervejas = new HashSet<>();
        arquivo = new File("cervejas");
        if (!arquivo.exists()) arquivo.createNewFile();
    }
    
    
    public Set<Cerveja> listartodos() throws FileNotFoundException, IOException, ClassNotFoundException{
        Set<Cerveja> cervejas;
        if(arquivo.length()>0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
            cervejas = (Set<Cerveja>)in.readObject();
            in.close();
        }else{
            cervejas = new HashSet<>();
        }
        
        return cervejas;
    }
    
    @Override
    public boolean salvar(Cerveja cerveja) throws IOException, FileNotFoundException, ClassNotFoundException {
        Set<Cerveja> cervejas = listartodos();
        cervejas.add(cerveja);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
        out.writeObject(cervejas);
        out.close();
        return true;
    }

    @Override
    public boolean Deletar(int codigo) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        Set<Cerveja> cervejas = listartodos();
       for(Cerveja c: cervejas){
           if (c.getCodigo()==codigo) {
               cervejas.remove(c);
               
               ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
                out.writeObject(cervejas);
                out.close();
                return true;
           }  
       }
       return false;
    }

    @Override
    public boolean editar(Cerveja cerveja) throws IOException, FileNotFoundException, ClassNotFoundException { 
        Set<Cerveja> cervejas = listartodos();
        for (Cerveja c : cervejas){
            if(c.getCodigo() == cerveja.getCodigo()){
                cervejas.remove(c);
                cervejas.add(cerveja);
                
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
                out.writeObject(cervejas);
                out.close();
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<Cerveja> listarCervejas() {
        try {
            Set<Cerveja> cervejas = listartodos();
            return cervejas;
        } catch (IOException ex) {
            Logger.getLogger(CervejaDaoImplem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CervejaDaoImplem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Cerveja buscarPorCodigo(int codigo) {
        try {
            Set<Cerveja> cervejas = listartodos();
            for(Cerveja c: cervejas){
            if (c.getCodigo() == codigo) {
                return c;
            }
        }
        } catch (IOException ex) {
            Logger.getLogger(CervejaDaoImplem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CervejaDaoImplem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
}
