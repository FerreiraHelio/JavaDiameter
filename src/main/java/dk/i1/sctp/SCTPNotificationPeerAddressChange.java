package dk.i1.sctp;
import java.net.InetSocketAddress;
import java.net.InetAddress;

public class SCTPNotificationPeerAddressChange extends SCTPNotification {
	public final InetSocketAddress spc_aaddr;
	public static final int SCTP_ADDR_AVAILABLE = 1;
	public static final int SCTP_ADDR_UNREACHABLE = 2;
	public static final int SCTP_ADDR_REMOVED = 3;
	public static final int SCTP_ADDR_ADDED = 4;
	public static final int SCTP_ADDR_MADE_PRIM = 5;
	public static final int SCTP_ADDR_CONFIRMED = 6;
	public final int spc_state;
	public final int spc_error;
	AssociationId spc_assoc_id;
	SCTPNotificationPeerAddressChange(short flags,
	                                  byte[] spc_aaddr_addr,
	                                  int spc_aaddr_port,
	                                  int spc_state,
	                                  int spc_error,
	                                  long spc_assoc_id) throws Exception
	{
		super(flags,Type.SCTP_PEER_ADDR_CHANGE);
		this.spc_aaddr = new InetSocketAddress(InetAddress.getByAddress(spc_aaddr_addr),spc_aaddr_port);
		this.spc_state = spc_state;
		this.spc_error = spc_error;
		this.spc_assoc_id = new AssociationId(spc_assoc_id);
	}
}
