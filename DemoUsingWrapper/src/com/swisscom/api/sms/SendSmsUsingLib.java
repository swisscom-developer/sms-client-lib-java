package com.swisscom.api.sms;

import com.swisscom.api.sms.wrapper.SendSMS;

public class SendSmsUsingLib {
	public static void main(String[] args) {
		
		SendSMS.sendSms(
				"<YOUR_CLIENT_ID_GOES_HERE>", // <- ClientId from DevPortal
				"+41791234567",  // <- from
				"+41797654321",  // <- to
				"Hi from sendSMS(GSMA) called by Java client - Using a library:-)");  // <- message
	
	}
}