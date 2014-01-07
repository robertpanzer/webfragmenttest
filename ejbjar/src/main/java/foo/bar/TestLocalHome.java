package foo.bar;

public interface TestLocalHome extends javax.ejb.EJBHome {

	TestLocal create() throws javax.ejb.CreateException, java.rmi.RemoteException;

}