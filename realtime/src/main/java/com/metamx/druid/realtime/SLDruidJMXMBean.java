/*
 * Copyright (c) 2013 Streamlyzer, Inc.  All content herein is protected by
 * U.S. copyright and other applicable intellectual property laws and
 * may not be copied without the express permission of Streamlyzer, Inc.,
 * which reserves all rights.  Reuse of any of this content for any
 * purpose without the permission of Streamlyzer, Inc. is strictly
 * prohibited.
 */
package com.metamx.druid.realtime;

public interface SLDruidJMXMBean {

    public String getState(); 
    public void setState(String s);
    public int getLogNum();
    public void setLogNum(int num);
}
