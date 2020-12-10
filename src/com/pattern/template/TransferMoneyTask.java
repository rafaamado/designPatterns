package com.pattern.template;

public class TransferMoneyTask extends Task {
	
	public TransferMoneyTask(AuditTrail auditTrail) {
		super(auditTrail);
	}
	
	public TransferMoneyTask() {
		super();
	}
	
	@Override
	protected void doExecute() {
		System.out.println("Transfer Money");
	}
}
