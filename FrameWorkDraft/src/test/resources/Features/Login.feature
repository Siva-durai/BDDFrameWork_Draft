Feature: Appliaction Login

  @Sanity
  Scenario Outline: TC1_Desktop_Hotel_Booking
    Given User launches booking "<URL>" application
    When User click on login then enter "<Username>" and "<password>"

    Examples: 
      | URL                                        | Username      | password |
      | https://adactinhotelapp.com/HotelAppBuild2 | SivaTesting29 | U0263Z   |

  @Sanity
  Scenario Outline: TC2_Desktop_Swiss_Booking
    Given User launches booking "<URL>" application

    Examples: 
      | URL                                  |
      | https://www.swiss.com/in/en/homepage |
