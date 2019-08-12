package com.neuedu.test4;

/**
* @ClassName: SingleChoice
* @Description: 单选题类
* @author wqy
* @date 2019年8月12日 下午1:16:13
*
*/
public class SingleChoice extends Question {



	// 选项
	String[] options;
	
	// 单项标准答案
	int answer;

	// 构造器
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
