package dk.i1.sctp;
public class SCTPNotificationAdaptationIndication extends SCTPNotification {
	/**The 32-bit array (in network order) of the adaptation layer indication*/
	public final int sai_adaptation_ind;
	/**The association that sent the adaptation notification*/
	public final AssociationId sai_assoc_id;
	SCTPNotificationAdaptationIndication(short flags,
	                                     int sai_adaptation_ind,
	                                     long sai_assoc_id)
	{
		super(flags,Type.SCTP_ADAPTATION_INDICATION);
		this.sai_adaptation_ind = sai_adaptation_ind;
		this.sai_assoc_id = new AssociationId(sai_assoc_id);
	}
}
