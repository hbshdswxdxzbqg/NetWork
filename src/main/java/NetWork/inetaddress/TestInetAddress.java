package NetWork.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("www.heiyan.com");
			System.out.println(address);
		} catch (UnknownHostException e) {
			System.out.println("could not find www.baidu.com");
		}
		
		System.out.println("-------------");
		try {
			InetAddress address = InetAddress.getByName("118.178.217.144");
			System.out.println(address.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("-----------");
		try {
			InetAddress[] addresses = InetAddress.getAllByName("www.heiyan.com");
			for (InetAddress inetAddress : addresses) {
				System.out.println(inetAddress);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
