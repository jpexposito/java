package es.ejemplos.jpexposito.modelo;

import java.util.ArrayList;

import es.ejemplos.jpexposito.api.Usuario;
import es.ejemplos.jpexposito.excepcion.FicheroException;

public class UsuarioModelo {
   Fichero persistencia;

   /**
    * Constructor por defecto 
    */
   public UsuarioModelo() {
      persistencia = new Fichero();
   }
   

   /**
    * Metodo encargado de realizar la insercion de un usuario
    * @param usuario a insertar
    * @throws FicheroException controlada
    */
   public void insertar(Usuario usuario) throws FicheroException {
      persistencia.insertar(usuario);
   }

   /**
    * Metodo encargado de realizar la eleminacion de un usuario
    * @param usuario a eliminar
    * @throws FicheroException controlada
    */
   public void eleminar(Usuario usuario) throws FicheroException {
      persistencia.eliminar(usuario);
   }

   /**
    * Metodo encargado de realizar la modificacion de un usuario
    * @param usuario a modificar
    */
   public void modificar(Usuario usuario) {
     
   }

   /**
    * Funcion encargada de realizar la busqueda de un usuario
    * @param identificador del usuario
    * @return Usuario a buscar
    */
   public Usuario buscar(String identificador) {
     Usuario usuario = null;
     usuario = persistencia.buscar(identificador);
     return usuario;
   }
}
