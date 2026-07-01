package dk.i1.sctp;

public abstract class SCTPNotification extends SCTPChunk {
	public final short flags;
	public enum Type {
		SCTP_ASSOC_CHANGE,
		SCTP_PEER_ADDR_CHANGE,
		SCTP_REMOTE_ERROR,
		SCTP_SEND_FAILED,
		SCTP_SHUTDOWN_EVENT,
		SCTP_ADAPTATION_INDICATION,
		SCTP_PARTIAL_DELIVERY_EVENT
	};
	public final Type type;
	SCTPNotification(short flags, Type type) {
		super();
		this.flags = flags;
		this.type = type;
	}
}
