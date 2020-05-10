package model;

import java.time.LocalDateTime;

public class DocumentAudit {

    protected String createdBy;

    protected LocalDateTime createdTs;

    protected String modifiedBy;

    protected LocalDateTime modifiedTs;

    protected String reason;
}
