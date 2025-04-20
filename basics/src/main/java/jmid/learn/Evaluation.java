package jmid.learn;

public abstract class Evaluation {
    private boolean active;

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    
    public abstract void execute(); // Méthode abstraite à implémenter par les sous-classes

}
