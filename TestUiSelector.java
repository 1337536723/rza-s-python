package com.test;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestUiSelector extends UiAutomatorTestCase{
	public void TestDemo() throws UiObjectNotFoundException{
		UiSelector s=new UiSelector();
		s.text("Settings");
		//�ı�����
		s.textContains("Set");
		//ƥ������
		s.textMatches("regex");
		s.textStartsWith("text");
		s.description("");
		s.descriptionContains("");
		s.descriptionMatches("");
		s.descriptionStartsWith("");
		s.index(0);
		s.className("");
		s.resourceId("1");
		s.resourceIdMatches("regex");
	}
}
