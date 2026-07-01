package dk.i1.sctp;
import java.net.SocketException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/**A one-to-one SCTP socket.
A one-to-one socket is used when you need a single endpoint connected to a single other endpoint.
This is typically used in client-like sockets.
A OneToOneSCTPSocket can accept inbound associations but at most one at the time.
Contrast with {@link OneToManySCTPSocket}.
<p>If used as a server socket (with listen()) then you cannot use receive() on
the server socket. You must instead use accept() to get a client socket and
then use receive() on that.
*/
public class OneToOneSCTPSocket extends SCTPSocket {
	/**Creates an unbound socket.
	*/
	public OneToOneSCTPSocket() throws SocketException {
		super(false);
	}
	/**Creates a socket bound to the specified port.
	 *@param port The SCTP port to bind to. The socket is bound to all available interfaces (subject to system policies)
	 */
	public OneToOneSCTPSocket(int port) throws SocketException {
		super(false,port);
	}
	
	/**Accept an incoming association.
	*/
	public OneToOneSCTPSocket accept() throws SocketException {
		return accept_native();
	}
	
	private native OneToOneSCTPSocket accept_native() throws SocketException;
}
