package dk.i1.sctp;

public class SCTPNotificationSendFailed extends SCTPNotification {
	public final int ssf_error;
	public final sctp_sndrcvinfo ssf_info;
	public final byte[] data;
	SCTPNotificationSendFailed(short flags,
	                           int ssf_error,
	                           sctp_sndrcvinfo ssf_info,
				   byte[] data
				  )
	{
		super(flags,Type.SCTP_SEND_FAILED);
		this.ssf_error = ssf_error;
		this.ssf_info = ssf_info;
		this.data = data;
	}
}
