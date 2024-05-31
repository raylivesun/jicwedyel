package java.procedure;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;

public class checkBadCode {
     private int[] perfurme = {35, 45, 55, 65, 75, 85, 95, 155};
     private int[] values = {};    

    /**
     * @return the perfurme
     */
    public int[] getPerfurme() {
        return perfurme;
    }

    /**
     * @param perfurme the perfurme to set
     * @throws java.beans.PropertyVetoException
     */
    public void setPerfurme(int[] perfurme) throws PropertyVetoException {
        int[] oldPerfurme = this.perfurme;
        vetoableChangeSupport.fireVetoableChange(PROP_PERFURME, oldPerfurme, perfurme);
        this.perfurme = perfurme;
        propertyChangeSupport.firePropertyChange(PROP_PERFURME, oldPerfurme, perfurme);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    private final transient VetoableChangeSupport vetoableChangeSupport = new java.beans.VetoableChangeSupport(this);
    public static final String PROP_PERFURME = "perfurme";

    /**
     * @return the values
     */
    public int[] getValues() {
        return values;
    }

    /**
     * @param values the values to set
     * @throws java.beans.PropertyVetoException
     */
    public void setValues(int[] values) throws PropertyVetoException {
        int[] oldValues = this.values;
        vetoableChangeSupport.fireVetoableChange(PROP_VALUES, oldValues, values);
        this.values = values;
        propertyChangeSupport.firePropertyChange(PROP_VALUES, oldValues, values);
    }
    public static final String PROP_VALUES = "values";
}
