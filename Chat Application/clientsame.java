import java.io.*;
import java.net.*;
 
class clientsame{
	public static void main(String[] args){
		try{
			Socket s = new Socket("localhost",1201);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String msgin = "",msgout = "";

			while(!msgin.equals("End")){
				msgout = br.readLine();
				dout.writeUTF(msgout);
				msgin = din.readUTF();
				System.out.println("Server says : "+msgin);
			}

		}catch(Exception e){
			//handle exceptions here
		}
	}
}
