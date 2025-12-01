package Component;

import java.util.HashSet;

public class Transition {
    private final String name;
    private final HashSet<String> symbols;
    private State source;
    private State target;

    private Transition(String name, State source, State target) {
        this.name = name;
        this.source = source;
        this.target = target;
        this.symbols = new HashSet<>();
    }

    public Transition(String name) {
        this(name, null, null);
    }

    //accessors
    public String getName() { return this.name; }
    public State getSource() { return this.source; }
    public State getTarget() { return this.target; }
    public HashSet<String> getSymbols() { return this.symbols; }

    //mutators
    public void setSource(State source) { this.source = source; }
    public void setTarget(State target) { this.target = target; }

    /**
     * Returns a boolean value stating if the source state and target state are identical
     * @return yes if source == target
     */
    public boolean isLoop() {
        return this.source.equals(this.target);
    }

    /**
     * Prints out a transition to the console which contains the information
     * @return a formatted String containing the information 'name: source -> target'
     */
    @Override
    public String toString() {
        return String.format("%s: %s -> %s", name, source, target);
    }
}
