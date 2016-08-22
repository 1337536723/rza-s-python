package com.test;

import java.io.File;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiWatcher;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestUiDevice extends UiAutomatorTestCase{
	public void TestDemo() throws UiObjectNotFoundException,Exception{
		UiDevice d=getUiDevice();
		
		//�ļ�������/data/local/temp
		d.dumpWindowHierarchy("layout.xml");
		d.pressHome();
		//����ı�(��һ������)
		d.clearLastTraversedText();
		//�����һ��������ı�
		d.getLastTraversedText();
		d.click(100,100);
		d.drag(100, 100, 200, 100, 10);
		//��õ�ǰ����
		d.getCurrentPackageName();
		//�����ʾ�߶�
		d.getDisplayHeight();
		//�����ʾ���
		d.getDisplayWidth();
		//��ò�Ʒ����
		d.getProductName();
		//��ֹ��ת
		d.freezeRotation();
		//������ת
		d.unfreezeRotation();
		//�Ƿ�����Ȼ��ת
		d.isNaturalOrientation();
		d.setOrientationLeft();
		d.setOrientationRight();
		d.setOrientationNatural();
		//����
		d.sleep();
		//����
		d.wakeUp();
		//�����Ļ״̬
		d.isScreenOn();
		//�ȴ���ǰӦ�ó����ڿ���״̬
		d.waitForIdle(1000);
		//�ȴ��������ݸ����¼��ķ���
		d.waitForWindowUpdate("packageName", 1000);
		//ע�������
		d.registerWatcher("name", new UiWatcher() {
			
			@Override
			public boolean checkForCondition() {
				// TODO Auto-generated method stub
				return false;
			}
		});
		//�Ƴ�������
		d.removeWatcher("name");
		//���ü�����
		d.resetWatcherTriggers();
		//ǿ���������м�����
		d.runWatchers();
		//����Ƿ��м�����������
		d.hasAnyWatcherTriggered();
		//���ĳ���������Ƿ񴥷���
		d.hasWatcherTriggered("watcherName");
		//����
		File f=new File("/data/local/tmp/aaa.png");
		d.takeScreenshot(f);
		//������Ļ
		d.swipe(100, 100, 100, 200, 10);
		//��֪ͨ��
		d.openNotification();
		//�򿪿�������
		d.openQuickSettings();

	}
}
