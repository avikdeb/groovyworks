class Email0 {

  //Attributes of Email
  String subjectLine
  String emailAddress
  Date sendDate
  String content

  // Method to display the Attributes - def when not returning string
  def displayContents() {
    println "Subject: ${subjectLine} \nAddress: ${emailAddress} \nDate: ${sendDate} \nSummary: ${content}"
  }
}
