package dk.i1.sctp;

public class sctp_sndrcvinfo {
	public short sinfo_stream;
	public short sinfo_ssn;
	public short sinfo_flags;
	public int sinfo_ppid;
	public int sinfo_context;
	public int sinfo_timetolive;
	public int sinfo_tsn;
	public int sinfo_cumtsn;
	public AssociationId sinfo_assoc_id;
	
	public sctp_sndrcvinfo() {
		this.sinfo_stream = 0;
		this.sinfo_ssn = 0;
		this.sinfo_flags = 0;
		this.sinfo_ppid = 0;
		this.sinfo_context = 0;
		this.sinfo_timetolive = 0;
		this.sinfo_tsn = 0;
		this.sinfo_cumtsn = 0;
		this.sinfo_assoc_id = AssociationId.default_;
	}
	public sctp_sndrcvinfo(sctp_sndrcvinfo sr) {
		this.sinfo_stream = sr.sinfo_stream;
		this.sinfo_ssn = sr.sinfo_ssn;
		this.sinfo_flags = sr.sinfo_flags;
		this.sinfo_ppid = sr.sinfo_ppid;
		this.sinfo_context = sr.sinfo_context;
		this.sinfo_timetolive = sr.sinfo_timetolive;
		this.sinfo_tsn = sr.sinfo_tsn;
		this.sinfo_cumtsn = sr.sinfo_cumtsn;
		this.sinfo_assoc_id = sr.sinfo_assoc_id;
	}
	
	static public final short SCTP_UNORDERED = 1;
	static public final short SCTP_ADDR_OVER = 2;
	static public final short SCTP_ABORT = 4;
	static public final short SCTP_EOF = 8;
	static public final short SCTP_SENDALL = 16;
		
}
