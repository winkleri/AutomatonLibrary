package Component;

/*
* Author: Ilja Winkler
* E-Mail: iljawinkler@googlemail.com
* GitHub: winkleri
*
* Class description: A custom exception tailored to illegal traversal operations
*
*/
public class IllegalTraversalException extends RuntimeException {

    public IllegalTraversalException(String message) {
        super(message);
    }
}
