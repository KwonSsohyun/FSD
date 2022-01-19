package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex07 extends Frame {
	
	public Ex07(){
		// GridBagLayout
		GridBagLayout layout = new GridBagLayout();
		Panel p = new Panel();
		p.setLayout(layout);
		
		
		// GridBagConstraints
		// �갡 �Ӽ��� �� ������ ���� (���۷�Ʈ�� ���� �Ӽ���)
		GridBagConstraints gbc = new GridBagConstraints();
		// ȭ�鿡 ������ ����
		gbc.fill = GridBagConstraints.BOTH; 
		// BOTH       >> �����¿� ��� ��ä��
		// VERTICAL   >> ���θ� ������ ���δ� ������
		// HORIZONTAL >> ���δ� ������ ���δ� ����
		// �̰��� ���ؼ��� ����ġ�� �ο��ؾ� �Ѵ�. �� .weightx | .weighty
		
		// ������ǥ
		gbc.gridx = 0;
		// ������ǥ
		gbc.gridy = 0;
		// ���μ��� ũ������
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		///////////////////////////////////////////////////////////////////////////////////////
		// ����ġ�� �����Ϸ��� �ʹ� �Ӹ��� ������.
		// ����ġ�� .weightx �� 1.0 | .weighty �� 1.0 ���� �ְ�
		// �Ʒ��� ��ư ���� ������ .gridwidth �� ���� | .gridheight �� ���� �� �����Ѵ�.
		// �ٸ�, �̷��� �Ϸ��� ù�� ����, ���δ� ���� �����ϸ� �ȵȴ�. 
		// �� ù�� ����,���θ� ������ �����ٺ��ʹ� �����ص� �������
		//   �ٵ� �� ù�� ����,���θ� �����ϰ� �ʹٸ�, �� ������Ʈ�� �־ �ϴ� �ļ��� �ִ�.
		
		// ����ġ = ���� 
		// ���� â �������� 100% ���߸�ŭ ���´�.
		// ����ġ�� ��� ȭ�� ������ ���´�. �� .fill
		// 0.25�� ���� ����ؾߵǼ� �ʹ� �Ӹ� ������ �� 1.0!!!
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		///////////////////////////////////////////////////////////////////////////////////////
		
		
		// ��ư ��ǥ�� �׸��� ����� (��ġ��)
		// 1��° ĭ
		Button btn1 = new Button();
		// ����ġ�� �ָ� ������ �þ�¸�ŭ �����׵� ������ �ش�.
		gbc.weightx = 2.0;
		p.add(btn1, gbc);
		Button btn2 = new Button();
		gbc.weightx = 1.0;
		// ���ڹ��̷� ������ �� ��
		// x�� ���� | y�� ����
		gbc.gridx = 1;
		p.add(btn2, gbc);
		Button btn3 = new Button();
		gbc.gridx = 2;
		p.add(btn3, gbc);
		Button btn4 = new Button();
		gbc.gridx = 3;
		p.add(btn4, gbc);
		
		// 2��° ĭ
		Button btn5 = new Button();
		gbc.gridx = 0;
		gbc.gridy = 1;
		p.add(btn5, gbc);
		Button btn6 = new Button();
		gbc.gridx = 1;
		gbc.gridheight = 2;
		p.add(btn6, gbc);
		Button btn7 = new Button();
		gbc.gridx = 2;
		// x������ ���η� �о�� �ϴϱ�. 
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		p.add(btn7, gbc);
		
		// 3��° ĭ
		Button btn8 = new Button();
		gbc.gridx = 0;
		gbc.gridy = 2;
		// �̰� �ø��鼭 ������� ����� �ʱ�ȭ����
		gbc.gridwidth = 1;
		p.add(btn8, gbc);
		Button btn9 = new Button();
		gbc.gridx = 2;
		gbc.gridy = 2;
		p.add(btn9, gbc);
		Button btn10 = new Button();
		gbc.gridx = 3;
		gbc.gridy = 2;
		p.add(btn10, gbc);
		
		
		
		add(p);
		setLocation(200,200);
		setSize(400,300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Ex07();

	}

}
