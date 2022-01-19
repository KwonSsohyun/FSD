package com.hi;

import java.net.*;
import java.util.Arrays;

public class Ex16 {

	public static void main(String[] args) {
		// <���>
		InetAddress net = null;
		InetAddress[] nets = null;
		
		byte[] arr = {(byte)127, (byte)0, (byte)0, (byte)0};
		
		try {
			// ����̾ �ͼ��� �߻���Ŵ
			
			// �� ��ǻ�� �̸� : LAPTOP-59HI99L2
			//// net = InetAddress.getByName("LAPTOP-59HI99L2");
			//// nets = InetAddress.getAllByName("LAPTOP-59HI99L2");
			///net = InetAddress.getByAddress(arr);
			
			// �� ��ǻ�͸� ����Ű�� IP(�����ڱ� �ڽ�)
			// �ü�� �ڱ� �ڽ����� ���� ���
			// host���� ������ -> C:\Windows\System32\drivers\etc
			////net = InetAddress.getByName("localhost");
			////nets = InetAddress.getAllByName("localhost");
			
			net = InetAddress.getByName("naver.com");
			nets = InetAddress.getAllByName("naver.com");

			//nets = InetAddress.getAllByName("naver.com");
			// �ؿܿ��� ���� IP�����Ҷ� (www)
			// ������ 2���� �ؿܿ� 2���ΰ��� �� �� �ִ�.
			// nets = InetAddress.getAllByName("www.naver.com");
			
			// ������ �̸� �ý���(DNS) 
			// DNS���� (��Ż簡 ��������)
			// �� DNS������ ���ؼ�, ���� ���� IP������ �ּҸ� �˷���
			// naver.com�̶� ������ 223.130.195.95 ������ ����
			// ����DNS���� 8.8.8.8 ���⵵ �Ѵ�.
			// dns 223.130.195.200 -> �������ָ� �������� ġ�� ����
			System.out.println(net.getHostName()); // naver.com
			
			// ���̹� IP������ �ּ� (0~255���� �� byte���ΰ��� | ��� ���)
			// 4����Ʈ �迭�� ��Ÿ���� IP������ �ּҸ� ��Ÿ������
			System.out.println(net.getHostAddress()); // 223.130.195.95
			
			// byte -> 128���ʹ� �ٽ� ���ư��ϱ�
			// ���� IP������ �ּҰ� byte�迭�� ���°���
			byte[] arr1 = net.getAddress();
			System.out.println(Arrays.toString(arr1)); // [-33, -126, -61, 95]
			System.out.println((byte)223);
			System.out.println((byte)130);
			System.out.println((byte)195);
			
			
			// ���̹��� �ϳ��� �����ּҸ� ������ ���� ���� �ƴϴ�.
			// �� ���̹� IP������ �ּ��ΰ��� Ȯ���� �� �ִ�.
			for(int i=0; i<nets.length; i++){
				net = nets[i];
				System.out.println(net.getHostName());
				System.out.println(net.getHostAddress());
			}
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
