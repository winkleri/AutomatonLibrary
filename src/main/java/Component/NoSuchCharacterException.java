package Component;

/*
 * Author: Ilja Winkler
 * E-Mail: iljawinkler@googlemail.com
 * GitHub: winkleri
 *
 * Class description: A custom exception dealing with invalid characters such as characters that are not contained in a states alphabet
 *
 */
public class NoSuchCharacterException extends RuntimeException {
    public NoSuchCharacterException(String message, Throwable cause) {
        super(message, cause);
    }
}
