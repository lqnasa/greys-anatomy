package com.googlecode.greysanatomy.console.rmi.req;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/**
 * ���ʻػ�
 *
 * @author chengtongda
 */
public class GaSession implements Serializable {
    private static final long serialVersionUID = -8271465701431818048L;

    private static transient final AtomicLong seq = new AtomicLong();

    private final long sessionId;

<<<<<<< HEAD
    private Set<String> jobIds = new HashSet<String>();
=======
    private Set<Integer> jobIds = new HashSet<Integer>();
>>>>>>> pr/8

    private boolean isAlive = true;

    private long lastModified = System.currentTimeMillis();

    public GaSession() {
        this.sessionId = seq.incrementAndGet();
    }

    public GaSession(long sessionId) {
        this.sessionId = sessionId;
    }

    public long getSessionId() {
        return sessionId;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

<<<<<<< HEAD
    public Set<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(Set<String> jobIds) {
=======
    public Set<Integer> getJobIds() {
        return jobIds;
    }

    public void setJobIds(Set<Integer> jobIds) {
>>>>>>> pr/8
        this.jobIds = jobIds;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

}
