Email email = new Email()

email.subjectLine = "Supply Sanitizers"
email.emailAddress = "avikdeb@gmail.com"
email.sendDate = new Date()
email.content = "Send Avik with more containers of alcohol based hand sanitizers"

// Calling the display method of Email - we run this code to display as desired
// below is when no return
//email.displayContents()

//use below when you have return
println email.displayContents()
