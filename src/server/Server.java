/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author diegodominguez
 */
public class Server extends UnicastRemoteObject implements RemoteInterface {
    
    public Server() throws RemoteException{
        super();
        
    }

    @Override
    public String methodA() {
        return("method A return");
    }

    @Override
    public void methodB() {
        System.out.println("Hi from methodB");
    }

    @Override
    public int methodC() {
        return 9;
    }

    
}
