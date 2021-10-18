package com.cognizant;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.model.AuditRequest;
import com.cognizant.model.AuditResponse;
import com.cognizant.model.AuditDetails;


@FeignClient(url="${fos.severity}",name="audit-severity")
public interface AuditSeverityProxy {
	
	@PostMapping("/ProjectExecutionStatus")
	public ResponseEntity<AuditResponse> auditSeverity(@RequestHeader(name = "Authorization",required = true)String token,@RequestBody AuditRequest request);
	
	@PostMapping("/test")
	public AuditRequest getTest(@RequestHeader(name = "Authorization",required = true)String token,@RequestBody AuditRequest auditRequest);
}
