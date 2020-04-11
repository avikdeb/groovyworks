// First letter of firstname and whole lastname all in lowercas
String getUserName(String firstName, String lastName) {
  firstName.substring(0,1).toLowerCase() + lastName.toLowerCase()
}

// Run in groovyconsole, if you want to run the test with assert
assert getUserName("Avik", "Deb") == "adeb" : "getUserName isn't working"

void printCredential(cred) {
  println "Username is ${cred}"
}
String[] firstNames = ["Avik", "Asha", "Malik", "Swaswati"]
String[] lastNames = ["Deb", "Shivashankar ", "Muheem", "Goswami"]
for(int i=0; i<firstNames.size(); i++) {
  printCredential(getUserName(firstNames[i], lastNames[i]))
}
