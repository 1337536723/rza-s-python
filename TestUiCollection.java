package com.test;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestUiCollection extends UiAutomatorTestCase{
	public void TestDemo() throws UiObjectNotFoundException{
		UiSelector selector=new UiSelector();
		selector.text("Settings");
		UiCollection c=new UiCollection(selector);
		//���ҷ�����������Ԫ��
		c.getChildByDescription(selector, "text");
		//���ҷ��ϵĸ���
		c.getChildCount();
	}
}
