package Automata;

import Component.NoSuchCharacterException;
import Component.NoSuchStateException;
import Component.State;
import Component.Transition;
import java.util.HashMap;


/*
 * Author: Ilja Winkler
 * E-Mail: iljawinkler@googlemail.com
 * GitHub: winkleri
 *
 * Class description: A simple implementation of a deterministic, finite automaton
 * TODO: Add implementation for non-determinism
 */

public class FiniteAutomaton<S,T> extends AbstractAutomaton<S, T> {
    private final HashMap<S, S> states;


    public FiniteAutomaton() {
        super();
        states = new HashMap<>();
    }

    /**
     * A method used when linking one source to one target state
     *
     * @param source    the state where the transition originates
     * @param target    the state where the transition ends
     * @param character represents the abstract resource that is consumed in traversing the states
     */
    @Override
    public void connectStates(final S source, final S target, final Character character) {
        //check validity of parameters and inform user adequately
        if(source == null || target == null) {
            throw new NoSuchStateException("Illegal connection attempted between states",
                    new IllegalArgumentException(
                            String.format("Parameter source was %s, parameter target was %s", source, target)));
        }
        if(character == null) {
            throw new NoSuchCharacterException("Illegal definition of character attempted",
                    new IllegalArgumentException(
                            String.format("Character was %s",  character)));
        }

        State src = (State) source;
        State tgt = (State) target;
        //TODO: fix generic implementation so that the state may be generic in its implementation altogether -> no cast required to state
        states.putIfAbsent(source, target);
        Transition t = new Transition("helloWorld!", src, tgt);
        src.addTransition(character, t);

    }

    /**
     * Defines an automatons trait of being able to accept an input word
     *
     * @param input is the initial input word
     * @return a boolean value defining if the input was accepted or not
     */
    @Override
    public boolean acceptWord(String input) {
        //TODO: implement proper return statement for acceptance
        // return (currentState.isFinal() && remainder.isEmpty())
        return false;
    }

    /**
     * Defines an automatons trait of transitioning from one state to another and consuming the word lying on the input tape by one character at a time
     *
     * @param remainder the word on the input tape before attempting to transition the state
     * @return the String that is on the input tape after consuming a single character
     */

    public String transition(String remainder) {
        //consumed character is the first character in line
        final Character consumed = remainder.toCharArray()[0];


        //TODO: implement current state -> new state logic


        //return new remainder
        return remainder.substring(1);
    }




}
