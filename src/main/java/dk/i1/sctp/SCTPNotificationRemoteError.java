package dk.i1.sctp;

public class SCTPNotificationRemoteError extends SCTPNotification {
	public final short sre_error;
	public final AssociationId sre_assoc_id;
	//public byte[] sre_data
	SCTPNotificationRemoteError(short flags,
	                            short sre_error,
				    long sre_assoc_id)
	{
		super(flags,Type.SCTP_REMOTE_ERROR);
		this.sre_error = sre_error;
		this.sre_assoc_id = new AssociationId(sre_assoc_id);
	}
}
