QA Engineer_NPW_Assignement

Please submit your design notes & code modules at https://github.com. Interview discussion will be around
the decisions you made and why.

Your assignment is to design & build an automation test suite to make sure the att.com home page is loading
without any issues and the page is loaded as per the page configuration in CMS. The page configuration in
CMS can be accessed using the API - https://www.att.com/msapi/idp-contentorchestration/
v1/idpcms/sales/uf/homepage.

You need to use Katalon to build the automation test suite.

Please make sure we are able to download the code from github and run tests in Katalon.

PLEASE NOTE: The assignment is purposefully kept open to understand the thinking process of the
interviewee. You needn’t automate

Test Case Design Notes:

Intially the Test Cases scripts are to open a browser and navigate to the att.com home page URL, then maximize the window as the webpage opens in tablet window size.

Test Cases/TC_001_Verfiy_Home_Page_Load

Verify att.com "home page" is loading without any issues, wait for the page load and compare the page properties such as Window Title with the expected Window Title, Element present and attribute value with the CMS configuration API.

Test Cases/TC_002_Verify_Headband_Component

Verify the "headband" component objects and their CTA, with the CMS configuration API values.

Test Cases/TC_003_Verify_Alert_Banner

Verify the "alertbanner911" is not visible in the home page of att.com.

Test Cases/TC_004_Verify_Card_Component

Verify the "valuecards" component text, attributes and values are as per the CMS configuration API values.

Had some issues in automating and verifying the card images becasue they shift positions on every load, and so I have used Verify Element Visible method in my script.

Test Cases/TC_005_Verify_Link

Verify few links and their CTA, with the CMS configuration API values.

Test Cases/TC_006_Verify_Menu

Verify if Menu elements are visible in the att.com home page.


Defects:

Test Cases/TC_002_Verify_Headband_Component

Under "headband" component for element "Internet" there is difference actual and expected "href" values when compared with the CMS configuration API.

Difference between actual object 'https://www.att.com/internet/' and expected object 'https://www.att.com/internet/fiber/'

Test Cases/TC_005_Verify_Link

There is difference between actual and expected "href" value for a "Learn more" link  when compared with the CMS configuration API.

Difference between actual object 'https://www.att.com/offers/discount-program/appreciation/' and expected object 'https://www.att.com/wireless/offers/discount-program/appreciation/'