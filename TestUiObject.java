package com.test;

import android.graphics.Point;
import android.view.MotionEvent.PointerCoords;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestUiObject extends UiAutomatorTestCase{
	public void TestDemo() throws UiObjectNotFoundException{
		UiSelector selector=new UiSelector();
		UiObject o=new UiObject(selector);
		o.click();
		//点击对象，等待新窗口出现
		o.clickAndWaitForNewWindow(1000);
		//点击右下角
		o.clickBottomRight();
		//点击左上角
		o.clickTopLeft();
		//长按
		o.longClick();
		//拖动
		o.dragTo(100, 100, 10);
		//拖动对象向下滑
		o.swipeDown(10);
		o.swipeLeft(10);
		//设置文本
		o.setText("text");
		//获得文本
		o.getText();
		//清除文本
		o.clearTextField();
		//获得对象坐标
		o.getBounds();
		//获得对象的子对象
		o.getChild(selector);
		//获得下一级子类数量
		o.getChildCount();
		//获得类名
		o.getClassName();
		//获得描述文本
		o.getContentDescription();
		//获取兄弟类
		o.getFromParent(selector);
		//获得包名
		o.getPackageName();
		//获得可见试图的范围
		o.getVisibleBounds();
		//执行手指触控手势
		PointerCoords touches=new PointerCoords();
		touches.x=100;
		touches.y=100;
		touches.pressure=1;
		touches.size=1;
		o.performMultiPointerGesture(touches);
		//执行双手指手势
		Point startPoint1=new Point();
		startPoint1.x=100;
		startPoint1.y=100;
		o.performTwoPointerGesture(startPoint1, startPoint1, startPoint1, startPoint1, 10);
		//缩小或放大
		o.pinchIn(50, 10);
		o.pinchOut(50, 10);
		//等待对象出现
		o.waitForExists(1000);
		//等待对象消失
		o.waitUntilGone(1000);
		//检查对象是否存在
		o.exists();
	}
}
