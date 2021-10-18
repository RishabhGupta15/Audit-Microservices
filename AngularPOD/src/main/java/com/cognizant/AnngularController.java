package com.cognizant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.AuditDetails;
import com.cognizant.model.AuditRequest;
import com.cognizant.model.AuditResponse;
import com.cognizant.model.AuditType;
import com.cognizant.model.QuestionsEntity;
import com.cognizant.model.UserCredentials;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AnngularController {
	
	@Autowired
	private AuthClient authClient;
	@Autowired
	private AuditCheckListProxy auditCheckList;
	@Autowired
	private AuditSeverityProxy auditSeverity;
	
	@PostMapping("/login")
	public Map<String,String> getToken(@RequestBody UserCredentials userCredentials)
	{
		
		Map<String,String> token=new HashMap<>();
		token=authClient.getToken(userCredentials);
		
		token.put("user",userCredentials.getUserId());
		return token;
		
	}
	//@PostMapping("/AuditCheckListQuestions/{auditType}")
	//name= "Authorization",required = true
	/*public ResponseEntity<List<QuestionsEntity>> getQuestions(@RequestHeader("Authorization") String token,@PathVariable("auditType") String auditType)
	{
		List<QuestionsEntity> question=new ArrayList<>();
		AuditType auditTypes=new AuditType(auditType);
		return auditCheckList.getCheckList(token, auditTypes);
		
		
	}*/
	//@PostMapping("/AuditCheckListQuestions/{auditType}")
	//@RequestHeader(name="Authorization",required=true) String token,
	@PostMapping("/AuditCheckListQuestions")
	public ResponseEntity<List<QuestionsEntity>> getCheckList(@RequestHeader(name="Authorization",required=true) String token,@RequestBody AuditType auditType )
	{
		return auditCheckList.getCheckList(token, auditType);
	}
	
	@PostMapping("/ProjectReponseStatus")
	public  AuditResponse getProjectStatus(@RequestHeader(name="Authorization",required=true) String token, @RequestBody AuditRequest auditRequest)
	{
		return auditSeverity.auditSeverity(token, auditRequest).getBody();
	}
	
	
	

}
