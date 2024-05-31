package java.procedure;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;

public class getApplyToConsumerMethod {
     private int[] invest = {851200*5000};
     private int[] analysis = {};
     private int[] factory = {851200};
     private int[] multiples = {5000};
     private String birds = "love the lord with many happy";
     private String later = "friend dog";

    /**
     * @return the invest
     */
    public int[] getInvest() {
        return invest;
    }

    /**
     * @param invest the invest to set
     * @throws java.beans.PropertyVetoException
     */
    public void setInvest(int[] invest) throws PropertyVetoException {
        int[] oldInvest = this.invest;
        vetoableChangeSupport.fireVetoableChange(PROP_INVEST, oldInvest, invest);
        this.invest = invest;
        propertyChangeSupport.firePropertyChange(PROP_INVEST, oldInvest, invest);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    private final transient VetoableChangeSupport vetoableChangeSupport = new java.beans.VetoableChangeSupport(this);
    public static final String PROP_INVEST = "invest";

    /**
     * @return the analysis
     */
    public int[] getAnalysis() {
        return analysis;
    }

    /**
     * @param analysis the analysis to set
     * @throws java.beans.PropertyVetoException
     */
    public void setAnalysis(int[] analysis) throws PropertyVetoException {
        int[] oldAnalysis = this.analysis;
        vetoableChangeSupport.fireVetoableChange(PROP_ANALYSIS, oldAnalysis, analysis);
        this.analysis = analysis;
        propertyChangeSupport.firePropertyChange(PROP_ANALYSIS, oldAnalysis, analysis);
    }
    public static final String PROP_ANALYSIS = "analysis";

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
}
