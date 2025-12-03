package Component;

import java.util.HashSet;

/*
 * Author: Ilja Winkler
 * E-Mail: iljawinkler@googlemail.com
 * GitHub: winkleri
 *
 * Class description: An arc pointing from one source state to one target state.
 * Characters are defined as resources that get consumed when traversing said arc.
 */

public class Transition {
    private final String name;
    private final HashSet<Character> alphabetSubset;
    private State source;
    private State target;

    public Transition(String name, State source, State target) {
        this.name = name;
        this.source = source;
        this.target = target;
        this.alphabetSubset = new HashSet<>();
    }

    //accessors
    public String getName() { return this.name; }
    public State getSource() { return this.source; }
    public State getTarget() { return this.target; }
    public HashSet<Character> getAlphabetSubset() { return this.alphabetSubset; }

    //mutators
    public void setSource(State source) {
        if(source == null) {
            throw new NoSuchStateException("Deletion of states is only possible via the deleteTransition() method!",
                    new IllegalTraversalException(
                            String.format("source was %s", source)));
        }

        this.source = source;
    }
    public void setTarget(State target) {
        if(target == null) {
            throw new NoSuchStateException("Deletion of states is only possible via the deleteTransition() method!",
                    new IllegalTraversalException(
                            String.format("source was %s", target)));
        }
        this.target = target;
    }

    /**
     * Deletes all necessary information about a state and resolves any existing dependencies to avoid conflicts
     */
    public void deleteTransition() {
        alphabetSubset.forEach((character) -> {
            source.getTransitions().remove(character);
        });
        this.source = null;
        this.target = null;
        this.alphabetSubset.clear();
    }

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
