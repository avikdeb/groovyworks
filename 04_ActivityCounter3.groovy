def completedActivities = 0
def totalActivities = 10

completedActivities = completedActivities + 5

// println "You have completed $completedActivities activities today."
println "You have completed ${completedActivities+1} activities today including sign-on."
//totalActivities = totalActivities - completedActivities
// short hand notation of the above - assignment and arithmetic operator combined
totalActivities -= completedActivities
println "You now have $totalActivities activities remaining."
