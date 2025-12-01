package Component;

import java.util.HashSet;
import java.util.Set;

public class State {
    private final HashSet<Transition> transitions;
    private static int counter = 0;
    private final String name;
    //unique identifier
    private final int id;

    public State(String name) {
        this.name = name;
        this.transitions = new HashSet<Transition>();
        this.id = ++counter;
    }

    //accessors
    public String getName() {
        return name;
    }
    public HashSet<Transition> getTransitions() {
        return new HashSet<>(Set.copyOf(transitions));
    }

    /**
     * Adds a transition between the current state and another state. The state the method is called upon
     * is automatically deemed the source state.
     * @param transition to be added to the state
     * @param target is the state that the transition points to
     */
    public void addTransition(Transition transition, State target) {
        if(transition == null || target == null) throw new IllegalArgumentException("Illegal parameters. State or transition cannot be null");
        //check if transition already exists
        if(transitions.contains(transition))  {
            System.err.println("Component.Transition already exists!");
            return;
        }
        //add transition to set to avoid duplicate edge objects
        transitions.add(transition);
        //set fields of transition to properly encapsulate source/target relationship
        transition.setSource(this);
        transition.setTarget(target);
    }
}
