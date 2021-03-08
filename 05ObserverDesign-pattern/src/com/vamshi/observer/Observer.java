package com.vamshi.observer;

public interface Observer {
	 // method to update the observer, used by subject
    public void update();

    // attach with subject to observe, not required, but, added so that the
    //  observer can query the subject to see if an update has occurred
    public void setSubject(Subject sub);

}
