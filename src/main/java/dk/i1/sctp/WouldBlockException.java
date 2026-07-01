package dk.i1.sctp;
/**This exception is thrown when an operation on an SCTPSocket would block and the socket is in non-blocking mode.
 */
public class WouldBlockException extends Exception {
	public WouldBlockException(String msg) {
		super(msg);
	}
}
