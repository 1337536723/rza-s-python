package com.test;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestUiScrollable extends UiAutomatorTestCase{
	public void TestDemo() throws UiObjectNotFoundException{
		UiSelector selector=new UiSelector();
		selector.scrollable(true);
		UiScrollable s=new UiScrollable(selector);
		//�����ǰ����
		s.flingBackward();
		s.flingForward();
		//��������ʼ�ͽ���
		s.flingToBeginning(5);
		s.flingToEnd(5);
		//��󻬶�������Ĭ��30
		s.getMaxSearchSwipes();
		//�������ɨ������
		s.setMaxSearchSwipes(10);
		//����
		s.scrollBackward();
		s.scrollForward();
		//������������λ��
		s.scrollDescriptionIntoView("text");
		//���ù�������
		s.setAsVerticalList();
		s.setAsHorizontalList();
		
		
	}
}
