package java.procedure;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;

public class getReturnType {
    private int[] popcycles = {55, 64, 68, 80, 82, 84, 12};
    private int[] smallview = {55, 64, 68, 80, 82, 84, 12};
    private int[] icecycles = {55, 64, 68, 80, 82, 84, 12};

    /**
     * @return the popcycles
     */
    public int[] getPopcycles() {
        return popcycles;
    }

    /**
     * @param popcycles the popcycles to set
     * @throws java.beans.PropertyVetoException
     */
    public void setPopcycles(int[] popcycles) throws PropertyVetoException {
        int[] oldPopcycles = this.popcycles;
        vetoableChangeSupport.fireVetoableChange(PROP_POPCYCLES, oldPopcycles, popcycles);
        this.popcycles = popcycles;
        propertyChangeSupport.firePropertyChange(PROP_POPCYCLES, oldPopcycles, popcycles);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    private final transient VetoableChangeSupport vetoableChangeSupport = new java.beans.VetoableChangeSupport(this);
    public static final String PROP_POPCYCLES = "popcycles";

    /**
     * @return the smallview
     */
    public int[] getSmallview() {
        return smallview;
    }

    /**
     * @param smallview the smallview to set
     * @throws java.beans.PropertyVetoException
     */
    public void setSmallview(int[] smallview) throws PropertyVetoException {
        int[] oldSmallview = this.smallview;
        vetoableChangeSupport.fireVetoableChange(PROP_SMALLVIEW, oldSmallview, smallview);
        this.smallview = smallview;
        propertyChangeSupport.firePropertyChange(PROP_SMALLVIEW, oldSmallview, smallview);
    }
    public static final String PROP_SMALLVIEW = "smallview";

    /**
     * @return the icecycles
     */
    public int[] getIcecycles() {
        return icecycles;
    }

    /**
     * @param icecycles the icecycles to set
     * @throws java.beans.PropertyVetoException
     */
    public void setIcecycles(int[] icecycles) throws PropertyVetoException {
        int[] oldIcecycles = this.icecycles;
        vetoableChangeSupport.fireVetoableChange(PROP_ICECYCLES, oldIcecycles, icecycles);
        this.icecycles = icecycles;
        propertyChangeSupport.firePropertyChange(PROP_ICECYCLES, oldIcecycles, icecycles);
    }
    public static final String PROP_ICECYCLES = "icecycles";
}
