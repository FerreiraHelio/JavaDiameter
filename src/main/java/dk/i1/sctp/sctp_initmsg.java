package dk.i1.sctp;

public class sctp_initmsg {
	/**This is an integer number representing the number of streams that the
	 *application wishes to be able to send to.  This number is confirmed
	 *in the SCTP_COMM_UP notification and must be verified since it is a
	 *negotiated number with the remote endpoint.  The default value of 0
	 *indicates to use the endpoint default value.
	 */
	public short sinit_num_ostreams;
	/**This value represents the maximum number of inbound streams the
	 *application is prepared to support.  This value is bounded by the
	 *actual implementation.  In other words the user MAY be able to
	 *support more streams than the Operating System.  In such a case, the
	 *Operating System limit overrides the value requested by the user.
	 *The default value of 0 indicates to use the endpoints default value.
	*/
	public short sinit_max_instreams;
	/**This integer specifies how many attempts the SCTP endpoint should
	 *make at resending the INIT.  This value overrides the system SCTP
	 *'Max.Init.Retransmits' value.  The default value of 0 indicates to
	 *use the endpoints default value.  This is normally set to the
	 *system's default 'Max.Init.Retransmit' value.
	*/
	public short sinit_max_attempts;
	/**This value represents the largest Time-Out or RTO value (in
	 *milliseconds) to use in attempting an INIT.  Normally the 'RTO.Max'
	 *is used to limit the doubling of the RTO upon timeout.  For the INIT
	 *message this value MAY override 'RTO.Max'.  This value MUST NOT
	 *influence 'RTO.Max' during data transmission and is only used to
	 *bound the initial setup time.  A default value of 0 indicates to use
	 *the endpoints default value.  This is normally set to the system's
	 *'RTO.Max' value (60 seconds).
	*/
	public short sinit_max_init_timeo;
}
