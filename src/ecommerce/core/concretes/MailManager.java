package ecommerce.core.concretes;

import ecommerce.core.abstracts.MailService;

public class MailManager implements MailService{

	@Override
	public void verificationMessage(String message) {
		System.out.println("Doðrulama mesajý gönderildi");
		
		
	}

	
	
	
}
