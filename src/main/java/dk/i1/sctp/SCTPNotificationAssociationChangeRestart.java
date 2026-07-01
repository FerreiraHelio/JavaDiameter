package dk.i1.sctp;

/**A peer has been restarted.
The association to the peer was lost and then re-established. All
application-level state is lost at the other end. This can happen
if the peer rebotted without us noticing it, and the the peer
initiated a "new" association to us whiel we believed that the old
association stil existed.
*/
public class SCTPNotificationAssociationChangeRestart extends SCTPNotificationAssociationChange {
	SCTPNotificationAssociationChangeRestart(
		short flags,
		short sac_type,
		short sac_flags,
		short sac_state,
		short sac_error,
		short sac_outbound_streams,
		short sac_inbound_streams,
		long sac_assoc_id
	) {
		super(flags,
		      sac_type,
		      sac_flags,
		      State.SCTP_RESTART, //sac_state,
		      sac_error,
		      sac_outbound_streams,
		      sac_inbound_streams,
		      sac_assoc_id);
	}
}
