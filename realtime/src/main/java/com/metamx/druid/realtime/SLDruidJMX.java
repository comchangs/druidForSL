/*
 * Copyright (c) 2013 Streamlyzer, Inc.  All content herein is protected by
 * U.S. copyright and other applicable intellectual property laws and
 * may not be copied without the express permission of Streamlyzer, Inc.,
 * which reserves all rights.  Reuse of any of this content for any
 * purpose without the permission of Streamlyzer, Inc. is strictly
 * prohibited.
 */
package com.metamx.druid.realtime;

import javax.management.AttributeChangeNotification;
import javax.management.MBeanNotificationInfo;
import javax.management.NotificationBroadcasterSupport;

public class SLDruidJMX 
//    extends NotificationBroadcasterSupport
        implements SLDruidJMXMBean {
    /*
     * ATTRIBUTES ACCESSIBLE FOR MANAGEMENT BY A JMX AGENT
     */

    private static String state = "initial state";
    public static int LogNum = 0;

    /* it does not provide any specific constructors.
     * However, it is JMX compliant with regards to
     * contructors because the default contructor provided by the Java compiler is public.
     */

    /*
     * IMPLEMENTATION OF THE MessageFrontMBean INTERFACE
     */

    public String getState() {
        return state;
    }

    public void setState(String s) {
        state = s;
    }

    public int getLogNum() {
        return LogNum;
    }

    public void setLogNum(int num) {
        LogNum = num;
    }

}
