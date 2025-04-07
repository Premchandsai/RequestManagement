package com.gdc.request_management.entity;

import com.gdc.request_management.enums.RequestStatus;
import com.gdc.request_management.enums.UpdatedBy;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "request_status_log", schema = "gdc-db")
public class RequestHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    @Column(nullable = false)
    private Long requestId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RequestStatus status;

    @Column(nullable = false)
    private LocalDateTime timestamp = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UpdatedBy updatedBy;

    public Long getLogId() { return logId; }
    public void setLogId(Long logId) { this.logId = logId; }
    public Long getRequestId() { return requestId; }
    public void setRequestId(Long requestId) { this.requestId = requestId; }
    public RequestStatus getStatus() { return status; }
    public void setStatus(RequestStatus status) { this.status = status; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
    public UpdatedBy getUpdatedBy() { return updatedBy; }
    public void setUpdatedBy(UpdatedBy updatedBy) { this.updatedBy = updatedBy; }
}