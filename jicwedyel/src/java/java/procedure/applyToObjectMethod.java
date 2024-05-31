package java.procedure;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;

public class applyToObjectMethod {
    private int[] value = {851200*5000};
    private int[] factory = {851200};
    private int[] multiples = {5000};
    private String birds = "love the lord with many happy";
    private String spayden = "friend field";
    private String later = "friend man is friend of god and dog";
    private String cat = "friend false";  

    /**
     * @return the value
     */
    public int[] getValue() {
        return value;
    }

    /**
     * @param value the value to set
     * @throws java.beans.PropertyVetoException
     */
    public void setValue(int[] value) throws PropertyVetoException {
        int[] oldValue = this.value;
        vetoableChangeSupport.fireVetoableChange(PROP_VALUE, oldValue, value);
        this.value = value;
        propertyChangeSupport.firePropertyChange(PROP_VALUE, oldValue, value);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    private final transient VetoableChangeSupport vetoableChangeSupport = new java.beans.VetoableChangeSupport(this);
    public static final String PROP_VALUE = "value";

    /**
     * @return the factory
     */
    public int[] getFactory() {
        return factory;
    }

    /**
     * @param factory the factory to set
     * @throws java.beans.PropertyVetoException
     */
    public void setFactory(int[] factory) throws PropertyVetoException {
        int[] oldFactory = this.factory;
        vetoableChangeSupport.fireVetoableChange(PROP_FACTORY, oldFactory, factory);
        this.factory = factory;
        propertyChangeSupport.firePropertyChange(PROP_FACTORY, oldFactory, factory);
    }
    public static final String PROP_FACTORY = "factory";

    /**
     * @return the multiples
     */
    public int[] getMultiples() {
        return multiples;
    }

    /**
     * @param multiples the multiples to set
     * @throws java.beans.PropertyVetoException
     */
    public void setMultiples(int[] multiples) throws PropertyVetoException {
        int[] oldMultiples = this.multiples;
        vetoableChangeSupport.fireVetoableChange(PROP_MULTIPLES, oldMultiples, multiples);
        this.multiples = multiples;
        propertyChangeSupport.firePropertyChange(PROP_MULTIPLES, oldMultiples, multiples);
    }
    public static final String PROP_MULTIPLES = "multiples";

    /**
     * @return the birds
     */
    public String getBirds() {
        return birds;
    }

    /**
     * @param birds the birds to set
     * @throws java.beans.PropertyVetoException
     */
    public void setBirds(String birds) throws PropertyVetoException {
        java.lang.String oldBirds = this.birds;
        vetoableChangeSupport.fireVetoableChange(PROP_BIRDS, oldBirds, birds);
        this.birds = birds;
        propertyChangeSupport.firePropertyChange(PROP_BIRDS, oldBirds, birds);
    }
    public static final String PROP_BIRDS = "birds";

    /**
     * @return the spayden
     */
    public String getSpayden() {
        return spayden;
    }

    /**
     * @param spayden the spayden to set
     * @throws java.beans.PropertyVetoException
     */
    public void setSpayden(String spayden) throws PropertyVetoException {
        java.lang.String oldSpayden = this.spayden;
        vetoableChangeSupport.fireVetoableChange(PROP_SPAYDEN, oldSpayden, spayden);
        this.spayden = spayden;
        propertyChangeSupport.firePropertyChange(PROP_SPAYDEN, oldSpayden, spayden);
    }
    public static final String PROP_SPAYDEN = "spayden";

    /**
     * @return the later
     */
    public String getLater() {
        return later;
    }

    /**
     * @param later the later to set
     * @throws java.beans.PropertyVetoException
     */
    public void setLater(String later) throws PropertyVetoException {
        java.lang.String oldLater = this.later;
        vetoableChangeSupport.fireVetoableChange(PROP_LATER, oldLater, later);
        this.later = later;
        propertyChangeSupport.firePropertyChange(PROP_LATER, oldLater, later);
    }
    public static final String PROP_LATER = "later";

    /**
     * @return the cat
     */
    public String getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     * @throws java.beans.PropertyVetoException
     */
    public void setCat(String cat) throws PropertyVetoException {
        java.lang.String oldCat = this.cat;
        vetoableChangeSupport.fireVetoableChange(PROP_CAT, oldCat, cat);
        this.cat = cat;
        propertyChangeSupport.firePropertyChange(PROP_CAT, oldCat, cat);
    }
    public static final String PROP_CAT = "cat";
}
