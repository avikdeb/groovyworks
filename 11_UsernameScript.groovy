// First letter of firstname and whole lastname all in lowercas
String getUserName(String firstName, String lastName) {
  firstName.substring(0,1).toLowerCase() + lastName.toLowerCase()
}

// Run in groovyconsole, if you want to run the test with assert
assert getUserName("Avik", "Deb") == "adeb" : "getUserName isn't working"
println getUserName("Avik", "Deb")
