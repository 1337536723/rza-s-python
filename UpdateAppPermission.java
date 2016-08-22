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
		//������Settingsλ�ò����
		sc.scrollTextIntoView("Settings");
		clickByText("Settings");
		//������Appsλ�ò����
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
				Log.d("aaa", "������");
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
			//Ĭ�ϵȴ�5��
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
	//ͨ���ı��õ�Ui����
	public UiObject getUiObjByText(String text){
		UiObject o=new UiObject(new UiSelector().text(text));
		return o;
	}
}
