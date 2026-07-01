package dk.i1.sctp;
/**Notification that an association has been created, lost or not created.
This notification is further subclasses into:
<pre>
{@link SCTPNotificationAssociationChangeCommUp}
{@link SCTPNotificationAssociationChangeCommLost}
{@link SCTPNotificationAssociationChangeRestart}
{@link SCTPNotificationAssociationChangeShutdownComplete}
{@link SCTPNotificationAssociationChangeCantStartAssociation}
</pre>
*/
public abstract class SCTPNotificationAssociationChange extends SCTPNotification {
	public final short sac_type;
	public final short sac_flags;
	//public int sac_length;
	public enum State {
		SCTP_COMM_UP,
		SCTP_COMM_LOST,
		SCTP_RESTART,
		SCTP_SHUTDOWN_COMP,
		SCTP_CANT_STR_ASSOC
	};
	public final State sac_state;
	public final short sac_error;
	/**Maximum number of outbound streams*/
	public final short sac_outbound_streams;
	/**Maximum number of inbound streams*/
	public final short sac_inbound_streams;
	public final AssociationId sac_assoc_id;
	//public byte[] sac_info;
	SCTPNotificationAssociationChange(
		short flags,
		short sac_type,
		short sac_flags,
		State sac_state,
		short sac_error,
		short sac_outbound_streams,
		short sac_inbound_streams,
		long sac_assoc_id
	) {
		super(flags,Type.SCTP_ASSOC_CHANGE);
		this.sac_type = sac_type;
		this.sac_flags = sac_flags;
		this.sac_state = sac_state;
		this.sac_error = sac_error;
		this.sac_outbound_streams = sac_outbound_streams;
		this.sac_inbound_streams = sac_inbound_streams;
		this.sac_assoc_id = new AssociationId(sac_assoc_id);
	}
}
