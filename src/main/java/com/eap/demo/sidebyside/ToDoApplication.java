package com.eap.demo.sidebyside;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/* By Extending this class with the Application, we are declaring the RESTful web service. 
 * This new subclass is used to also define the base URI for the web service  with the @ApplicationPath annotation */

@ApplicationPath("/api")
public class ToDoApplication extends Application {

}
