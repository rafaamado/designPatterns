package com.pattern.template;

public class GenerateReportTask {
	private AuditTrail auditTail;

	public GenerateReportTask(AuditTrail auditTail) {
		this.auditTail = auditTail;
	}
	
	public void execute() {
		auditTail.record();
		System.out.println("Generate Report");
	}
	
}
