package com.vamshi.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternate implements Internate {
	private Internate internate = new RealInternate();

    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("whatever.com");
        bannedSites.add("nope.com");
        bannedSites.add("yup.com");
        bannedSites.add("hello.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        internate.connectTo(serverhost);
    }

	

	

}
