Feature:

When I go to the google search page and search for "COVID-19",I expect to see some news reference in result summery.

Scenario:

Given: I have gone to the "https://www.google.com/"

When I Type "COVID-19" in search bar

And Click search button

And Click News in search result page

Then all the news providing agencies show on the search result page

And Count unique news agencies found in step4 if the count is < 3 print "Missing Leading News Agencies" else print total number of unique news agencies found along with their names.
