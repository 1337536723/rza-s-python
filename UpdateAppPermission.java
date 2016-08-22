package com.test;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class UpdateAppPermission extends UiAutomatorTestCase{
	public void testDemo() throws UiObjectNotFoundException{
		UiDevice d=getUiDevice();
		UiScrollable sc=new UiScrollable(new UiSelector().scrollable(true));
		d.pressHome();
		clickByDescription("ALL APPS");
		//滚动到Settings位置并点击
		sc.scrollTextIntoView("Settings");
		clickByText("Settings");
		//滚动到Apps位置并点击
		sc.scrollIntoView(new UiSelector().text("Apps"));
		clickByText("Apps");
		clickByDescription("Advanced");
		clickByText("App permissions");
		List<String> list=new ArrayList<String>();
		list.add("Body sensors");
		list.add("Calendar");
		list.add("Camera");
		list.add("Contacts");
		list.add("Location");
		list.add("Microphone");
		list.add("Phone");
		list.add("SMS");
		list.add("Storage");
		UiScrollable sc2=new UiScrollable(new UiSelector().resourceId("android:id/list"));
		for (int i = 0; i < list.size(); i++) {
			sc.scrollTextIntoView(list.get(i));
			clickByText(list.get(i));
			clickByDescription("More options");
			clickByText("Show system");
			if(!sc2.isScrollable()){
				Log.d("aaa", "进来了");
				while(getUiObjByText("OFF").exists()){
					getUiObjByText("OFF").click();
				}
			}
			if(sc2.isScrollable()){
				while(sc2.scrollTextIntoView("OFF")){
					getUiObjByText("OFF").click();
				}
			}
			d.pressBack();
		}
	}
	public void clickByText(String text){
		UiObject o=new UiObject(new UiSelector().text(text));
		try {
			//默认等待5秒
			o.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void clickByDescription(String desc){
		UiObject o=new UiObject(new UiSelector().description(desc));
		try {
			o.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			e.printStackTrace();
		}
	}
	//通过文本得到Ui对象
	public UiObject getUiObjByText(String text){
		UiObject o=new UiObject(new UiSelector().text(text));
		return o;
	}
}
