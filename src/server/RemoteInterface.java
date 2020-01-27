/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author diegodominguez
 */
public interface RemoteInterface extends Remote{
    public String methodA() throws RemoteException;
    
    public void methodB() throws RemoteException;
    
    public int methodC() throws RemoteException;
    
    
}
