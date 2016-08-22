package com.test;

import java.io.File;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiWatcher;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestUiDevice extends UiAutomatorTestCase{
	public void TestDemo() throws UiObjectNotFoundException,Exception{
		UiDevice d=getUiDevice();
		
		//文件保存在/data/local/temp
		d.dumpWindowHierarchy("layout.xml");
		d.pressHome();
		//清除文本(上一次输入)
		d.clearLastTraversedText();
		//获得上一次输入的文本
		d.getLastTraversedText();
		d.click(100,100);
		d.drag(100, 100, 200, 100, 10);
		//获得当前包名
		d.getCurrentPackageName();
		//获得显示高度
		d.getDisplayHeight();
		//获得显示宽度
		d.getDisplayWidth();
		//获得产品名称
		d.getProductName();
		//禁止旋转
		d.freezeRotation();
		//允许旋转
		d.unfreezeRotation();
		//是否是自然旋转
		d.isNaturalOrientation();
		d.setOrientationLeft();
		d.setOrientationRight();
		d.setOrientationNatural();
		//锁屏
		d.sleep();
		//唤醒
		d.wakeUp();
		//检查屏幕状态
		d.isScreenOn();
		//等待当前应用程序处于空闲状态
		d.waitForIdle(1000);
		//等待窗口内容更新事件的发生
		d.waitForWindowUpdate("packageName", 1000);
		//注册监听器
		d.registerWatcher("name", new UiWatcher() {
			
			@Override
			public boolean checkForCondition() {
				// TODO Auto-generated method stub
				return false;
			}
		});
		//移除监听器
		d.removeWatcher("name");
		//重置监听器
		d.resetWatcherTriggers();
		//强制运行所有监听器
		d.runWatchers();
		//检查是否有监听器触发过
		d.hasAnyWatcherTriggered();
		//检查某个监听器是否触发过
		d.hasWatcherTriggered("watcherName");
		//截屏
		File f=new File("/data/local/tmp/aaa.png");
		d.takeScreenshot(f);
		//滑动屏幕
		d.swipe(100, 100, 100, 200, 10);
		//打开通知栏
		d.openNotification();
		//打开快速设置
		d.openQuickSettings();

	}
}
