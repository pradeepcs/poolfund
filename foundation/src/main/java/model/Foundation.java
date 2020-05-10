package model;

import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Set;

public class Foundation {

    @Id
    protected String id;

    protected String name;

    protected Set<String> tenants;

    protected boolean isDeleted;

    protected List<DocumentAudit> audits;
}
