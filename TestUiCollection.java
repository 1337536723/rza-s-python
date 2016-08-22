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
		//查找符合条件的子元素
		c.getChildByDescription(selector, "text");
		//查找符合的个数
		c.getChildCount();
	}
}
