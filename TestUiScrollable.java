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
		//向后向前滚动
		s.flingBackward();
		s.flingForward();
		//滑动都开始和结束
		s.flingToBeginning(5);
		s.flingToEnd(5);
		//最大滑动次数，默认30
		s.getMaxSearchSwipes();
		//设置最大扫动次数
		s.setMaxSearchSwipes(10);
		//滚动
		s.scrollBackward();
		s.scrollForward();
		//滚动到描述的位置
		s.scrollDescriptionIntoView("text");
		//设置滚动方向
		s.setAsVerticalList();
		s.setAsHorizontalList();
		
		
	}
}
