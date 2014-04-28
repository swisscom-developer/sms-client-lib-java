package com.swisscom.api.sms;

import com.swisscom.api.sms.wrapper.SendSMS;

public class SendSmsUsingLib {
	public static void main(String[] args) {
		
		SendSMS.sendSms(
				"<YOUR_CLIENT_ID_GOES_HERE", 
				"+41791544781", 
				"+41791544781", 
				"Hi from sendSMS(GSMA) called by Java client - Using a library:-)");
	
	}
}
