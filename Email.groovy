class Email {

  //Attributes of Email
  String subjectLine
  String emailAddress
  Date sendDate
  String content

  // Method to display the Attributes - def when not returning string
  //def displayContents() {
  String displayContents() {
    //println "Subject: ${subjectLine} \nAddress: ${emailAddress} \nDate: ${sendDate} \nSummary: ${content}"
    // Good to return a string to the caller - note mention of 'return' is not required
    "Subject: ${subjectLine} \nAddress: ${emailAddress} \nDate: ${sendDate} \nSummary: ${content}"
  }
}
