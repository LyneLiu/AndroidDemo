package com.lyne.activitytest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

//一个专门的集合类：对所有的活动进行管理
public class ActivityCollector {

	public static List<Activity> activities = new ArrayList<Activity>();
	
	public static void addActivity(Activity activity){
		activities.add(activity);
	}
	
	public static void removeActivity(Activity activity){
		activities.remove(activity);
	}
	
	public static void finishAll(){
		for(Activity activity:activities){
			if(!activity.isFinishing()){
				activity.finish();
			}
		}
	}
}
