
Welcome to my experimental Java - Selenium - Cucumber Framework!


So, first things first! Lets go for the requirments...


Requirments:
============

If you want to run the Tests on this Framework you will need:

1.- The latest version of Java Development Kit (jdk), which is at the moment that I wrote is the Ver. jdk1.8.0_211.
	Install it and add it to your Environment Variables under "JAVA_HOME" targeting the folder "C:\Program Files\Java\jdk1.8.0_211".
	
	Note: Usually you should do the same for the Chrome Driver, but the way its implemented this is done automatically, the Driver comes
	with the framework and the framework itself adds the Variables to the Environment Variables.
	
2.- Install the IntelliJ IDE - This is optional, but recommended.

3.- Download all the packages that the POM.xml has - this is usually done automatically if set it at IntelliJ...



How to run the Tests?
=====================

After we have installed all the pre-requisites we should be ready to run our Test Scennarios...

In order to do this, we can open the project with IntelliJ - if installed, if not you can open it with some other IDE too - and
once open you can simple do a right click on the Feature you want to run or even on the Scennario that you want and simply run it, thats it!



Future Plans for the Framework...
=================================

Here are some of my future plans for the Framework:

- Add documentation to every Method / Step - This can be really handy when it comes to others reading the code in order to fully
											 understand what the method does.
											 
- Have it better structured for multiple - different tests from different sites (all in one). 											- DONE

	Note: Bare in mind that this framework is for Tests proposed from companies to see if I can create 
		  Automated Test Cases with Java, Selenium and Cucumber, not for a specific page/project.
		  
- Support API Automation Testing

- Support Performance Testing - Measure the times that takes some of the interactions, then assert against accepted Times.

- Implement Custom Assertions - This can be quite handy as sending on console special messages when some Assertion fails.

- Screenshots Support - Connected to above point, when the Assertions fail take a Screenshot would also be a good thing to have.

- Support for File Reading - Some test could make use of heavy and long CSV files where a LOT of Arguments / Test Scennarios can
							 be and run from.
				
- Property Reader - Can be quite handy, but this would be one of the latest things that I would do since as I mentioned before
					this is not a single project focused Framework and this would make more sense for having different properties
					for different Environments such as Local, Dev, QA, Pre-Production, etc.
		  

		  


