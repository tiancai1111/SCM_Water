package pojo;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Journal {
    /**
     * 日志Id
     */
    private Integer journalid;

    /**
     * 日志时间
     */
    private Date journaldate;

    /**
     * 日志操作
     */
    private String journaloperatio;

    /**
     *  操作人员
     */
    private String journaloperationame;

    /**
     * 备注
     */
    private String journalremarks;

    public Integer getJournalid() {
        return journalid;
    }

    public void setJournalid(Integer journalid) {
        this.journalid = journalid;
    }

    public Date getJournaldate() {
        return journaldate;
    }

    public void setJournaldate(Date journaldate) {
        this.journaldate = journaldate;
    }

    public String getJournaloperatio() {
        return journaloperatio;
    }

    public void setJournaloperatio(String journaloperatio) {
        this.journaloperatio = journaloperatio == null ? null : journaloperatio.trim();
    }

    public String getJournaloperationame() {
        return journaloperationame;
    }

    public void setJournaloperationame(String journaloperationame) {
        this.journaloperationame = journaloperationame == null ? null : journaloperationame.trim();
    }

    public String getJournalremarks() {
        return journalremarks;
    }

    public void setJournalremarks(String journalremarks) {
        this.journalremarks = journalremarks == null ? null : journalremarks.trim();
    }
}