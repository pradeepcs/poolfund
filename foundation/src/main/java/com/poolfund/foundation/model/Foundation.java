package com.poolfund.foundation.model;

import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Set;

public class Foundation {

    @Id
    protected String id;

    protected String name;

    protected Set<String> infoDomain;

    protected boolean isDeleted;

    protected List<DocumentAudit> audits;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getInfoDomain() {
        return infoDomain;
    }

    public void setInfoDomain(Set<String> infoDomain) {
        this.infoDomain = infoDomain;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public List<DocumentAudit> getAudits() {
        return audits;
    }

    public void setAudits(List<DocumentAudit> audits) {
        this.audits = audits;
    }
}
