package Automata;

import Component.State;
import Component.Transition;

import java.util.HashSet;
import java.util.Objects;

public class AbstractAutomaton {
    private final HashSet<State> states;
    private final HashSet<Transition> transitions;

    protected AbstractAutomaton() {
        this.states = new HashSet<>();
        this.transitions = new HashSet<>();
    }

    /**
     * Adds an existing state object to the automaton with certain properties
      * @param state to be added to the underlying automaton
     */
    public void addState(State state) {
        Objects.requireNonNull(state);

        states.add(state);
    }

    /**
     * Adds an existing transition object to the automaton
     * @param transition to be added to the underlying automaton
     */
    public void addTransition(Transition transition) {
        Objects.requireNonNull(transition);
        transitions.add(transition);
    }
}
