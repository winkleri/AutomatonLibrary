import Automata.FiniteAutomaton;
import Component.State;
import Component.Transition;

/*
 * Author: Ilja Winkler
 * E-Mail: iljawinkler@googlemail.com
 * GitHub: winkleri
 *
 * Class description: A controlling instance and user interface for starting the automaton generation
 */
void main() {
    FiniteAutomaton<State, Transition> fa = new FiniteAutomaton<>();
    State s0 = new State("s0");
    State s1 = new State("s1");
    Transition t0 = new Transition("t0", s0, s0);
    Transition t1 = new Transition("t1", s0, s1);
    fa.connectStates(s0, s0, '0');
    fa.connectStates(s0, s1, '1');
}
