Feature: HotelBooking

@Regression1
  Scenario Outline: TC1_Desktop_Hotel_Booking
    Given User launches booking "<URL>" application
    When User click on login then enter "<Username>" and "<password>"
    When User search and select hotel
    When User enter payment deatils and make payment
    Then Vaildate the Booking Id 

    Examples: 
      | URL                                        | Username      | password |
      | https://adactinhotelapp.com/HotelAppBuild2 | SivaTesting29 | 8X6297   |

@Regression2
  Scenario Outline: TC2_Desktop_Hotel_Booking
    Given User launches booking "<URL>" application
    When User click on login then enter "<Username>" and "<password>"
    When User search and select hotel
    When User enter payment deatils and make payment
    Then Vaildate the Booking Id 

    Examples: 
      | URL                                        | Username      | password |
      | https://adactinhotelapp.com/HotelAppBuild2 | SivaTesting29 | 8X6297   |    

 @Sanity
  Scenario Outline: TC4_Desktop_Lufthansa_Booking
    Given User launches booking "<URL>" application

    Examples: 
      | URL                                      |
      | https://www.lufthansa.com/in/en/homepage |
