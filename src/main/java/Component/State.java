package Component;

import java.util.HashMap;

/*
 * Author: Ilja Winkler
 * E-Mail: iljawinkler@googlemail.com
 * GitHub: winkleri
 *
 * Class description: An object representing a node to be traversed inside an automaton.
 * An active automaton is always inside a given state. States can either be starting states, regular states or final states
 */

public class State {
    private final HashMap<Character, Transition> transitions;
    private final String name;

    public State(String name) {
        this.name = name;
        this.transitions = new HashMap<>();
    }

    public void addTransition(final Character character, final Transition transition) {
        if(character == null) throw new NoSuchCharacterException("An invalid character was tried to be added to a transition.", new IllegalArgumentException("Character was null"));
        //TODO: handle exception gracefully

        // if(transition == null) throw new IllegalArgumentException("An invalid target state was tried to be added to a transition", new IllegalArgumentException("State was null"));
        transitions.putIfAbsent(character, transition);
    }

    public HashMap<Character, Transition> getTransitions() {
        return transitions;
    }

}
