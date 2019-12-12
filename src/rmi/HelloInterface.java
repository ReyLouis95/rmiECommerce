package rmi;
import java.rmi.*;

public interface HelloInterface extends Remote{
public String echo() throws RemoteException;
}
