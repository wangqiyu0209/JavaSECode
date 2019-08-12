package com.neuedu.test4;

import java.util.Arrays;

/**
* @ClassName: MultiChoice
* @Description: 多选题类
* @author wqy
* @date 2019年8月12日 下午1:14:43
*
*/
public class MultiChoice extends Question {

	// 选项
	String[] options;
	
	//多选标准答案
	int[] answers;

	// 构造器
	public MultiChoice(String text,String[] options, int[] answers) {
		super(text);
		this.options = options;
		this.answers = answers;
	}

	@Override
	public boolean check(int[] as) {
		// 判断是否为null
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
