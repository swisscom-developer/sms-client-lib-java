Swisscom SendSms wrapper Example
=====================================

An eclipse project showing the usage of the SmsWrapper.jar

Getting Started
---------------

Download the folder DemoUsingWrapper.
Inside eclipse choose : File/Import/Genaral/Existing project into workspace..
Point the directory chooser to the unpacked zip file.

Choose 'copy file into workspace' (optional).

```java
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
```

    Copy your previously created APi key for SendSMS into SendSmsUsingLib.java 
    Set 'from' to your previously validated mobile number.
    Set 'to' to the mobile number that should receive the message.
    Edit the message... (optional)

Right click SendSmsUsingLib.java and click on 'Run as Java application'

__Note:__ For SendSMS API, the API secret is not used, only the key.
