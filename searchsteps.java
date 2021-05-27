@When("I Type COVID-19 in search bar")

public void i_type_in_search_bar(String string) {

  URL local=new URL("https://www.google.com/")

webdriver driver=new remotewebdriver(local,desiredcapabilities.chrome())



driver.get("https://www.google.com/")

webdriver wait=new WebDriverWait(driver,timespan.Fromeseconds(10))

driver.findelement(By.id("lst-ib")).sendKeys("COVID-19")



}



@When("Click search button")

public void click_search_button() {

driver.findelement(By.name("btnK")).click();

driver.manage().window().maximize()

}



@When("Click News in search result page")

public void click_news_in_search_result_page() {

  // Write code here that turns the phrase above into concrete actions

driver.findelements(By.xpath("//*[@id="hdtb-msb"]/div[1]/div/div[2]").click()

}



@Then("all the news providing agencies show on the search result page")

public void all_the_news_providing_agencies_show_on_the_search_result_page() {

  // Write code here that turns the phrase above into concrete actions



webElement matchingResult=driver.findelement(By.xpath(".//div[@clss='aajZCb']/ul));

List<WebElement> listResult= matchingResult.findElements(By.xpath("//*[@id="hdtb-msb"]/div[1]/div/div[2]"))





for(WebElement results: listResult)

{

String value=results.getText();

System.Out.println(value);



}

}



@Then("Count unique news agencies found in step4 if the count is < 3 print "Missing Leading News Agencies" else print total number of unique news agencies found along with their names.")

public void count_unique_news_agencies_found_in_step4_if_the_count_is_print_else_print_total_number_of_unique_news_agencies_found_along_with_their_names(Integer int1, String string) {

 

 System.Out.println(listResult.size());

if(listResult.size()<3)

{

System.Out.println("Missing Leading News Agencies")}

else

{

String value=results.getText();

System.Out.println(value);

System.Out.println(listResult.size())

}



}

