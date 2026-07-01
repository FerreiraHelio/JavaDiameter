package dk.i1.sctp;
public class SCTPNotificationShutdownEvent extends SCTPNotification {
	public final AssociationId sse_assoc_id;
	SCTPNotificationShutdownEvent(short flags,
	                              long sse_assoc_id)
	{
		super(flags,Type.SCTP_SHUTDOWN_EVENT);
		this.sse_assoc_id = new AssociationId(sse_assoc_id);
	}
}
