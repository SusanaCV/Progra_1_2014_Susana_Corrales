/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author Estudiante
 * 
 * 
 * 
 * //Realizar una clase,que permita cargar una direccion de email en el constructor,
        //luego en otro metodo mostrar el mensaje si contiene el caracter '@'.
 */
public class ejercicio1 {
    String email;
    
    public ejercicio1(String pEmail)
    {
        this.email=pEmail;
    }
    public String ValidarCorreo()
    {
        String mensaje="El correo no contiene @";
        for (int i =0; i < email.length(); i++){
            if (email.charAt(i)== '@')
            {
                mensaje= "El correo si contiene @";
            }
        }
        return mensaje;
    }
    
}
