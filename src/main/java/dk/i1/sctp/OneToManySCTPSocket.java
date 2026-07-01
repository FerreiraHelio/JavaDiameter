package dk.i1.sctp;
import java.net.SocketException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/**A one-to-many SCTP socket.
A one-to-many socket is used when you need a single endpoint connected to multiple peers.
This is typically used in server-like sockets.
Contrast with {@link OneToOneSCTPSocket}.
*/
public class OneToManySCTPSocket extends SCTPSocket {
	/**Creates an unbound socket.
	*/
	public OneToManySCTPSocket() throws SocketException {
		super(true);
	}
	/**Creates a socket bound to the specified port.
	 *@param port The SCTP port to bind to. The socket is bound to all available interfaces (subject to system policies)
	 */
	public OneToManySCTPSocket(int port) throws SocketException {
		super(true,port);
	}
}
