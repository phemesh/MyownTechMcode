
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;



public class Mailer2
{

	    public void send(final String from,final String password,String to[],String sub,String msg){  
	          //Get properties object    
	          Properties props = new Properties();    
	          props.put("mail.smtp.host", "smtp.gmail.com");    
	          props.put("mail.smtp.socketFactory.port", "465");    
	          props.put("mail.smtp.socketFactory.class",    
	                    "javax.net.ssl.SSLSocketFactory");    
	          props.put("mail.smtp.auth", "true");    
	        //  props.put("mail.smtp.port", "465");    
	          //get Session   
	          Session session = Session.getDefaultInstance(props,    
	           new javax.mail.Authenticator() {    
	           protected PasswordAuthentication getPasswordAuthentication() {    
	           return new PasswordAuthentication(from,password);  
	           }    
	          });    
	          //compose message    
	          try {    
	           MimeMessage message = new MimeMessage(session);  
	           
	           InternetAddress[] addressTo = new InternetAddress[to.length];
	             for (int i = 0; i < to.length; i++)
	      		 addressTo[i] = new InternetAddress(to[i]);
	             message.setRecipients(Message.RecipientType .TO, addressTo);
	           message.setSubject(sub);    
	           message.setText(msg);    
	           //send message  
	           
	           
	           
	           Transport.send(message);    
	           System.out.println("message sent successfully");    
	          } catch (MessagingException e) {throw new RuntimeException(e);}    
	             
	    }  
	
	  
	 public static void main(String[] args) {    
	     //from,password,to,subject,message  
		 Mailer2 mc=new Mailer2();
		  String[] to ={"hemeswarpolina@@gmail.com","p.hemesh79@gmail.com"};
	     mc.send("p.hemesh7@gmail.com","9538906134",to,"hello javatpoint","How r u?");  
	     //change from, password and to  
	 }    
	}    