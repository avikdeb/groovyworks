int opportunityOne = 1000
int opportunityTwo = 2000
int opportunityThree = 3000
int opportunityFour = 4000
int opportunityFive = 5000
int totalOpportnity = 0

// Create a groovy list
List opportunities = [opportunityOne, opportunityTwo, opportunityThree, opportunityFour, opportunityFive]

// Iterate through the loop
int count = 0
while(count < opportunities.size) {
  println "Found an opportunity of ${opportunities[count]}"
  totalOpportnity += opportunities[count]
  println "Total opportunity is now ${totalOpportnity}"
  count++
}
