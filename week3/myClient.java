import java.io.*;  
import java.net.*;  
public class myClient {  
	public static void main(String[] args) {  
		try{      
			Socket s=new Socket("localhost",6666);  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
			DataInputStream dis=new DataInputStream(s.getInputStream()); 
			dout.writeUTF("HELO");  
			dout.flush();
			String  str=(String)dis.readUTF();
			System.out.println(str);
			dout.writeUTF("BYE"); 
			dout.flush();
			String str1=(String)dis.readUTF();
			System.out.println(str1);
			dout.close();
			s.close();  
		}catch(Exception e){System.out.println(e);}  
	}  
}  
