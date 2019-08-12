package com.neuedu.test4;

import java.util.Arrays;

/**
* @ClassName: MultiChoice
* @Description: ��ѡ����
* @author wqy
* @date 2019��8��12�� ����1:14:43
*
*/
public class MultiChoice extends Question {

	// ѡ��
	String[] options;
	
	//��ѡ��׼��
	int[] answers;

	// ������
	public MultiChoice(String text,String[] options, int[] answers) {
		super(text);
		this.options = options;
		this.answers = answers;
	}

	@Override
	public boolean check(int[] as) {
		// �ж��Ƿ�Ϊnull
		if(answers != null && as.length == answers.length) {
			Arrays.sort(as);
			for(int i=0;i<as.length;i++) {
				if(as[i] != answers[i]) {
					return false;
				}
				
			}
		}
		return true;		
	}
}
