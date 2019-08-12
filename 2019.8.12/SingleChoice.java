package com.neuedu.test4;

/**
* @ClassName: SingleChoice
* @Description: ��ѡ����
* @author wqy
* @date 2019��8��12�� ����1:16:13
*
*/
public class SingleChoice extends Question {



	// ѡ��
	String[] options;
	
	// �����׼��
	int answer;

	// ������
	public SingleChoice(String text, String[] options, int answer) {
		super(text);
		this.options = options;
		this.answer = answer;
	}

	@Override
	public boolean check(int[] answers) {
		return this.answer == answers[0];
	}
	
	
}
