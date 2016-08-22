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
		//������󣬵ȴ��´��ڳ���
		o.clickAndWaitForNewWindow(1000);
		//������½�
		o.clickBottomRight();
		//������Ͻ�
		o.clickTopLeft();
		//����
		o.longClick();
		//�϶�
		o.dragTo(100, 100, 10);
		//�϶��������»�
		o.swipeDown(10);
		o.swipeLeft(10);
		//�����ı�
		o.setText("text");
		//����ı�
		o.getText();
		//����ı�
		o.clearTextField();
		//��ö�������
		o.getBounds();
		//��ö�����Ӷ���
		o.getChild(selector);
		//�����һ����������
		o.getChildCount();
		//�������
		o.getClassName();
		//��������ı�
		o.getContentDescription();
		//��ȡ�ֵ���
		o.getFromParent(selector);
		//��ð���
		o.getPackageName();
		//��ÿɼ���ͼ�ķ�Χ
		o.getVisibleBounds();
		//ִ����ָ��������
		PointerCoords touches=new PointerCoords();
		touches.x=100;
		touches.y=100;
		touches.pressure=1;
		touches.size=1;
		o.performMultiPointerGesture(touches);
		//ִ��˫��ָ����
		Point startPoint1=new Point();
		startPoint1.x=100;
		startPoint1.y=100;
		o.performTwoPointerGesture(startPoint1, startPoint1, startPoint1, startPoint1, 10);
		//��С��Ŵ�
		o.pinchIn(50, 10);
		o.pinchOut(50, 10);
		//�ȴ��������
		o.waitForExists(1000);
		//�ȴ�������ʧ
		o.waitUntilGone(1000);
		//�������Ƿ����
		o.exists();
	}
}
