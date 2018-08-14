package com.css.interfaces;

import com.css.entity.TaskInfo;


import java.util.HashMap;
import java.util.List;


public interface TaskInfoInterface {
   public   List<TaskInfo> findFullTaskInfo(HashMap<String, String> hashMap);
   public   List<TaskInfo> findFailedTaskInfo(HashMap<String, String> hashMap);
   public   List<TaskInfo> findRunningTaskInfo(HashMap<String, String> hashMap);
   public   List<TaskInfo> findNotRunningTaskInfo(HashMap<String, String> hashMap);
   public   List<TaskInfo> findWaitingTimeTaskInfo(HashMap<String, String> hashMap);
   public   List<TaskInfo> findWaitingResourceTaskInfo(HashMap<String, String> hashMap);
}
