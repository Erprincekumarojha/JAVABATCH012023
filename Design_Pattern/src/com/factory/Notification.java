package com.factory;

import java.util.List;

public interface Notification {

   public void sendNotification(List<String> users, String message);
}
