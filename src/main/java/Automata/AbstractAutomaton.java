package Automata;

import Component.State;
import Component.Transition;
import java.util.HashSet;

/*
 * Author: Ilja Winkler
 * E-Mail: iljawinkler@googlemail.com
 * GitHub: winkleri
 *
 * Class description: Defining universal properties of automata models (FA, PDA, TM)
 *
 */

public abstract class AbstractAutomaton<S, T> {
    //the set of states inside automaton
    private final HashSet<S> states;
    private final HashSet<T> transitions;
    private final HashSet<Character> alphabet;


    protected AbstractAutomaton() {
        this.states = new HashSet<>();
        this.transitions = new HashSet<>();
        this.alphabet = new HashSet<>();
    }

    /**
     * A method used when linking one source to one target state
     * @param source the state where the transition originates
     * @param target the state where the transition ends
     * @param character represents the abstract resource that is consumed in traversing the states
     */
    public abstract void connectStates(S source, S target, Character character);


    /**
     * Defines an automatons trait of being able to accept an input word
     * @param input is the initial input word
     * @return a boolean value defining if the input was accepted or not
     */
    public abstract boolean acceptWord(final String input);

    /**
     * Defines an automatons trait of transitioning from one state to another and consuming the word lying on the input tape by one character at a time
     * @param remainder the word on the input tape before attempting to transition the state
     * @return the String that is on the input tape after consuming a single character
     */
    public abstract String transition(final String remainder);

}
