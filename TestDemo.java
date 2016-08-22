package com.test;

import java.io.File;

import android.util.Log;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiWatcher;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestDemo extends UiAutomatorTestCase{
	public void testDemo() throws UiObjectNotFoundException,Exception{
		final UiDevice d=getUiDevice();
		File f1=new File("/data/local/tmp/aaa.png");
		File f2=new File("/data/local/tmp/12:12.png");
		d.takeScreenshot(f1);
		d.takeScreenshot(f2);

		d.pressHome();
		/*
		d.registerWatcher("aaa", new UiWatcher() {
			
			@Override
			public boolean checkForCondition(){
				String info="Unfortunately, Settings has stopped.";
				UiObject o=new UiObject(new UiSelector().text(info));
				if(o.exists()){
					o=new UiObject(new UiSelector().text("OK"));
						try {
							o.click();
						} catch (UiObjectNotFoundException e) {
							e.printStackTrace();
						}	
				}
				return true;
			}
		});
		
		d.pressHome();
		sleep(1000);
		UiObject o=new UiObject(new UiSelector().text("Call"));
		o.click();
		o=new UiObject(new UiSelector().description("Dial pad"));
		if(o.exists()){
			o.click();
		}
		o=new UiObject(new UiSelector().resourceId("com.android.dialer:id/digits"));
		o.setText("*#*#4636#*#*");
		o=new UiObject(new UiSelector().text("Wi-Fi information"));
		o.click();
		o=new UiObject(new UiSelector().text("Wi-Fi API"));
		o.click();
		o=new UiObject(new UiSelector().text("disableNetwork"));
		o.click();
		o=new UiObject(new UiSelector().className("android.widget.EditText"));
		o.setText("a");
		o=new UiObject(new UiSelector().text("Ok"));
		o.click();
		//找不到这个对象，就会触发watcher
		o=new UiObject(new UiSelector().text("hh"));
		o.click();
		*/
	}
}
