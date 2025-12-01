package Automata;

public class FiniteAutomaton extends AbstractAutomaton {

    //TODO: properly implement starting and accepting states
    public FiniteAutomaton() {
        super();
    }



    //TODO: properly think through automaton traversal and especially involved methods
//    public boolean accept(String word) {
//        return traverse(word).equals(ending);
//    }
//
//
//    public State traverse(String remaining) {
//        String firstChar = remaining.substring(0,1);
//
//
//
//        return current.getTransitions()
//                .stream()
//                .filter(t -> t.getSymbols()
//                        .stream()
//                        .anyMatch(substr -> substr.equals(firstChar)))
//                .findAny()
//                .map(Transition::getTarget)
//                .orElse(null);
//
//    }
}
