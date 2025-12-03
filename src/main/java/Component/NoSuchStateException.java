package Component;

/*
 * Author: Ilja Winkler
 * E-Mail: iljawinkler@googlemail.com
 * GitHub: winkleri
 *
 * Class description: An exception dealing with occurrences of invalid states such as when passing it as a parameter
 *
 */

public class NoSuchStateException extends RuntimeException {
    public NoSuchStateException(String message, Throwable cause) {
        super(message,cause);
    }
}
