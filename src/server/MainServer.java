/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author diegodominguez
 */
public class MainServer {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1234);
            
            Server svr = new Server();
            
            java.rmi.Naming.rebind("rmi://localhost:1234/RMIExample", svr);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
