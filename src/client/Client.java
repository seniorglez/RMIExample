/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.RemoteInterface;

/**
 *
 * @author diegodominguez
 */
public class Client {
    public static void main(String[] args) throws NotBoundException {
        try {
	       RemoteInterface mir = (RemoteInterface)java.rmi.Naming.
			   lookup("rmi://localhost:1234/RMIExample");
	   
     for (int i=1;i<=mir.methodC();i++) 
         mir.methodB();
     System.out.println(mir.methodA());
     } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
