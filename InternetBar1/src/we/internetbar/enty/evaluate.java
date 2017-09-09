package we.internetbar.enty;

import java.util.Date;

public class evaluate {
	private int uid;
	private int pid;
	private String efeel;
	private Date etime;
	private String erecord;
	public int getUid() {
		return uid;
	}
	@Override
	public String toString() {
		return "evaluate [uid=" + uid + ", pid=" + pid + ", efeel=" + efeel + ", etime=" + etime + ", erecord="
				+ erecord + "]";
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getEfeel() {
		return efeel;
	}
	public void setEfeel(String efeel) {
		this.efeel = efeel;
	}
	public Date getEtime() {
		return etime;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	public String getErecord() {
		return erecord;
	}
	public void setErecord(String erecord) {
		this.erecord = erecord;
	}
}
