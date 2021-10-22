package testcases;

import org.testng.annotations.Test;

import base.LearnBaseClassService;
import pages.ServiceNowHomePage;
import pages.VerifyCreateIncident;

public class CreateIncidet  extends LearnBaseClassService{
  @Test
/*  Then Close the frame is open
  When New frame opens
  Given Enter the captured incident number in the search number
  When Details is displayed capture the Incident number displayed
  Then verify the incident is created
*/
  public void runCreateIncidet() {
  new ServiceNowHomePage(driver)
  .click_Incident()
  .clickAll()
.frameOpens()
.clickNew()
.clickCaller()
.frameCloses()
.windowOpen()
.clickName()
.windowClose()
.frameOpens()
.description("Testleaf")
 .capture_Inc()
 .click_submit()
 .frameCloses()
 .frameOpens()
 .incident_Search(incidentNum)
 .captureIncident_Search()
 .verify_Incident(incidentNum) ;
  
  
  }
}
