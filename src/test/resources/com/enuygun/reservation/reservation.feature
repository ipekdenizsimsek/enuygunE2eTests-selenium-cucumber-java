Feature: Ticket Reservation

  Scenario Outline: Create reservation for tickets
    Given A user navigates to enuygun website
    And user searches for depart "<departAirport>" and selects
    And user searches for destination "<destinationAirport>" and selects
    And user selects dates
    And clicks ucuz bilet bul button
    And selects flights for both ways
    When i enter my mail "<mail>" my cellphone "<cellphone>" my first name "<firstname>" my lastname "<lastname>" my public id "<publicId>" my healthcode "<healthcode>"
    And click odemeye ilerle
    Then system creates a reservation

    Examples:
      | departAirport | destinationAirport | mail | cellphone | firstname | lastname | publicId | healthcode |
      | Sabiha       | Adnan Menderes      |  ipekdenizsimsek@gmail.com     | 5454770700     | ipek deniz      | simsek      | 41272650210      | N6X6-5321-16 |
      | Istanbul       | Adnan Menderes      |  ipekdenizsimsek@gmail.com     | 5454770700     | ipek deniz      | simsek      | 41272650210      | N6X6-5321-16 |


  Scenario Outline: Create reservation for tickets with invalid public id
    Given A user navigates to enuygun website
    And user searches for depart "<departAirport>" and selects
    And user searches for destination "<destinationAirport>" and selects
    And user selects dates
    And clicks ucuz bilet bul button
    And selects flights for both ways
    When i enter my mail "<mail>" my cellphone "<cellphone>" my first name "<firstname>" my lastname "<lastname>" my public id "<publicId>" my healthcode "<healthcode>"
    And click odemeye ilerle
    Then system shows invalid "<invalidParam>" message

    Examples:
      | departAirport | destinationAirport | mail | cellphone | firstname | lastname | publicId | healthcode | invalidParam |
      | Sabiha       | Adnan Menderes      |  ipekdenizsimsek@gmail.com     | 5454770700     | ipek deniz      | simsek      | 41272650210      | INVA-LIDH-ES | healthcode |
      | Sabiha       | Adnan Menderes      |  ipekdenizsimsek@gmail.com     | 5454770700     | ipek deniz      | simsek      | 41272650219      | N6X6-5321-16 | publicid |
